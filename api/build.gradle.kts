plugins {
    id("java")
}

group "ru.ikar_x"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":db"))
    implementation(project(":service"))
}