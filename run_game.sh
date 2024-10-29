#!/bin/bash
echo "Jafet"
mkdir -p Jafet_absir_labb
cp *.java Jafet_absir_labb/
cd Jafet_absir_labb
echo "Running program from $(pwd)"
echo "compiling..."
javac *.java
echo "Running game..."
java GuessingGame
echo "done"
echo "Removing class files..."
rm *.class
ls
