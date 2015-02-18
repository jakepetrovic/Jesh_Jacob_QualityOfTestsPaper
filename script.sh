#!/bin/sh 
rm Output/time.txt

###########################################################
###########################################################
###########################################################
#########################EVOSUITE##########################
###########################################################
###########################################################
###########################################################
#########################diebierse#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/49_diebierse/diebierse.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite diebierse Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_diebierse1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_diebierse1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/49_diebierse/diebierse.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite diebierse Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_diebierse2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_diebierse2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/49_diebierse/diebierse.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite diebierse Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_diebierse3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_diebierse3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/49_diebierse/diebierse.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite diebierse Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_diebierse4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_diebierse4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/49_diebierse/diebierse.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite diebierse Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_diebierse5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_diebierse5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################lavalamp#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/55_lavalamp/lavalamp.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite LavaLamp Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lavalamp1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lavalamp1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/55_lavalamp/lavalamp.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite LavaLamp Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lavalamp2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lavalamp2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/55_lavalamp/lavalamp.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite LavaLamp Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lavalamp3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lavalamp3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/55_lavalamp/lavalamp.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite LavaLamp Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lavalamp4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lavalamp4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/55_lavalamp/lavalamp.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite LavaLamp Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lavalamp5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lavalamp5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################inspirento#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/17_inspirento/inspirento.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Inspirento Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_inspirento1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_inspirento1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/17_inspirento/inspirento.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Inspirento Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_inspirento2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_inspirento2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/17_inspirento/inspirento.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Inspirento Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_inspirento3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_inspirento3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/17_inspirento/inspirento.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Inspirento Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_inspirento4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_inspirento4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/17_inspirento/inspirento.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Inspirento Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_inspirento5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_inspirento5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################netweaver#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/101_netweaver/netweaver.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite NetWeaver Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_netweaver1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_netweaver1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/101_netweaver/netweaver.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite NetWeaver Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_netweaver2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_netweaver2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/101_netweaver/netweaver.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite NetWeaver Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_netweaver3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_netweaver3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/101_netweaver/netweaver.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite NetWeaver Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_netweaver4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_netweaver4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/101_netweaver/netweaver.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite NetWeaver Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_netweaver5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_netweaver5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################jnfe#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/6_jnfe/jnfe.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jnfe Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jnfe1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jnfe1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/6_jnfe/jnfe.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jnfe Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jnfe2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jnfe2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/6_jnfe/jnfe.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jnfe Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jnfe3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jnfe3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/6_jnfe/jnfe.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jnfe Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jnfe4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jnfe4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/6_jnfe/jnfe.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jnfe Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jnfe5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jnfe5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################saxpath#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/24_saxpath/saxpath.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Saxpath Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_saxpath1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_saxpath1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/24_saxpath/saxpath.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Saxpath Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_saxpath2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_saxpath2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/24_saxpath/saxpath.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Saxpath Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_saxpath3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_saxpath3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/24_saxpath/saxpath.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Saxpath Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_saxpath4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_saxpath4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/24_saxpath/saxpath.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite Saxpath Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_saxpath5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_saxpath5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################jniinchi#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/25_jniinchi/jniinchi.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jniinchi Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jniinchi1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jniinchi1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/25_jniinchi/jniinchi.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jniinchi Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jniinchi2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jniinchi2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/25_jniinchi/jniinchi.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jniinchi Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jniinchi3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jniinchi3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/25_jniinchi/jniinchi.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jniinchi Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jniinchi4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jniinchi4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/25_jniinchi/jniinchi.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jniinchi Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jniinchi5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jniinchi5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################jsecurity#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/18_jsecurity/jsecurity.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jsecurity Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jsecurity1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jsecurity1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/18_jsecurity/jsecurity.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jsecurity Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jsecurity2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jsecurity2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/18_jsecurity/jsecurity.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jsecurity Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jsecurity3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jsecurity3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/18_jsecurity/jsecurity.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jsecurity Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jsecurity4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jsecurity4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/18_jsecurity/jsecurity.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite jsecurity Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_jsecurity5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_jsecurity5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################xisemele#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/31_xisemele/xisemele.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite xisemele Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_xisemele1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_xisemele1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/31_xisemele/xisemele.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite xisemele Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_xisemele2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_xisemele2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/31_xisemele/xisemele.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite xisemele Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_xisemele3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_xisemele3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/31_xisemele/xisemele.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite xisemele Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_xisemele4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_xisemele4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/31_xisemele/xisemele.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite xisemele Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_xisemele5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_xisemele5
rm -r evosuite-report/
rm -r evosuite-tests/

