# Dokumentation Message Logger

Version: 1.0

Teammitglieder:

* Christopher Christensen
* Valentin Bürgler
* Lukas Arnold
* Melvin Werthmüller

## Anforderungen

## Implementation
TODO insert uml diagrim of system and describe

### Client
#### Logger Game
TODO Vali

#### LoggerSetup & Logger
Um den Logger in einer Client-Applikation in Betrieb zu nehmen, muss dafür über die LoggerFactory ein LoggerSetup Object geholt werden. Dazu muss der Methode einen String übergeben werden, welcher ein "Fully-Qualified Class Name" ist und das LoggerSetup Interface implementiert. Über das LoggerSetup-
Objekt können dann verschiedene Logger erstellt werden. 

Zum besseren Verständniss folgt eine Beispiel-Implementierung:

```java
String fqn = "ch.hslu.vsk.g01.loggercomponent.LoggerFactory";
String server = "127.0.0.1";
Integer port = 54321;

try {
	LoggerSetup loggerFactory = LoggerFactory.getLoggerSetup(fqn);
	Logger logger = loggerFactory.createLogger(server, port);
} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
	// Implement error handling here
}
```

#### TCP Connection Client
Der Logger beinhaltet die Funktion `log`, welche eine LogMessage an den Server schickt. Damit die Verbindung asynchron ist, werden zuerst alles zu loggenden Meldungen mit einem eigenen Thread `LogProducer` in eine Queue geschrieben. Desweiteren ist ein Thread `LogConsumer` dafür zuständig, die Queue zu lesen und die Meldungen über eine TCP Verbindung zum Server zu schicken.

### Server
Der Server stellt einen Socket bereit und empfängt Meldungen vom Client. Für jede erhaltene Nachricht, wird ein eigener `LogHandler` erstellt, welcher die Meldungen asynchron an den Adapter zum Stringpersistor weitergiebt.

#### Adapter
Der Adapter stellt die Schnittstelle zum Stringpersistor her.

#### String Persistor
TODO James


## Testing
TODO make conecpt?
