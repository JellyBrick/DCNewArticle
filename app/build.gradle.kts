plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.20"

    // Apply the application plugin to add support for building a CLI application in Java.
    application

    id("org.jmailen.kotlinter") version "3.12.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-stdlib-jdk8")
    implementation(group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version = "1.6.4")

    // DC API
    implementation(group = "be.zvz", name = "KotlinInside", version = "1.14.6")

    implementation(group = "org.apache.commons", name = "commons-lang3", version = "3.12.0")
    implementation(group = "org.apache.commons", name = "commons-text", version = "1.10.0")
    implementation(group = "club.minnced", name = "discord-webhooks", version = "0.8.2")

    implementation(group = "com.coreoz", name = "wisp", version = "2.3.0")
    implementation(group = "com.cronutils", name = "cron-utils", version = "9.2.0")

    implementation(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = "2.14.0")
    implementation(group = "com.fasterxml.jackson.module", name = "jackson-module-kotlin", version = "2.14.0")
    implementation(group = "com.fasterxml.jackson.module", name = "jackson-module-blackbird", version = "2.14.0")

    implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.4.4")
    implementation(group = "org.fusesource.jansi", name = "jansi", version = "1.18")

    implementation(group = "com.squareup.okhttp3", name = "okhttp-jvm", version = "5.0.0-alpha.10")
    implementation(group = "com.squareup.okhttp3", name = "okhttp-brotli", version = "5.0.0-alpha.10")

    implementation(group = "org.jsoup", name = "jsoup", version = "1.15.3")
    implementation(group = "org.apache.tika", name = "tika-core", version = "2.6.0")
}

application {
    // Define the main class for the application.
    mainClass.set("be.zvz.dcnewarticle.AppKt")
}
