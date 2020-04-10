object Versions {
    val kotlin = "1.3.71"
    val espresso = "3.2.0"
    val junit = "4.12"
    val constraintlayout = "1.1.3"
    val appcompat = "1.1.0"
    val core_ktx = "1.2.0"

    val compileSdkVersion = "29"
    val minSdkVersion = "21"
    val targetSdkVersion = "29"
    val versionCode = "1"
    val versionName = "1.0"
    val build_gradle="3.6.2"
}

object Deps {
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val junit = "junit:junit:4.12:${Versions.junit}"
    val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
}