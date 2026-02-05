# Add project specific ProGuard rules here.
# ComboLite 插件混淆规则

# 保留插件入口类
-keep class * implements com.combo.core.api.IPluginEntryClass {
    *;
}

# 保留插件Activity
-keep class * extends com.combo.core.api.IPluginActivity {
    *;
}

# 保留Compose相关
-dontwarn androidx.compose.**
