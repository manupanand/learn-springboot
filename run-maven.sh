cd $1
mvn compile # compile
mvn exec:java -Dexec.mainClass="com.example.app.App"