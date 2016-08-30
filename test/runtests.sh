#!/usr/bin/env bash

# create bin directory if it doesn't exist
if [ ! -d "../bin" ]
then
    mkdir ../bin
fi

# delete output from previous run
if [ ! -d "../actual.txt" ]
then
    rm actual.txt
fi

# compile the code into the bin folder
javac -cp ../src -Xlint:none -d ../bin ../src/seedu/addressbook/Main.java

# run the program, feed commands from input.txt file and redirect the output to the actual.txt
java -classpath ../bin seedu.addressbook.Main < input.txt > actual.txt

# compare the output to the expected output
diff actual.txt expected.txt
if [ $? -eq 0 ]
then
    echo "Test result: PASSED"
else
    echo "Test result: FAILED"
fi