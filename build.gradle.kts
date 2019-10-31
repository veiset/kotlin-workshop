import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.3.50"
}

group = "no.bekk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
}

application {
    mainClassName = "no.bekk.kotlinworkshop.Task1Kt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += listOf("-XXLanguage:+InlineClasses")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = application.mainClassName
    }
    from (
        configurations.runtime.get().map {
            if (it.isDirectory) it else zipTree(it)
        }
    )
}