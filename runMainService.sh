# Script per avviare il servizio s che restituisce
# informazioni sull'attore

echo Running as MAIN_SERVICE  

mvn package
java -jar target/mainService-0.0.1-SNAPSHOT.jar