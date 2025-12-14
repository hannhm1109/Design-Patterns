# Design Pattern Template Method

## Description
Ce projet démontre l'implémentation du **Design Pattern Template Method** en Java. Il définit le squelette d'un algorithme dans une méthode, en déléguant certaines étapes aux sous-classes.

## Concept
Le pattern Template Method définit la structure générale d'un algorithme dans une classe de base, tout en permettant aux sous-classes de redéfinir certaines étapes de l'algorithme sans en changer la structure globale.

## Exemple : Calculs mathématiques itératifs
Ce projet implémente un algorithme de calcul itératif où la méthode de calcul et le nombre d'itérations varient selon l'implémentation.

## Structure du projet

### Classe abstraite
- `Template` : Définit le squelette de l'algorithme
  - `perform(int a, int b)` : Méthode template (finale implicite)
    - Récupère le nombre d'itérations via `param1()`
    - Effectue les calculs itératifs via `compute(a, b)`
    - Retourne la somme des résultats
  - `compute(int a, int b)` : Méthode abstraite pour le calcul
  - `param1()` : Méthode abstraite pour le nombre d'itérations

### Implémentations concrètes
- `HananeImpl` : Première implémentation
  - Calcul : √(a² + b²) (distance euclidienne)
  - Itérations : 3

- `TestImpl` : Deuxième implémentation
  - Calcul : cos(a² + b²)
  - Itérations : 5

### Point d'entrée
- `Test` : Démonstration des deux implémentations

## Fonctionnalités
- Algorithme itératif paramétrable
- Calculs mathématiques personnalisables
- Nombre d'itérations configurable
- Réutilisation de la structure commune

## Utilisation
```bash
# Compiler le projet
cd template-method-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes Test
```

## Exemple d'exécution
```
17.492... (3 × √(3² + 5²) = 3 × 5.83)
-4.596... (5 × cos(3² + 5²) = 5 × cos(34))
```

**Explication :**
- HananeImpl : calcule 3 fois √(9 + 25) = 3 × 5.83 ≈ 17.49
- TestImpl : calcule 5 fois cos(34) ≈ 5 × (-0.92) ≈ -4.60

## Algorithme Template
```
perform(a, b):
  1. Récupérer n = param1()
  2. Initialiser sum = 0
  3. Pour i de 1 à n:
     - Calculer step = compute(a, b)
     - sum += step
  4. Retourner sum
```

## Avantages du pattern
- Réutilisation du code commun
- Contrôle de la structure globale de l'algorithme
- Flexibilité dans les implémentations spécifiques
- Respect du principe Ouvert/Fermé
- Évite la duplication de code

## Cas d'usage
- Algorithmes avec structure fixe mais étapes variables
- Frameworks définissant des workflows
- Traitement de données avec étapes personnalisables
- Protocoles avec étapes communes

## Auteur
@hanane
