# Algorithmen und Datenstrukturen

Dieses Repository enthält meine Laborarbeiten aus dem Kurs **Algorithmen und Datenstrukturen** an der Hochschule Karlsruhe (HKA).

## 📚 Übersicht

Das Repository ist in zwei Hauptbereiche unterteilt:

- **`labor/`** - Aufgabenstellungen und abstrakte Basisklassen
- **`labor_loesung/`** - Implementierte Lösungen zu den Aufgaben

## 🗂️ Inhalt

### Datenstrukturen

- **Listen**: Doppelt verkettete Listen (DoubleLinkedList)
- **Bäume**: Binäre Suchbäume (BinarySearchTree)
- **Hash-Tabellen**: Hashtable-Implementierungen
- **Graphen**: Ungerichtete gewichtete Graphen mit Union-Find

### Algorithmen

#### Sortieralgorithmen
- Mergesort
- Reverse Mergesort
- Array-Umkehrung (ReverseArray)

#### Suchalgorithmen
- Lineare Suche (LinearSearch)
- Binäre Suche (BinarySearch)

### Weitere Themen

- **Generics**: Typsichere Container und Delivery Services
- **Interfaces**: Abstrakte Formen und Vektoren mit Scaleable-Interface
- **Dictionary/Map**: Abstrakte Implementierungen von Wörterbüchern

## 📋 Struktur

```
.
├── labor/                  # Aufgabenstellungen
│   └── src/
│       └── de/hska/iwi/ads/
│           ├── dictionary/       # Dictionary-Abstraktionen
│           ├── generics/         # Generics-Aufgaben
│           ├── graph/            # Graph-Algorithmen
│           ├── interfaces/       # Interface-Aufgaben
│           ├── search/           # Such-Algorithmen
│           ├── solution/         # Musterlösungen (Tree)
│           └── sorting/          # Sortier-Algorithmen
│
└── labor_loesung/          # Meine Lösungen
    └── src/
        └── de/hska/iwi/ads/solution/
            ├── hashtable/        # Hash-Tabellen
            ├── interfaces/       # Interface-Implementierungen
            ├── list/             # Listen-Implementierungen
            ├── search/           # Such-Algorithmen
            └── sorting/          # Sortier-Algorithmen
```

## 🛠️ Technologie

- **Sprache**: Java
- **IDE**: Eclipse (erkennbar an `.DS_Store` Dateien)
- **Paketstruktur**: `de.hska.iwi.ads.*`

## 📝 Hinweise

Die Implementierungen enthalten:
- Unit-Tests für die wichtigsten Funktionen
- Abstrakte Basisklassen zur Strukturierung
- Kommentare in deutscher Sprache
- Typensichere generische Implementierungen

## 📖 Verwendung

Jede Implementierung kann einzeln kompiliert und getestet werden. Die Test-Klassen (mit `*Test.java` benannt) enthalten Beispiele zur Verwendung der jeweiligen Datenstrukturen und Algorithmen.

## 🎓 Hochschule

Hochschule Karlsruhe - Technik und Wirtschaft  
Fakultät für Informatik und Wirtschaftsinformatik

---

*Dieses Repository dient zu Lern- und Dokumentationszwecken.*
