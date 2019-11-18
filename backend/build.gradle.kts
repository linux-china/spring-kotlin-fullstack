import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("org.springframework.boot") version "2.2.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

repositories {
    mavenCentral()
    maven("https://repo.spring.io/milestone")
}

dependencies {
    val coroutinesVersion = "1.3.2"
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:$coroutinesVersion")
    implementation(project(":shared"))
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs =
                listOf("-Xjsr305=strict", "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
    }
    processResources {
        dependsOn(":frontend:browserWebpack")
        from(project(":frontend").projectDir.resolve("src/main/resources")) {
            into("static")
        }
        from(project(":frontend").buildDir.resolve("distributions/frontend-1.0.0-SNAPSHOT.js")) {
            into("static")
        }
    }
}
