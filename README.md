# Kotlin-DSL
Migrating build logic from Groovy to KotlinM
Gradle 5.0 has been released with lots of features and especially with the support of production-ready Kotlin DSL 

n this Video I’ll be sharing with you the process I’ve followed to migrate Gradle

build scripts from Groovy to Kotlin DSL in one of my Android side projects

1.Update to Gradle Wrapper 5.0 or higher



2.Fix ALL String quotes -> single quotes to double quotes ctrl+shift+R

⚠️ Dont forget the settings.gradle file


3.change all space to () or = () -> function () / property =


4.Respect patterns -> 
apply plugin: "com.android.application" to plugins {
    id("com.android.application")


5.Conversion ->  rename build.gradle files from xx.gradle to xx.gradle.kts  -> settings.gradle files to settings.gradle.kts 

./gradlew tasks

6.change release to getByName(String) / minifyEnabled to isMinifyEnabled / fileTree to fileTree(Map<String, ?> args)

run ./gradlew tasks


checked !

lets start the last step !


7.create buildSrc dir -> build.gradle.kts 


migrate from groovy to Kotlin DSL DONE !


