Kotlin FullStack Demo
=====================

Spring WebFlux Kotlin fullstack example with Kotlin/JS for frontend instead of JavaScript or TypeScript.

### Front end

*  Kotlin/JS for frontend instead of JavaScript or TypeScript

### Back end

* Spring WebFlux

### Share

* Shared objects

### Native

* Native Debug for IntelliJ: https://plugins.jetbrains.com/plugin/12775-native-debug-for-intellij

# Unit test with Java
Please include following in your build.gradle.kts. JUnit 5 not support yet.

```
 sourceSets {
 
       getByName("jvmTest").apply {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.12")
            }
        }
 } 
```

# IntelliJ IDEA Ultra Edition Integration

* Change run & build to Gradle

# References

* Kotlin multiplatform support http://kotlinlang.org/docs/reference/multiplatform.html
* Project Source: https://github.com/sdeleuze/spring-kotlin-fullstack
