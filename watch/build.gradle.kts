plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.yhchat.canary"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.yhchat.canary"
        applicationIdSuffix=".watch"
        minSdk = 36
        targetSdk = 36
        // versionCode = 0
        versionName = null

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }

    //由于app模块中的部分代码位于flavorDimensions中，无法移除app模块的flavorDimensions，导致这里也要添加一遍，不添加一遍的话会报错
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
//        // 手表没必要用这个
//        create("withLive") {
//            dimension = "player"
//            buildConfigField("boolean", "WITH_PLAYER", "false")
//            buildConfigField("boolean", "WITH_LIVE", "true")
//        }
    }
}

dependencies {
    implementation(project(":app"))
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.compose.material3)

    // Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
    // 图片加载
    implementation(libs.coil.compose)
    implementation(libs.coil.gif)
    implementation(libs.coil.svg) // SVG支持
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