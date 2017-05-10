# progettoASW
Primo progetto per il corso di Architetture di Sistemi Software

###Istruzioni

Lanciare in tre terminali gli script presenti nella root. Ogni script va lanciato posizionandosi sulla cartella principale del relativo servizio:

* runMainService.sh dalla cartella mainService
* runInfoAttore.sh dalla cartella infoAttore
* runNumeroFilm.sh dalla cartella numeroFilm

Le possibili operazioni che si possono effettuare sono due:

* /S/\<attore>/\<film> : restituisce informazioni (casuali) sull'\<attore> (numero di film in cui ha recitato) ed il personaggio (sempre casuale) interpretato in quel \<film> 
* /S/\<attore> : restituisce informazioni (casuali) sull'\<attore> (numero di film in cui ha recitato) ed il film (casuale) per il quale è più famoso

###Testing

Per effettuare dei test realistici (e quindi con stampe non casuali) si possono utilizzare i seguenti valori:

* attore = "Johnny Depp" (ed eventualmente film = "Mortdecai")
* attore = "Leonardo di Caprio" (ed eventualmente film = "Titanic")
