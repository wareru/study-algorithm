plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "study.algorithm"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotest.runner.junit5)
    testImplementation(libs.kotest.assertions.core)
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}
