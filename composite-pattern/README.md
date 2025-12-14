# Design Pattern Composite

## Description
Ce projet démontre l'implémentation du **Design Pattern Composite** en Java. Il permet de composer des objets en structures arborescentes pour représenter des hiérarchies partie-tout, et de traiter uniformément les objets individuels et les compositions d'objets.

## Concept
Le pattern Composite permet de construire des structures d'objets en forme d'arbre et de manipuler ces structures comme s'il s'agissait d'objets individuels. Les clients peuvent traiter de manière uniforme les objets individuels et les compositions.

## Exemple : Système de fichiers
Ce projet implémente une structure de répertoires et fichiers, similaire à un système de fichiers, où les dossiers peuvent contenir des fichiers et d'autres dossiers.

## Structure du projet

### Classe abstraite
- `Component` : Classe de base pour tous les éléments
  - `name` : Nom du composant
  - `level` : Niveau de profondeur dans l'arborescence
  - `print()` : Méthode abstraite pour afficher le composant
  - `tab()` : Méthode utilitaire pour l'indentation

### Composants concrets
- `File` : Représente un fichier (feuille de l'arbre)
  - Ne peut pas contenir d'autres composants
  - Affiche son nom avec indentation

- `Folder` : Représente un dossier (nœud composite)
  - Peut contenir des fichiers et d'autres dossiers
  - `addComponent(Component)` : Ajouter un composant
  - `getComponents()` : Récupérer tous les composants
  - `getComponent(String name)` : Récupérer un composant par nom

### Point d'entrée
- `Main` : Démonstration de la création d'une structure arborescente

## Fonctionnalités
- Création de structures hiérarchiques fichiers/dossiers
- Ajout dynamique de composants
- Affichage récursif de toute la structure
- Gestion automatique des niveaux d'indentation
- Recherche de composants par nom

## Utilisation
```bash
# Compiler le projet
cd composite-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes net.hananenhm.Main
```

## Exemple d'exécution
```
Folder:root
	File: pom.xml
	Folder:src
		Folder:main
			File: Test.java
			File: Person.java
```

## Structure créée dans Main
```
root/
├── pom.xml
└── src/
    └── main/
        ├── Test.java
        └── Person.java
```

## Cas d'usage
- Systèmes de fichiers
- Structures organisationnelles (entreprises, départements)
- Interfaces graphiques (conteneurs et widgets)
- Menus et sous-menus
- Arbres de catégories

## Avantages du pattern
- Simplifie le code client (traitement uniforme)
- Facilite l'ajout de nouveaux types de composants
- Structure récursive naturelle
- Respect du principe Ouvert/Fermé

## Auteur
@hanane
