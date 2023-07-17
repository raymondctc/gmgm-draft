buildscript {
    dependencies {
        classpath(libs.plugin.sqldelight.gradle)
    }
}

plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version(libs.versions.pluginGradle).apply(false)
    id("com.android.library").version(libs.versions.pluginGradle).apply(false)
    kotlin("android").version(libs.versions.kotlin).apply(false)
    kotlin("multiplatform").version(libs.versions.kotlin).apply(false)
    id("org.jetbrains.compose").apply(false)
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
