plugins {
    java
    kotlin("jvm") version libs.versions.kotlin
    alias(libs.plugins.pluginYml)
}

group = "dev.masmc05"
version = "0.0.0"


allprojects {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/") {
            name = "papermc-repo"
        }
    }
}

dependencies {
    compileOnly(libs.paperApi)
    library(kotlin("stdlib"))
    library(libs.bundles.cloud)
    library(libs.kotlinJson)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

paper {
    apiVersion = "1.21"
    author = "masmc05"
    description = "A basic bazaar plugin for mass selling and purchasing different kind of items."

    main = "dev.masmc05.baseBazaar.BaseBazaar"
    bootstrapper = "dev.masmc05.baseBazaar.BazaarBoot"
    loader = "dev.masmc05.baseBazaar.BazaarBoot"

    generateLibrariesJson = true
}
