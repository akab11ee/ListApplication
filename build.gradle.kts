buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
        classpath(Deps.gradle)
        classpath(Deps.kotlinPlugin)
        classpath(Deps.hiltPlugin)
    }
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}
