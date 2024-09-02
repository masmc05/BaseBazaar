plugins {
    java
    `maven-publish`
}

dependencies {
    compileOnly(libs.paperApi)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}