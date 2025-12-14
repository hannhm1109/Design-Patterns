# Design Pattern Strategy

## Description
Ce projet démontre l'implémentation du **Design Pattern Strategy** en Java. Il permet de sélectionner dynamiquement différentes stratégies à l'exécution.

## Concept
Le pattern Strategy permet de définir une famille d'algorithmes, de les encapsuler et de les rendre interchangeables. La stratégie varie indépendamment des clients qui l'utilisent.

## Structure du projet
- `IStrategy` : Interface définissant le contrat de stratégie
- `Context` : Classe qui utilise une stratégie
- `StrategyImpl1`, `StrategyImpl2`, `StrategyImpl3` : Implémentations concrètes des stratégies
- `StrategyImplDefault` : Stratégie par défaut
- `Main` : Point d'entrée avec chargement dynamique des stratégies

## Fonctionnalités
- Sélection interactive de la stratégie via console
- Chargement dynamique des classes par réflexion
- Cache des stratégies déjà chargées (Map)
- Changement de stratégie à la volée

## Utilisation
```bash
# Compiler le projet
javac net/hanane/*.java

# Exécuter
java net.hanane.Main
```

Ensuite, entrez le numéro de la stratégie (1, 2, 3, ou Default) dans la console.

## Exemple d'exécution
```
quelle stratégie?
1
Nouvelle stratégie ajouté
----------Strategy 1----------

quelle stratégie?
2
Nouvelle stratégie ajouté
----------Strategy 2----------
```

## Auteur
@hanane
