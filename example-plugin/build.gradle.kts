plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.yhchat.plugin.example"
    compileSdk = 36
    
    defaultConfig {
        minSdk = 21
        targetSdk = 36
        
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
    
    buildFeatures {
        compose = true
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    
    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    // ComboLite核心库 - 使用compileOnly（由宿主提供）
    compileOnly("io.github.lnzz123:combolite-core:2.0.0")
    
    // Koin依赖注入 - 使用compileOnly（由宿主提供）
    compileOnly("io.insert-koin:koin-core:4.0.0")
    compileOnly("io.insert-koin:koin-android:4.0.0")
    
    // Compose相关（compileOnly，由宿主提供）
    val composeBom = platform("androidx.compose:compose-bom:2024.09.00")
    compileOnly(composeBom)
    compileOnly("androidx.compose.ui:ui")
    compileOnly("androidx.compose.material3:material3")
    compileOnly("androidx.compose.ui:ui-tooling-preview")
    compileOnly("androidx.lifecycle:lifecycle-runtime-ktx:2.9.3")
    compileOnly("androidx.activity:activity-compose:1.8.0")
    
    // 测试依赖
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
}
