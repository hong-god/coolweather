plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.coolweather.android"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.coolweather.android"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // LitePal（数据库）
    implementation("org.litepal.guolindev:core:3.2.3")

    // OkHttp（网络请求）
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // Gson（JSON解析）
    implementation("com.google.code.gson:gson:2.10.1")

    // Glide（图片加载）
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
}