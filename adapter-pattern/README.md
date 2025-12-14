# Design Pattern Adapter

## Description
Ce projet démontre l'implémentation du **Design Pattern Adapter** en Java. Il permet de convertir l'interface d'une classe en une autre interface attendue par les clients, permettant ainsi à des classes incompatibles de travailler ensemble.

## Concept
Le pattern Adapter agit comme un pont entre deux interfaces incompatibles. Il enveloppe un objet existant avec une nouvelle interface pour le rendre compatible avec une autre partie du système.

## Exemple : Système de connexion informatique
Ce projet simule l'adaptation entre différents types de connexions vidéo (VGA et HDMI) pour permettre à une unité centrale de communiquer avec différents périphériques d'affichage.

## Structure du projet

### Interfaces
- `Vga` : Interface pour les périphériques VGA
  - `print(String message)` : Afficher un message
  
- `Hdmi` : Interface pour les périphériques HDMI
  - `view(byte[] data)` : Afficher des données

### Périphériques VGA
- `Monitor` : Moniteur avec connexion VGA
- `Projector` : Projecteur avec connexion VGA
- `SuperVP` : Périphérique supportant VGA et HDMI

### Périphériques HDMI
- `TV` : Télévision avec connexion HDMI
- `SuperVP` : Périphérique supportant VGA et HDMI

### Adapters
- `HdmiVgaAdapter` : Adaptateur par composition (contient un HDMI)
- `HdmiVgaAdapterH` : Adaptateur par héritage (hérite de TV)

### Core
- `CentralUnit` : Unité centrale qui utilise l'interface VGA
- `Main` : Démonstration du pattern avec différents périphériques

## Fonctionnalités
- Conversion d'interface HDMI vers VGA
- Support de multiples périphériques
- Deux approches d'adaptation (composition et héritage)
- Interchangeabilité des périphériques

## Utilisation
```bash
# Compiler le projet
cd adapter-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes net.hananenhm.Main
```

## Exemple d'exécution
```
Monitor print : Hello World
Projector : Hello World
*********Adapter********
TV view : Hello World
SuperVP print : Hello World
*********Adapter********
SuperVP view : Hello World
*********Adapter********
TV view : Test
```

## Types d'Adapter implémentés

### Adapter par Composition (HdmiVgaAdapter)
- Contient une référence vers un objet HDMI
- Plus flexible et respecte le principe de composition

### Adapter par Héritage (HdmiVgaAdapterH)
- Hérite directement de TV
- Moins flexible mais plus simple

## Avantages du pattern
- Permet la réutilisation de classes existantes
- Rend des interfaces incompatibles compatibles
- Respecte le principe Ouvert/Fermé
- Facilite l'intégration de bibliothèques tierces

## Auteur
@hanane
