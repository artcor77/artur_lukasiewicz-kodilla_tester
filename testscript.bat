//usuń build/libs/*.jar
cd build
cd libs
del *.jar

//zbuduj gradlew
./gradlew

if *.jar exists goto exists
echo File exists or not
goto end

:exists
echo File exists
mkdir project
copy *.jar project

:end
echo Error