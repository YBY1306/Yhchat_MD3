# ComboLite 集成指南

## 方案：将ComboLite作为本地模块引入

由于ComboLite还没有发布到Maven仓库，我们将其作为本地模块引入。

### 步骤1：复制ComboLite核心库

```bash
# 将ComboLite核心模块复制到项目根目录
cp -r ComboLite-master/ComboLite-master/comboLite-core ./comboLite-core
```

### 步骤2：在settings.gradle.kts中引入模块

```kotlin
include(":app")
include(":comboLite-core")  // 添加这行
```

### 步骤3：在app/build.gradle.kts中添加依赖

```kotlin
dependencies {
    implementation(project(":comboLite-core"))
    // ... 其他依赖
}
```

### 步骤4：修改CanaryApplication

### 步骤5：创建代理组件

### 步骤6：配置插件加载

详细步骤请参考 ComboLite 官方文档。