#########################lagoon#########################
STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/52_lagoon/lagoon.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite lagoon Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lagoon1
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lagoon1
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/52_lagoon/lagoon.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite lagoon Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lagoon2
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lagoon2
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/52_lagoon/lagoon.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite lagoon Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lagoon3
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lagoon3
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/52_lagoon/lagoon.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite lagoon Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lagoon4
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lagoon4
rm -r evosuite-report/
rm -r evosuite-tests/

STARTTIME=$(date +"%s")
java -jar SF110/lib/evosuite.jar -generateSuite -target SF110/52_lagoon/lagoon.jar
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "EvoSuite lagoon Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt

cp -r evosuite-report/ Output/EvoSuite-Mutation/report_lagoon5
cp -r evosuite-tests/ Output/EvoSuite-Generation/test_lagoon5
rm -r evosuite-report/
rm -r evosuite-tests/

###########################################################
###########################################################
###########################################################
##########################MAJOR############################
###########################################################
###########################################################
###########################################################
#Remove EvoSuite
SEARCH_FOLDER="Output/EvoSuite-Generation/*"

for f in $(find $SEARCH_FOLDER -name '*.java'); 
do echo 'Removing @RunWith(EvoSuiteRunner.class) from  ' $f  
sed -i -e "/@RunWith(EvoSuiteRunner.class)/d" $f ; 
done

for f in $(find $SEARCH_FOLDER -name '*.java');
do echo 'Removing @RunWith(EvoSuiteRunner.class) from  ' $f
sed -i -e "/import org.evosuite.junit.EvoSuiteRunner;/d" $f ;
done

for f in $(find $SEARCH_FOLDER -name '*.java'); 
do echo 'Removing @RunWith(EvoSuiteRunner.class) from  ' $f  
sed -i -e "/import org.evosuite.Properties.SandboxMode;/d" $f ; 
done

for f in $(find $SEARCH_FOLDER -name '*.java'); 
do echo 'Removing @RunWith(EvoSuiteRunner.class) from  ' $f  
sed -i -e "/import org.evosuite.sandbox.Sandbox;/d" $f ; 
done



