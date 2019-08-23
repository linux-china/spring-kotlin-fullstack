plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}

kotlin {

    macosX64("native") {
        binaries {
            executable()
        }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "5.6"
    distributionType = Wrapper.DistributionType.ALL
}