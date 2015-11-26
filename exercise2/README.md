# Übung 2 [100 Punkte]

**Achtung**: Sie müssen dieses Blatt live während der Übungsstunde bearbeiten. Spätestens am Ende der Stunde muss Ihre Lösung auf GitHub in dem Ihnen zugewiesenen Projekt eingecheckt sein.


## Paketschema

Wählen Sie ein Paket-Benennungs-Schema für Ihre Übungsaufgaben zur Vorlesung TPE. Erklären Sie Ihr Schema und begründen Sie, warum es durch das von Ihnen gewählte Schema nicht zu Kollisionen mit anderen Gruppen und Entwicklern kommen kann.


## Figuren

### Figur und Rechteck

Schreiben Sie ein Klasse `Figur`, die als einziges Attribut die Fläche der Figur hat. Bieten Sie weiterhin eine Methode `getFlaeche()` an, mit der die Fläche wieder ausgelesen werden kann. Sorgen Sie dafür, dass nur Subklassen den Konstruktor dieser Klasse aufrufen können und dass das Attribut mit der Fläche ebenfalls nur für Subklassen verfügbar ist.

Leiten Sie von der Klasse `Figur` eine Klasse `Rechteck` ab. Das Rechteck soll durch Höhe und Breite beschrieben werden und diese Werte sollen benutzt werden, um die Fläche der Figur zu setzen.


### 1. Erweiterung der Figur

Verändern Sie die Klasse `Figur` so, dass das Attribut mit der Fläche nur noch innerhalb der Klasse sichtbar ist. Verändern Sie den Konstruktor und die Klasse `Rechteck` entsprechend, damit sich das Verhalten der Klassen nicht ändert.

Sorgen Sie dafür, dass die Änderung im Versionsverwaltungssystem nachvollziehbar ist.


### 2. Erweiterung der Figur

Erweitern Sie die Klasse `Figur` so, dass man Objekte ohne Angabe einer Fläche erzeugen kann. Diese Objekte sollen dann die Fläche `0` haben. Die Klasse `Rechteck` soll weiter funktionieren.

Sorgen Sie dafür, dass die Änderung im Versionsverwaltungssystem nachvollziehbar ist.


### Dreieck

Schreiben Sie eine Klasse `Dreieck`, die von der Klasse `Figur` abgeleitet ist und über Grundseite und Höhe definiert wird.


### Gerade

Schreiben Sie eine Klasse `Gerade`, die von `Figur` abgeleitet ist und als Attribut die Länge der Geraden hat, deren Fläche aber logischerweise `0` ist.


### Quadrat

Schreiben Sie eine Klasse `Quadrat` und leiten Sie diese sinnvoll von den bereits vorhandenen Klassen ab. Überlegen Sie sich, welche Informationen Sie für die Berechnung der Fläche benötigen.


### Tests

Schreiben Sie Unit-Tests, die die von Ihnen entwickelten Klassen testen.


### UML-Diagramm

Zeichnen Sie ein UML-Diagramm von Ihrer Lösung.


## Hinweise

  * Verwenden Sie GitHub, um Ihre Quelltexte zu verwalten.
  * Arbeiten Sie in den Ihnen zugewiesenen Projekt.
  * Committen Sie häufig und nicht nur wenn Sie das Programm fertig gestellt haben. Jeder lauffähige Stand kann committed und eingecheckt werden.
  * Speichern Sie alle Textdateien im Format **UTF-8**. (Eclipse-Einstellungen -> General -> Workspace -> Text file encoding -> Other: UTF-8).
  * Benennen Sie Klassen und Methoden konsistent und verständlich. Klassen sollten Nomen als Namen, Methoden Verben haben.
  * Dokumentieren Sie alle Klassen, Interfaces, Konstruktoren und Methoden mit JavaDoc. Dokumentieren Sie auch alle Parameter, Rückgabewerte und Ausnahmen.
  * Formatieren Sie Ihren Code konsistent. Ein guter Standard sind 4 Spaces Einrückung pro Ebene ohne Verwendung von Tabulatoren.
  * Halten Sie sich an die Sun [Java-Code-Convention](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf)
  * Programmieren Sie defensiv und testen Sie Eingabewerte auf deren Gültigkeit. Ihr Programm darf auch mit Daten nicht abstürzen, die außerhalb der Aufgabenstellung liegen.
  * Machen Sie keine Konsoleneingaben oder -Ausgaben, es sei denn die Aufgabe fordert dies explizit.
  * Halten Sie Daten und Methoden zusammen. Trennen Sie diese nicht unnötig auf.
  * Kopieren Sie keinen Code sondern versuchen Sie mit den bekannten Mitteln der Objektorientierung Code-Duplikate zu vermeiden.

