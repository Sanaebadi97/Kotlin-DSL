// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(Deps.build_gradle)
        classpath(Deps.kotlin_stdlib)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

//here is so important

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
