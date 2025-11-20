#!/bin/bash

ANTLR_JAR="./antlr-4.13.2-complete.jar"

rm -rf antlr_generated build
mkdir -p antlr_generated build

java -Xmx500M -cp "$ANTLR_JAR:$CLASSPATH" org.antlr.v4.Tool -o ./antlr_generated ./tiger.g4
javac -cp "$ANTLR_JAR:$CLASSPATH" ./antlr_generated/*.java -d ./build
javac -cp "$ANTLR_JAR:./build:$CLASSPATH" Main.java -d ./build
java -cp "$ANTLR_JAR:./build:$CLASSPATH" Main "$1"
