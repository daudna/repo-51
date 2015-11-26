# Pflichtübung 3 [100 Punkte]

**Abgabe 30.10.2015 23:50 Uhr**


## In der Spielentwicklung

Nachdem Sie vollkommen geschockt vom Live-Testat der letzte Woche an Ihren Fähigkeiten im Programmieren zweifeln, entscheiden Sie sich den Job bei den Carbon-Hounds zu kündigen - zu brachial ist deren Umgang mit Mitarbeitern, die nicht ihren Anforderungen entsprechen. Auf der Suche nach einer neuen Tätigkeit, finden Sie eine Stellenanzeige eines Computerspieleherstellers. Sofort nehmen Sie diese Stelle an und stürzen sich in die Arbeit.


## Beschreibung des Spiels

### Wesen

Bei dem Spiel geht es um den Kampf zwischen unterschiedlichen Wesen aus einer dunklen Fantasywelt. In dem Spiel gibt es vier verschiedene Rassen zur Auswahl.

  * _Orks_ -  Da wären zum Einen die Orks, die die Eigenschaft besitzen sehr stark zu sein. Ein besonderer Ork ist der Held _Farseer_, der die Ork-Horden anführt. 
  * _Untote_ - Weiter soll der Spieler die Möglichkeit haben Untote als Rasse auszuwählen. Diese  sind sehr günstig und nur in der Masse stark. Der Anführer der Untoten ist der dunkle _Lich_. 
  * _Menschen_ - Des Weiteren gibt es die Menschen. Diese sind sehr ausdauernd, was bedeutet, dass sie größeren Schaden als andere Wesen einstecken können. Sie regiert der _Erzmagier_ und führt sein Gefolge in die Schlacht.
  * _Nachtelfen_ - Zu guter Letzt gibt es noch die Nachtelfen, welche die Eigenschaft besitzen sehr intelligent zu sein. Der mächtigste Elf ist der _Dämonenjäger_. 

Alle Rassen haben wichtige Gemeinsamkeiten: Dazu gehören _Lebenspunkte_, _Rüstung_, _Schaden_ und _Geschwindigkeit_.  Diese sind wie folgt verteilt:

| Art      |  Lebenspunkte |  Schaden |  Geschwindigkeit |  Rüstung |
|----------|---------------|----------|------------------|----------|
| Ork      |  100 |  33 |  1 |  30% |
| Untote   |  120 |  16 |  2 |  30% |
| Mensch   |  140 |  40 |  2 |  40% |
| Nachtelf |  120 |  15 |  3 |  20% |

Anführer besitzen zusätzlich ein _beherrschtes Element_, das nicht genauer definiert ist und einen einen _Bonus Faktor_.

| Anführer     |  Bonus |
|--------------|--------|
| Farseer      |  1,2 |
| Lich         |  2,3 |
| Erzmagier    |  5,0 |
| Dämonenjäger |  3,0 |

Jede Rasse verfügt über eine Methode `attack`, sodass ein Angriff auf einen anderen Kämpfer ausgeführt werden kann. Diese Methode gibt den angerichteten Schaden zurück und zieht gleichzeitig diesen von den Lebenspunkten des Gegners ab.

Jede Rasse verfügt zudem über die gleiche Methode `isLebendig()`, die angibt, ob ein Wesen noch lebt. Ein Wesen ist solange lebendig, wie seine Lebenspunkte größer als 0 sind.

Überschreiben Sie die `toString`-Methoden der Wesen so, dass sinnvolle Informationen zu den einzelnen Wesen ausgegeben werden können.


### Das Spiel

Vor Spielstart müssen sich zwei Spieler jeweils einen eigenen _Squad_ zusammenstellen, welches Wesen aus unterschiedlichen Rassen enthält. In einem Squad können beliebig viele Wesen der jeweiligen Rasse vorhanden sein, der Anführer jeder Rasse aber nur einmal, also maximal vier Anführer. Die Anzahl der Wesen wird durch deren Kosten begrenzt. Jeder Spiele hat einen festen Geldbetrag von 2000 Elfendollar. Mit diesem kann er Wesen für seinen Squad kaufen.

Die Preise für die Wesen sind:

| Art |  Kosten |
|-----|---------|
| Ork          |  150 |
| Farseer      |  300 |
| Untote       |   70 |
| Lich         |  140 |
| Mensch       |  110 |
| Erzmagier    |  220 |
| Nachtelf     |  145 |
| Dämonenjäger |  290 |

Der Spieler gibt seinem Squad neben den Wesen noch die Information mit, wie es heißen soll. Diesen Namen kann er frei wählen (z.B. "The walking dead").

Der `GameController` erstellt die Squads und besitzt die Kenntnis über die aktuelle Runde sowie den Spieler der an der Reihe ist. Außerdem startet seine Funktion `runGame()` das Spiel. In dieser wird in einer Schleife jeweils die Attacke eines Squad auf das andere ausgeführt, und jeweils der aktuelle Spielstand sowie Runde ausgegeben. 

Jedes Wesen eines Squads führt eine Attacke auf eine zufällig gewählte Wesen des Gegner-Squads durch (Tipp: `java.util.Random`). Wenn das Spiel gestartet wurde läuft es ohne Nutzereingaben bis zur kompletten Auslöschung eines Squads und terminiert mit der Ausgabe des Gewinners. Bei jedem Kampf werden die Ergebnisse der Begegnung und die Auswirkung auf den Squad angezeigt. Ist ein Wesen nicht mehr lebendig, wird es aus dem Squad entfernt.


### Kampflogik

Nun zur generellen Kampflogik des Spiels. Jede Schadenshöhe einer Rasse berechnet sich wie folgt:

`damage = Geschwindigkeit * Schaden`

Jeder Anführer erhöht diesen Schaden nun noch einmal um seinen jeweiligen Bonus Faktor.

`damage = damage * bonus`

Nachdem der Schaden errechnet wurde muss noch wie oben angedeutet die Rüstung beachtet werden. Das heißt der angerichtete Schaden muss prozentual der angegebenen Rüstung reduziert und anschließend von den Lebenspunkten abgezogen werden. 


## Aufgabe

### UML-Diagramm

Erstellen Sie ein Klassendiagramm, das die im Text genannten Entitäten, Eigenschaften und Methoden in einem objektorientierten Modell abbildet. Lesen Sie den Text sorgfältig, um nichts zu vergessen.

Nutzen Sie Vererbung und andere Ihnen bekannte Konstrukte, um keine Information und kein Verhalten mehr als einmal abbilden zu müssen. Sie werden höchstwahrscheinlich noch eigene, über die im Text genannten Entitäten herausgehende Abstraktionen einführen wollen, um das Design zu vervollständigen. Teilen Sie die entworfenen Strukturen in verschiedene Pakete auf, und wählen Sie sinnvolle Sichtbarkeitsattribute.


### Implementierung

Implementieren Sie alle Klassen aus Ihrem UML-Diagramm mit dem entsprechenden Verhalten.


### JUnit

Implementieren Sie sinnvolle JUnit Tests zur Überprüfung der Kampf-Funktion und der Erstellung verschiedener Squads


### Simulation

Simulieren Sie eine Schlacht mit einer gewissen Anzahl an Einheiten, jedoch  gleichem Startkapital beider Squads. Machen Sie entsprechende Ausgaben, aus denen hervorgeht, dass sich Ihr Programm wie spezifiziert verhält.


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



