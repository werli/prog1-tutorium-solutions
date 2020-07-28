#!/bin/bash

gradle_files="gradle build.gradle gradlew gradlew.bat"
help_message="Create a zip file for exercises. If added, parameter should be one of {1,2,3,4,all}."


function zip_exercise_1() {
    echo "Creating solution for exercise 1"
    zip -r prog1_tut_solutions_1.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{01,02,03,04,05,06,07} $gradle_files > /dev/null
}

function zip_exercise_2() {
    echo "Creating solution for exercise 2"
    zip -r prog1_tut_solutions_2.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{08,09,10,11,12} $gradle_files > /dev/null
}

function zip_exercise_3() {
    echo "Creating solution for exercise 3"
    zip -r prog1_tut_solutions_3.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{13,14,15,16} $gradle_files > /dev/null
}

function zip_exercise_4() {
    echo "Creating solution for exercise 4"
    zip -r prog1_tut_solutions_4.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{17,18,19,20,21} $gradle_files > /dev/null
}

function zip_exercise_5() {
    echo "Creating solution for exercise 5"
    zip -r prog1_tut_solutions_5.zip src/main/java/de/uni_passau/fim/prog1/tutorium/aufgabe{22,23,24} $gradle_files > /dev/null
}

function zip_all_exercises() {
    echo "Creating solution for all exercises"
    zip -r prog1_tut_solutions_all.zip src $gradle_files > /dev/null
}

if [[ "$1" == "" ]]; then
    zip_exercise_1
    zip_exercise_2
    zip_exercise_3
    zip_exercise_4
    zip_exercise_5
    zip_all_exercises
elif [[ "$1" == "1" ]]; then
    zip_exercise_1
elif [[ "$1" == "2" ]]; then
    zip_exercise_2
elif [[ "$1" == "3" ]]; then
    zip_exercise_3
elif [[ "$1" == "4" ]]; then
    zip_exercise_4
elif [[ "$1" == "5" ]]; then
    zip_exercise_5
elif [[ "$1" == "all" ]]; then
    zip_all_exercises
else
    echo $help_message
fi
