# TP Design Patterns - Exercices Pratiques

## Description
Ce TP regroupe plusieurs exercices pratiques illustrant l'utilisation de différents Design Patterns en Java. Il est divisé en deux parties principales avec des cas d'usage concrets.

## Structure du TP

### Exercice 1 : Patterns Fondamentaux (ex1)
Quatre questions explorant des patterns différents avec des cas d'usage variés.

### Exercice 2 : Framework de Traitement d'Images (ex2)
Application complète combinant Strategy, Template Method et Adapter pour le traitement d'images.

---

## Exercice 1

### Question 1 : Composite Pattern - Groupes de Figures

**Objectif :** Créer une hiérarchie de figures géométriques avec support des groupes.

**Classes :**
- `Figure` : Interface commune pour toutes les figures
- `Circle` : Cercle (feuille)
- `Rectangle` : Rectangle (feuille)
- `GroupeFigure` : Groupe de figures (composite)

**Fonctionnalités :**
- Dessiner des figures individuelles
- Créer des groupes de figures
- Traiter uniformément figures simples et groupes

**Pattern utilisé :** Composite

---

### Question 2 : Template Method + Factory - Système de Plugins

**Objectif :** Créer un système de plugins extensible avec workflow commun.

**Classes :**
- `Plugin` : Classe abstraite définissant le template
  - `execute()` : Méthode template (final)
  - `commonStep()` : Étapes communes
  - `variableStep1()`, `variableStep2()` : Étapes personnalisables
- `PluginA`, `PluginB` : Implémentations concrètes
- `PluginFactory` : Factory pour créer les plugins

**Workflow :**
```
1. Common step at start
2. Variable step 1 (personnalisé)
3. Variable step 2 (personnalisé)
4. Common step at end
```

**Patterns utilisés :** Template Method + Factory

---

### Question 3 : Decorator Pattern - Décoration de Composants

**Objectif :** Ajouter dynamiquement des comportements avant/après le traitement.

**Classes :**
- `Composant` : Interface du composant
- `ComposantConcret` : Composant de base
- `DecorateurAbstrait` : Décorateur de base
- `DecorateurAvantApres` : Ajoute des actions avant et après

**Fonctionnalités :**
- Traitement de base
- Ajout de comportements avant/après
- Enchaînement de décorateurs

**Pattern utilisé :** Decorator

---

### Question 4 : Observer Pattern - Système de Jeu

**Objectif :** Notifier automatiquement les observateurs des changements de score.

**Classes :**
- `Subject` : Interface pour les sujets observables
- `Observer` : Interface pour les observateurs
- `Joueur` : Sujet (gère le score)
- `Camera`, `Couloir`, `Gardien` : Observateurs concrets

**Fonctionnalités :**
- Ajout/retrait d'observateurs
- Notification automatique lors du changement de score
- Découplage entre joueur et observateurs

**Pattern utilisé :** Observer

---

## Exercice 2 : Framework de Traitement d'Images

### Description
Application complète de traitement d'images combinant plusieurs patterns pour créer un framework flexible et extensible.

### Architecture

#### Package `framework`
- `ImageFramework` : Classe principale coordonnant filtrage et compression

#### Package `filter` (Strategy Pattern)
- `FilterStrategy` : Interface pour les stratégies de filtrage
- `BlurFilter` : Filtre de flou
- `SharpenFilter` : Filtre de netteté
- `ImplNonStandard` : Implémentation externe incompatible
- `ImplNonStandardAdapter` : Adaptateur pour l'implémentation externe

#### Package `compression` (Template Method Pattern)
- `Compressor` : Classe abstraite définissant le template de compression
  - `compress()` : Méthode template
  - `preprocess()` : Prétraitement (hook)
  - `doCompress()` : Compression (abstrait)
  - `postprocess()` : Post-traitement (hook)
- `JpegCompressor` : Compression JPEG
- `PngCompressor` : Compression PNG

#### Package `app`
- `AppImageProcessing` : Application principale avec chargement dynamique

### Fonctionnalités

**Chargement Dynamique :**
- Saisie des noms de classes au runtime
- Instanciation par réflexion
- Configuration flexible du framework

**Pipeline de Traitement :**
```
Image brute → Filtre (Strategy) → Compression (Template Method) → Image finale
```

**Patterns Combinés :**
- **Strategy** : Choix du filtre à appliquer
- **Template Method** : Workflow de compression
- **Adapter** : Intégration d'implémentations tierces

### Utilisation
```bash
# Compiler le projet
cd tp-design-patterns
javac -d target/classes src/main/java/**/*.java

# Exécuter l'application de traitement d'images
java -cp target/classes ex2.app.AppImageProcessing
```

**Exemple d'interaction :**
```
Classe de filtre:
ex2.filter.BlurFilter
Classe de compression:
ex2.compression.JpegCompressor
BlurFilter: apply blur
Jpeg Compressor: compress JPEG
Traitement terminé, taille finale = 5
```

---

## Patterns Utilisés dans le TP

| Pattern | Question | Usage |
|---------|----------|-------|
| **Composite** | Ex1-Q1 | Hiérarchie de figures |
| **Template Method** | Ex1-Q2, Ex2 | Workflow plugins, Compression |
| **Factory** | Ex1-Q2 | Création de plugins |
| **Decorator** | Ex1-Q3 | Ajout de comportements |
| **Observer** | Ex1-Q4 | Notifications score |
| **Strategy** | Ex2 | Sélection de filtres |
| **Adapter** | Ex2 | Intégration code tiers |

---

## Points Clés du TP

### Exercice 1
- Implémentation isolée de chaque pattern
- Cas d'usage concrets et variés
- Compréhension des patterns fondamentaux

### Exercice 2
- **Combinaison de patterns** dans une application réelle
- **Chargement dynamique** par réflexion
- **Architecture extensible** et maintenable
- **Séparation des responsabilités**

---

## Avantages de cette Architecture

### Flexibilité
- Ajout de nouveaux filtres sans modifier le framework
- Ajout de nouveaux compresseurs facilement
- Configuration au runtime

### Extensibilité
- Nouveaux types de traitement facilement intégrables
- Support de bibliothèques tierces via Adapter
- Plugin system avec Template Method

### Maintenabilité
- Code organisé par responsabilités
- Découplage fort entre composants
- Facilité de test unitaire

---

## Compilation et Exécution

### Compiler tout le TP
```bash
cd tp-design-patterns
javac -d target/classes src/main/java/**/*.java
```

### Tester individuellement

**Exercice 1 - Question 1 (Composite) :**
```bash
# Créer un fichier de test et exécuter
```

**Exercice 1 - Question 2 (Template Method + Factory) :**
```bash
java -cp target/classes ex1.q2.PluginFactory
```

**Exercice 2 - Application complète :**
```bash
java -cp target/classes ex2.app.AppImageProcessing
```

---

## Auteur
@hanane
