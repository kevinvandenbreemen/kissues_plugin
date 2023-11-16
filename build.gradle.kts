plugins {
    kotlin("jvm") version "1.8.21"
}

group = "com.vandenbreemen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {

    val kttVersion = "1.0.1.1000"
    implementation("com.github.kevinvandenbreemen:ktt:$kttVersion")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}