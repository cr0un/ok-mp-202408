plugins {
    kotlin("jvm") apply false
}

group = "ru.kotlin.otuskotlin.marketplace"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}
