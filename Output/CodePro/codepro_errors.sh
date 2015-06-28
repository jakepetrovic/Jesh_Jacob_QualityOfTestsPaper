#!/bin/bash
SEARCH_FOLDER="Output/CodePro/*"
COUNT=0

for f in $(find $SEARCH_FOLDER -name '*.java');
do
GREP=$(grep -c "@Test" $f)
COUNT=$((COUNT + GREP))
done

echo $COUNT
COUNT=0

for f in $(find $SEARCH_FOLDER -name '*.java');
do
GREP=$(grep -c "// add additional test code here" $f)
COUNT=$((COUNT + GREP))
done

echo $COUNT
COUNT=0

for f in $(find $SEARCH_FOLDER -name '*.java');
do
GREP=$(grep -c "Unsupported major.minor version 51.0" $f)
COUNT=$((COUNT + GREP))
done

echo $COUNT