# Opdrachten
_Oefenen met scope_

Alle opdrachten en stappen staan in dit document beschreven. De opdrachten gaan ervan uit dat je EdHub hebt bestudeerd.

## Opdracht 1
Gegeven:
 * package nl.novi.javaprogrammeren.one
 * MainOne.java
 * Person.java
 
Voeg de volgende methode toe aan de klasse Person
```java
    public void ageOneYear() {
        this.age++;
    }
```

De klasse geeft nu een foutmelding. Zorg ervoor dat de scope van de variabele age goed komt te staan. Repareer ook de
`setAge()`-methode.

Voeg een getter toe voor `age` aan de Person-klasse. Zet de leeftijd van sjaak op 30 in de MainOne-klasse. Roep
`ageOneYear()` aan en print het resultaat uit.

## Opdracht 2
Gegeven:
 * package nl.novi.javaprogrammeren.two
 * MainTwo.java
 
 Voeg de volgende code *na* de for-lus toe: `System.out.println("De som van alle random-getallen is: " + totalsum);`.
 De code heeft nu een foutmelding. Los deze foutmelding op en zorg ervoor dat de som van alle getallen correct wordt
 uitgeprint.
 
## Opdracht 3
Gegeven:
 * package nl.novi.javaprogrammeren.three
 * MainThree.java
 * Phone.java

Phone.java geeft nu het telefoonnummer terug via de getter-methode. Voor internationale bellers is een extra methode
aangemaakt (`getInternationalPhoneNumber()`). Deze geeft nu alleen `+31` terug. Beantwoord voor jezelf de vraag waarom
dit zo is. We roepen toch phoneNumber aan? Hoe heet dit in de cursus op EdHub?

Pas vervolgens de code aan, zodat het telefoonnnummer met +31 ervoor wordt teruggegeven.