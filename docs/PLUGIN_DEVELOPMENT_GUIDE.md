# 📱 云湖应用插件开发指南

## 🎯 快速开始

### 1. 访问插件管理
```
打开应用 → 我的 → 设置 → 关于 → 插件管理
```

### 2. 查看示例插件
项目已包含一个示例插件模块：`example-plugin`

## 🔌 插件架构

```
云湖应用 (宿主)
├── comboLite-core (插件化框架)
├── app (主应用)
│   ├── CanaryApplication (已集成插件支持)
│   ├── BaseActivity (已支持插件Activity)
│   └── plugin/
│       ├── HostProxyActivity (代理Activity)
│       ├── HostProxyService1 (代理Service)
│       └── HostProxyService2 (代理Service)
└── example-plugin (示例插件)
    ├── ExamplePluginEntry (插件入口)
    ├── ExamplePluginScreen (插件UI)
    └── ExamplePluginActivity (插件Activity)
```

## 📝 创建自定义插件

### 步骤1：创建插件模块
```bash
# Android Studio: File → New → New Module → Android Library
# 模块名: my-custom-plugin
```

### 步骤2：配置build.gradle.kts
```kotlin
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.yhchat.plugin.mycustom"
    compileSdk = 36
    defaultConfig {
        minSdk = 21
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    compileOnly(project(":comboLite-core"))
    // 其他依赖使用 compileOnly
}
```

### 步骤3：创建插件入口
```kotlin
package com.yhchat.plugin.mycustom

import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class MyPluginEntry : IPluginEntryClass {
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        // 插件加载时的初始化逻辑
    }
    
    override fun onUnload() {
        // 插件卸载时的清理逻辑
    }
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return { MyPluginScreen() }
    }
}
```

### 步骤4：配置AndroidManifest.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <application>
        <meta-data
            android:name="PLUGIN_NAME"
            android:value="我的插件" />
        <meta-data
            android:name="PLUGIN_ENTRY_CLASS"
            android:value="com.yhchat.plugin.mycustom.MyPluginEntry" />
        <meta-data
            android:name="PLUGIN_VERSION_CODE"
            android:value="1" />
        <meta-data
            android:name="PLUGIN_VERSION_NAME"
            android:value="1.0.0" />
    </application>
</manifest>
```

### 步骤5：在settings.gradle.kts中引入
```kotlin
include(":my-custom-plugin")
```

## 🎨 插件UI开发

### 使用Jetpack Compose
```kotlin
@Composable
fun MyPluginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("我的插件界面")
        Button(onClick = { /* 功能 */ }) {
            Text("插件功能按钮")
        }
    }
}
```

### 使用Material3组件
所有Material3组件都可以在插件中使用，因为它们通过宿主提供。

## 🔐 安全与权限

### 当前配置
- **签名校验**: `ValidationStrategy.Insecure` (开发模式)
- **权限控制**: 默认允许所有操作

### 生产环境配置
修改 `CanaryApplication.kt`：
```kotlin
PluginManager.setValidationStrategy(ValidationStrategy.Strict)
```

## 🐛 调试

### 查看日志
```bash
adb logcat | grep -E "CanaryApp|ExamplePlugin|ComboLite"
```

### 常见问题
1. **插件加载失败** → 检查meta-data配置
2. **Activity启动失败** → 确认代理Activity已注册
3. **资源找不到** → 确认插件使用compileOnly依赖

## 📊 性能优化

- 插件按需加载，不影响启动速度
- 卸载后立即释放内存
- 支持并行加载多个插件

## 🎁 示例场景

### 场景1：主题插件
创建动态换肤插件，无需重启即可切换主题

### 场景2：功能扩展插件
为聊天添加新功能（如翻译、贴纸包）

### 场景3：第三方机器人插件
让第三方开发者为你的应用开发机器人插件

## 📞 技术支持

- **ComboLite官方文档**: `ComboLite-master/docs/`
- **示例代码**: `example-plugin/`
- **官方GitHub**: https://github.com/lnzz123/ComboLite

---

**集成完成！现在你的应用已经是一个完整的插件化应用了！** 🎉
