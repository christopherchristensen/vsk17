# Checkliste

## Zwischenabgabe
1. Als Komponente realisiert
2. Message-Level mitgeben mit Level-Filter
3. Zwei Interfaces: 
    a. Logger (Message erzeugen/eintragen)
    b. LoggerSetup (Konfiguration Message Logger)
4. Log-Ereignisse verlässlich aufgezeichnet
5. Austauschbar/platformunabhängig
6. Mehrere Instanzen parallel loggen
7. Speicherung der Messages auf Server in Textfile
8. Schnittstelle StringPersistor für Schreiben des Textfiles (StringPersistorFile)
9. Adapter (GoF-Pattern) um Daten in Payload Parameter der StringPersistor übergeben zu können

## Schlussabgabe
10. Qualitätsmerkmale StringPersistor erreicht
11. Speicherformat Textfile leicht anpassbar
12. Statische Konfigurationsdaten definiert und anpassbar
13. Socketverbindung robust implementiert
14. Implementation eines Viewers
