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

    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "6.3"
    distributionType = Wrapper.DistributionType.ALL
}