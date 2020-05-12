[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/FrozenAlex/JavaPractice) 

# JavaPractice

## How to run
To run any of the examples go into any of directories and run
```bash
gradle run --console=plain
```

To test the project run 
```bash
gradle test
```

## New project creation

To create a new project create a new folder and run `gradle init` and select needed options.

My example:
```
mkdir hw1
cd hw1
gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Swift
Enter selection (default: Java) [1..5] 3

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit 4) [1..4] 1

Project name (default: hw1): 
Source package (default: hw1): 
```