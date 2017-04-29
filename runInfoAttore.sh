# Script per avviare il servizio s1 che restituisce il film per il 
# quale l'attore è più famoso o il personaggio cha ha interpretato
# in un film

echo Running as INFO_ATTORE  

mvn package
java -jar target/infoAttore-0.0.1-SNAPSHOT.jar