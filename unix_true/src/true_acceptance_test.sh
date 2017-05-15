#!/usr/bin/env bash
#true command represents command success & returns 0.

status=0
javac ./production/TrueKata.java
java -cp ./production/ TrueKata

if [ $status -eq $? ];
then
        echo "true command exit with success"
fi
