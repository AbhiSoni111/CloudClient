plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jetbrains.compose") version "1.2.2"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

val ktor_Version: String by project

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("io.ktor:ktor-client-core:$ktor_Version")
    implementation("io.ktor:ktor-client-cio:$ktor_Version")
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}
