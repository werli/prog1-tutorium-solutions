#!/bin/bash

gradle_files="gradle build.gradle gradlew gradlew.bat"
help_message="Create a zip file for exercises. If added, parameter should be one of {1,2,3,4,all}."


function zip_exercise_1() {
    echo "Creating solution for exercise 1"
    zip -r tutorium_1_lsg.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{01,02,03,04,05,06,07} $gradle_files > /dev/null
}

function zip_exercise_2() {
    echo "Creating solution for exercise 2"
    zip -r tutorium_2_lsg.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{08,09,10,11,12} $gradle_files > /dev/null
}

function zip_exercise_3() {
    echo "Creating solution for exercise 3"
    zip -r tutorium_3_lsg.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{13,14,15,16} $gradle_files > /dev/null
}

function zip_exercise_4() {
    echo "Creating solution for exercise 4"
    zip -r tutorium_4_lsg.zip src/main/java/de/uni_passau/fim/prog1/tutorium/klausurvorbereitung $gradle_files > /dev/null
}

function zip_all_exercises() {
    echo "Creating solution for all exercises"
    zip -r tutorium_all_lsg.zip src $gradle_files > /dev/null
}

if [[ "$1" == "" ]]; then
    zip_exercise_1
    zip_exercise_2
    zip_exercise_3
    zip_exercise_4
    zip_all_exercises
elif [[ "$1" == "1" ]]; then
    zip_exercise_1
elif [[ "$1" == "2" ]]; then
    zip_exercise_2
elif [[ "$1" == "3" ]]; then
    zip_exercise_3
elif [[ "$1" == "4" ]]; then
    zip_exercise_4
elif [[ "$1" == "all" ]]; then
    zip_all_exercises
else
    echo $help_message
fi
