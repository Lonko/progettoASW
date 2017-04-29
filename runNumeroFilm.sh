# Script per avviare il servizio s2 che restituisce il numero di film
# in cui l'attore ha recitato 

echo Running as NUMERO_FILM  

mvn package
java -jar target/numeroFilm-0.0.1-SNAPSHOT.jar