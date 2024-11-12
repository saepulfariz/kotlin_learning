# KOTLIN LEARNING

## install Kotlin compiler

- https://kotlinlang.org/docs/command-line.html
- https://github.com/JetBrains/kotlin/releases/tag/v2.0.21
- https://github.com/JetBrains/kotlin/releases/download/v2.0.21/kotlin-compiler-2.0.21.zip
- Unzip the standalone compiler into a directory and optionally add the bin directory to the system path. The bin directory contains the scripts needed to compile and run Kotlin on Windows, macOS, and Linux.
- kotlin -version (info: kotlinc-jvm 2.0.21 (JRE 11.0.2+9))

## run file kotlin

- kotlinc App.kt -include-runtime -d App.jar && java -jar App.jar
