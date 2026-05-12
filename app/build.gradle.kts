import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    id("com.google.protobuf") version "0.9.5"
}

android {
    namespace = "com.yhchat.canary"
    compileSdk = 36
    val baseVersionName = "21.6"
    val ciVersionNameSuffix = providers.gradleProperty("ciVersionNameSuffix").orNull
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
    val resolvedVersionName = ciVersionNameSuffix?.let { "$baseVersionName-$it" } ?: baseVersionName

    val signingProps = Properties()
    val signingPropsFile = rootProject.file("keystore.properties")
    if (signingPropsFile.exists()) {
        signingPropsFile.inputStream().use { signingProps.load(it) }
    }

    fun signingValue(key: String): String? =
        signingProps.getProperty(key)?.takeIf { it.isNotBlank() }
            ?: System.getenv(key)?.takeIf { it.isNotBlank() }

    val releaseStoreFilePath = signingValue("CANARY_STORE_FILE") ?: "C:/Users/admin/Videos/canary.jks"
    val releaseStorePassword = signingValue("CANARY_STORE_PASSWORD")
    val releaseKeyAlias = signingValue("CANARY_KEY_ALIAS")
    val releaseKeyPassword = signingValue("CANARY_KEY_PASSWORD")
    val hasReleaseSigning = releaseStorePassword != null && releaseKeyAlias != null && releaseKeyPassword != null

    defaultConfig {
        applicationId = "com.yhchat.canary"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = resolvedVersionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    if (hasReleaseSigning) {
        signingConfigs {
            create("release") {
                storeFile = file(releaseStoreFilePath)
                storePassword = releaseStorePassword
                keyAlias = releaseKeyAlias
                keyPassword = releaseKeyPassword
            }
        }
    }

    buildTypes {
        release {
            if (hasReleaseSigning) {
                signingConfig = signingConfigs.getByName("release")
            }
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions += "player"

    productFlavors {
        create("standard") {
            dimension = "player"
            buildConfigField("boolean", "WITH_PLAYER", "false")
            buildConfigField("boolean", "WITH_LIVE", "false")
        }
        create("withPlayer") {
            dimension = "player"
            buildConfigField("boolean", "WITH_PLAYER", "true")
            buildConfigField("boolean", "WITH_LIVE", "false")
        }
        create("withLive") {
            dimension = "player"
            buildConfigField("boolean", "WITH_PLAYER", "false")
            buildConfigField("boolean", "WITH_LIVE", "true")
        }
        create("withAll") {
            dimension = "player"
            buildConfigField("boolean", "WITH_PLAYER", "true")
            buildConfigField("boolean", "WITH_LIVE", "true")
        }
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}

kotlin {
    jvmToolchain(21)
}

ksp {
    arg("room.schemaLocation", "$projectDir/schemas")
    arg("room.incremental", "true")
    arg("room.expandProjection", "true")
    arg("ksp.incremental", "true")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:4.28.3"
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                create("java") {
                    option("lite")
                }
                create("kotlin") {
                    option("lite")
                }
            }
        }
    }
}

dependencies {
    add("withPlayerImplementation", project(":player"))
    add("withLiveImplementation", project(":live"))
    add("withAllImplementation", project(":player"))
    add("withAllImplementation", project(":live"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation("androidx.lifecycle:lifecycle-process:2.8.7")
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.material:material:1.6.8")

    implementation(libs.reorderable)

    implementation("androidx.documentfile:documentfile:1.0.1")
    
    // 网络请求
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)
    implementation(libs.gson)
    
    // 图片加载
    implementation(libs.coil.compose)
    implementation(libs.coil.gif)
    implementation("io.coil-kt:coil-svg:2.5.0") // SVG支持

    implementation("androidx.media:media:1.7.0")
    
    // 权限处理
    implementation("com.google.accompanist:accompanist-permissions:0.32.0")
    
    // WebDAV 客户端
    implementation("com.github.thegrizzlylabs:sardine-android:0.8") {
        exclude(group = "xpp3", module = "xpp3")
        exclude(group = "xmlpull", module = "xmlpull")
    }
    
    // Compose Rich Text - Markdown 渲染
    implementation("com.halilibo.compose-richtext:richtext-ui-material3:0.17.0")
    implementation("com.halilibo.compose-richtext:richtext-commonmark:0.17.0")
    implementation(libs.jetbrains.markdown)

    implementation(libs.ksoup.html)
    
    // HTML 文本渲染支持
    implementation("androidx.compose.ui:ui-text-google-fonts")
    
    // Protobuf - 只使用Lite版本避免冲突
    implementation("com.google.protobuf:protobuf-javalite:4.28.3")
    implementation("com.google.protobuf:protobuf-kotlin-lite:4.28.3")
    
    // 导航
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)
    
    // Security - 使用Android官方的安全存储方案
    implementation("androidx.security:security-crypto:1.1.0-alpha06")
    
    // Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // Hilt Navigation for Compose (needed for hiltViewModel)
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // QR Code Scanning
    implementation(libs.zxing.android.embedded)
    implementation(libs.zxing.core)
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}
