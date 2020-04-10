import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    jcenter()
}

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.3.71"
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
