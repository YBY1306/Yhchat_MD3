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
        minSdk = 21
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
}