#########################saxpath#########################
rm -r Major/saxpath_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_saxpath1/* Major/saxpath_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/saxpath_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Saxpath Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_evosuite/results.csv Output/Major/saxpath/evosuite1.csv

rm -r Major/saxpath_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_saxpath2/* Major/saxpath_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/saxpath_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Saxpath Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_evosuite/results.csv Output/Major/saxpath/evosuite2.csv

rm -r Major/saxpath_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_saxpath3/* Major/saxpath_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/saxpath_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Saxpath Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_evosuite/results.csv Output/Major/saxpath/evosuite3.csv

rm -r Major/saxpath_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_saxpath4/* Major/saxpath_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/saxpath_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Saxpath Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_evosuite/results.csv Output/Major/saxpath/evosuite4.csv

rm -r Major/saxpath_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_saxpath5/* Major/saxpath_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/saxpath_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Saxpath Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_evosuite/results.csv Output/Major/saxpath/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/saxpath_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro Saxpath Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpathcodepro/results.csv Output/Major/saxpath/codepro

STARTTIME=$(date +"%s")
cd Major/saxpath_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual Saxpath Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/saxpath_manual/results.csv Output/Major/saxpath/manual

#########################inspirento#########################
rm -r Major/inspirento_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_inspirento1/* Major/inspirento_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/inspirento_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Inspirento Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_evosuite/results.csv Output/Major/inspirento/evosuite1.csv

rm -r Major/inspirento_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_inspirento2/* Major/inspirento_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/inspirento_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Inspirento Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_evosuite/results.csv Output/Major/inspirento/evosuite2.csv

rm -r Major/inspirento_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_inspirento3/* Major/inspirento_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/inspirento_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Inspirento Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp  Major/inspirento_evosuite/results.csv Output/Major/inspirento/evosuite3.csv

rm -r Major/inspirento_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_inspirento4/* Major/inspirento_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/inspirento_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Inspirento Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_evosuite/results.csv Output/Major/inspirento/evosuite4.csv

rm -r Major/inspirento_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_inspirento5/* Major/inspirento_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/inspirento_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Inspirento Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_evosuite/results.csv Output/Major/inspirento/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/inspirento_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro Inspirento Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_codepro/results.csv Output/Major/inspirento/codepro

STARTTIME=$(date +"%s")
cd Major/inspirento_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual Inspirento Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/inspirento_manual/results.csv Output/Major/inspirento/manual

#########################lavalamp#########################
rm -r Major/lavalamp_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lavalamp1/* Major/lavalamp_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lavalamp_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Lavalamp Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_evosuite/results.csv Output/Major/lavalamp/evosuite1.csv

rm -r Major/lavalamp_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lavalamp2/* Major/lavalamp_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lavalamp_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Lavalamp Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_evosuite/results.csv Output/Major/lavalamp/evosuite2.csv

rm -r Major/lavalamp_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lavalamp3/* Major/lavalamp_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lavalamp_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Lavalamp Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_evosuite/results.csv Output/Major/lavalamp/evosuite3.csv

rm -r Major/lavalamp_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lavalamp4/* Major/lavalamp_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lavalamp_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Lavalamp Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_evosuite/results.csv Output/Major/lavalamp/evosuite4.csv

rm -r Major/lavalamp_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lavalamp5/* Major/lavalamp_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lavalamp_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite Lavalamp Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_evosuite/results.csv Output/Major/lavalamp/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/lavalamp_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro Lavalamp Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_codepro/results.csv Output/Major/lavalamp/codepro

STARTTIME=$(date +"%s")
cd Major/lavalamp_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual Lavalamp Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lavalamp_manual/results.csv Output/Major/lavalamp/manual

#########################jsecurity#########################
rm -r Major/jsecurity_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jsecurity1/* Major/jsecurity_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jsecurity_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jsecurity Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_evosuite/results.csv Output/Major/jsecurity/evosuite1.csv

rm -r Major/jsecurity_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jsecurity2/* Major/jsecurity_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jsecurity_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jsecurity Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_evosuite/results.csv Output/Major/jsecurity/evosuite2.csv

rm -r Major/jsecurity_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jsecurity3/* Major/jsecurity_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jsecurity_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jsecurity Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_evosuite/results.csv Output/Major/jsecurity/evosuite3.csv

rm -r Major/jsecurity_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jsecurity4/* Major/jsecurity_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jsecurity_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jsecurity Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_evosuite/results.csv Output/Major/jsecurity/evosuite4.csv

rm -r Major/jsecurity_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jsecurity5/* Major/jsecurity_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jsecurity_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jsecurity Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_evosuite/results.csv Output/Major/jsecurity/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/jsecurity_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro jsecurity Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_codepro/results.csv Output/Major/jsecurity/codepro

STARTTIME=$(date +"%s")
cd Major/jsecurity_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual jsecurity Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jsecurity_manual/results.csv Output/Major/jsecurity/manual

#########################diebierse#########################
rm -r Major/diebierse_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_diebierse1/* Major/diebierse_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/diebierse_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite diebierse Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_evosuite/results.csv Output/Major/diebierse/evosuite1.csv

rm -r Major/diebierse_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_diebierse2/* Major/diebierse_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/diebierse_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite diebierse Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_evosuite/results.csv Output/Major/diebierse/evosuite2.csv

rm -r Major/diebierse_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_diebierse3/* Major/diebierse_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/diebierse_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite diebierse Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_evosuite/results.csv Output/Major/diebierse/evosuite3.csv

rm -r Major/diebierse_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_diebierse4/* Major/diebierse_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/diebierse_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite diebierse Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_evosuite/results.csv Output/Major/diebierse/evosuite4.csv

rm -r Major/diebierse_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_diebierse5/* Major/diebierse_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/diebierse_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite diebierse Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_evosuite/results.csv Output/Major/diebierse/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/diebierse_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro diebierse Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebiersecodepro/results.csv Output/Major/diebierse/codepro

STARTTIME=$(date +"%s")
cd Major/diebierse_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual diebierse Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/diebierse_manual/results.csv Output/Major/diebierse/manual

#########################jnfe#########################
rm -r Major/jnfe_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jnfe1/* Major/jnfe_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jnfe_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jnfe Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_evosuite/results.csv Output/Major/jnfe/evosuite1.csv

rm -r Major/jnfe_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jnfe2/* Major/jnfe_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jnfe_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jnfe Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_evosuite/results.csv Output/Major/jnfe/evosuite2.csv

rm -r Major/jnfe_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jnfe3/* Major/jnfe_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jnfe_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jnfe Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp  Major/jnfe_evosuite/results.csv Output/Major/jnfe/evosuite3.csv

rm -r Major/jnfe_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jnfe4/* Major/jnfe_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jnfe_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jnfe Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_evosuite/results.csv Output/Major/jnfe/evosuite4.csv

rm -r Major/jnfe_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jnfe5/* Major/jnfe_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jnfe_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jnfe Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_evosuite/results.csv Output/Major/jnfe/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/jnfe_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro jnfe Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_codepro/results.csv Output/Major/jnfe/codepro

STARTTIME=$(date +"%s")
cd Major/jnfe_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual jnfe Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jnfe_manual/results.csv Output/Major/jnfe/manual

#########################jniinchi#########################
rm -r Major/jniinchi_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jniinchi1/* Major/jniinchi_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jniinchi_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jniinchi Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_evosuite/results.csv Output/Major/jniinchi/evosuite1.csv

rm -r Major/jniinchi_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jniinchi2/* Major/jniinchi_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jniinchi_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jniinchi Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_evosuite/results.csv Output/Major/jniinchi/evosuite2.csv

rm -r Major/jniinchi_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jniinchi3/* Major/jniinchi_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jniinchi_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jniinchi Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_evosuite/results.csv Output/Major/jniinchi/evosuite3.csv

rm -r Major/jniinchi_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jniinchi4/* Major/jniinchi_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jniinchi_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jniinchi Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_evosuite/results.csv Output/Major/jniinchi/evosuite4.csv

rm -r Major/jniinchi_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_jniinchi5/* Major/jniinchi_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/jniinchi_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite jniinchi Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_evosuite/results.csv Output/Major/jniinchi/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/jniinchi_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro jniinchi Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_codepro/results.csv Output/Major/jniinchi/codepro

STARTTIME=$(date +"%s")
cd Major/jniinchi_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual jniinchi Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/jniinchi_manual/results.csv Output/Major/jniinchi/manual

#########################xisemele#########################
rm -r Major/xisemele_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_xisemele1/* Major/xisemele_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/xisemele_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite xisemele Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_evosuite/results.csv Output/Major/xisemele/evosuite1.csv

rm -r Major/xisemele_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_xisemele2/* Major/xisemele_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/xisemele_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite xisemele Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_evosuite/results.csv Output/Major/xisemele/evosuite2.csv

rm -r Major/xisemele_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_xisemele3/* Major/xisemele_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/xisemele_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite xisemele Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_evosuite/results.csv Output/Major/xisemele/evosuite3.csv

rm -r Major/xisemele_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_xisemele4/* Major/xisemele_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/xisemele_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite xisemele Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_evosuite/results.csv Output/Major/xisemele/evosuite4.csv

rm -r Major/xisemele_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_xisemele5/* Major/xisemele_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/xisemele_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite xisemele Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_evosuite/results.csv Output/Major/xisemele/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/xisemele_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro xisemele Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_codepro/results.csv Output/Major/xisemele/codepro

STARTTIME=$(date +"%s")
cd Major/xisemele_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual xisemele Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/xisemele_manual/results.csv Output/Major/xisemele/manual

#########################lagoon#########################
rm -r Major/lagoon_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lagoon1/* Major/lagoon_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lagoon_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite lagoon Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_evosuite/results.csv Output/Major/lagoon/evosuite1.csv

rm -r Major/lagoon_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lagoon2/* Major/lagoon_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lagoon_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite lagoon Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_evosuite/results.csv Output/Major/lagoon/evosuite2.csv

rm -r Major/lagoon_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lagoon3/* Major/lagoon_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lagoon_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite lagoon Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_evosuite/results.csv Output/Major/lagoon/evosuite3.csv

rm -r Major/lagoon_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lagoon4/* Major/lagoon_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lagoon_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite lagoon Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_evosuite/results.csv Output/Major/lagoon/evosuite4.csv

rm -r Major/lagoon_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_lagoon5/* Major/lagoon_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/lagoon_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite lagoon Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_evosuite/results.csv Output/Major/lagoon/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/lagoon_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro lagoon Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_codepro/results.csv Output/Major/lagoon/codepro

STARTTIME=$(date +"%s")
cd Major/lagoon_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual lagoon Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/lagoon_manual/results.csv Output/Major/lagoon/manual

#########################netweaver#########################
rm -r Major/netweaver_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_netweaver1/* Major/netweaver_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/netweaver_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite netweaver Run 1:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_evosuite/results.csv Output/Major/netweaver/evosuite1.csv

rm -r Major/netweaver_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_netweaver2/* Major/netweaver_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/netweaver_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite netweaver Run 2:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_evosuite/results.csv Output/Major/netweaver/evosuite2.csv

rm -r Major/netweaver_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_netweaver3/* Major/netweaver_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/netweaver_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite netweaver Run 3:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_evosuite/results.csv Output/Major/netweaver/evosuite3.csv

rm -r Major/netweaver_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_netweaver4/* Major/netweaver_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/netweaver_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite netweaver Run 4:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_evosuite/results.csv Output/Major/netweaver/evosuite4.csv

rm -r Major/netweaver_evosuite/src/test/java/*
cp -r Output/EvoSuite-Generation/test_netweaver5/* Major/netweaver_evosuite/src/test/java
STARTTIME=$(date +"%s")
cd Major/netweaver_evosuite
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Evosuite netweaver Run 5:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_evosuite/results.csv Output/Major/netweaver/evosuite5.csv

STARTTIME=$(date +"%s")
cd Major/netweaver_codepro
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major CodePro netweaver Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_codepro/results.csv Output/Major/netweaver/codepro

STARTTIME=$(date +"%s")
cd Major/netweaver_manual
./run.sh
cd ..
cd ..
ENDTIME=$(date +"%s")
DELTA=$(($ENDTIME-$STARTTIME))
echo "Major Manual netweaver Run:" >> Output/time.txt
echo "$(($DELTA / 60)) minutes and $(($DELTA % 60)) seconds elapsed." >> Output/time.txt
cp Major/netweaver_manual/results.csv Output/Major/netweaver/manual

###########################################################
###########################################################
###########################################################
#########################JAVANCSS##########################
###########################################################
###########################################################
###########################################################
#########################inspirento########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_source.txt /home/jeshkracht/SF110/17_inspirento/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_manual.txt /home/jeshkracht/SF110/17_inspirento/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_codepro.txt /home/jeshkracht/Output/CodePro/inspirento/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_inspirento1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_inspirento2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_inspirento3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_inspirento4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/inspirento_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_inspirento5

#########################jsecurity#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_source.txt /home/jeshkracht/SF110/18_jsecurity/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_manual.txt /home/jeshkracht/SF110/18_jsecurity/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_codepro.txt /home/jeshkracht/Output/CodePro/jsecurity/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jsecurity1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jsecurity2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jsecurity3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jsecurity4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jsecurity_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jsecurity5

#########################lavalamp#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_source.txt /home/jeshkracht/SF110/55_lavalamp/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_manual.txt /home/jeshkracht/SF110/55_lavalamp/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_codepro.txt /home/jeshkracht/Output/CodePro/lavalamp/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lavalamp1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lavalamp2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lavalamp3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lavalamp4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lavalamp_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lavalamp5

#########################saxpath#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_source.txt /home/jeshkracht/SF110/24_saxpath/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_manual.txt /home/jeshkracht/SF110/24_saxpath/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_codepro.txt /home/jeshkracht/Output/CodePro/saxpath/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_saxpath1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_saxpath2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_saxpath3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_saxpath4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/saxpath_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_saxpath5

#########################netweaver#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_source.txt /home/jeshkracht/SF110/101_netweaver/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_manual.txt /home/jeshkracht/SF110/101_netweaver/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_codepro.txt /home/jeshkracht/Output/CodePro/netweaver/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_netweaver1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_netweaver2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_netweaver3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_netweaver4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/netweaver_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_netweaver5

#########################diebierse########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_source.txt /home/jeshkracht/SF110/49_diebierse/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_manual.txt /home/jeshkracht/SF110/49_diebierse/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_codepro.txt /home/jeshkracht/Output/CodePro/diebierse/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_diebierse1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_diebierse2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_diebierse3
JavaNCSS/bin/javancss -recursive -all -out Output/avaNCSS/diebierse_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_diebierse4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/diebierse_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_diebierse5

#########################jnfe#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_source.txt /home/jeshkracht/SF110/6_jnfe/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_manual.txt /home/jeshkracht/SF110/6_jnfe/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_codepro.txt /home/jeshkracht/Output/CodePro/jnfe/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jnfe1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jnfe2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jnfe3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jnfe4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jnfe_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jnfe5

#########################jniinchi#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_source.txt /home/jeshkracht/SF110/25_jniinchi/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_manual.txt /home/jeshkracht/SF110/25_jniinchi/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_codepro.txt /home/jeshkracht/Output/CodePro/jniinchi/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jniinchi1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jniinchi2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jniinchi3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jniinchi4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/jniinchi_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_jniinchi5

#########################xisemele#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_source.txt /home/jeshkracht/SF110/31_xisemele/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_manual.txt /home/jeshkracht/SF110/31_xisemele/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_codepro.txt /home/jeshkracht/Output/CodePro/xisemele/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_xisemele1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_xisemele2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_xisemele3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_xisemele4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/xisemele_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_xisemele5

#########################lagoon#########################
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_source.txt /home/jeshkracht/SF110/52_lagoon/src/main
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_manual.txt /home/jeshkracht/SF110/52_lagoon/src/test
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_codepro.txt /home/jeshkracht/Output/CodePro/lagoon/
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_evosuite1.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lagoon1
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_evosuite2.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lagoon2
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_evosuite3.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lagoon3
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_evosuite4.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lagoon4
JavaNCSS/bin/javancss -recursive -all -out Output/JavaNCSS/lagoon_evosuite5.txt /home/jeshkracht/Output/EvoSuite-Generation/test_lagoon5