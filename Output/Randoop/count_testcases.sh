for SEARCH_FOLDER in *
do
echo "Searching $SEARCH_FOLDER..."
COUNT=0
for f in $(find $SEARCH_FOLDER -name '*.java'); 
do
TEMP=$(grep -o "public void" $f | wc -w)
#echo 'Counting testcases from ' $f 'which is ' $TEMP
COUNT=$((COUNT + TEMP))

done
CURRENT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo 'Total number of test cases from ' $SEARCH_FOLDER ': '  $COUNT >> randoop_results.txt
done