import Versions.targetSdkVersion
import Versions.versionCode
import Versions.versionName

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}



android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = "info.sanaebadi.kotlindsl"
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    implementation(fileTree("dir" to "libs", "include" to listOf("*.jar")))
    implementation(Deps.kotlin_stdlib)
    implementation(Deps.appcompat)
    implementation(Deps.core_ktx)
    implementation(Deps.constraint_layout)
    testImplementation(Deps.junit)
}
