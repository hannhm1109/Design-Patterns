# Design Pattern Decorator

## Description
Ce projet démontre l'implémentation du **Design Pattern Decorator** en Java. Il permet d'ajouter dynamiquement des responsabilités à un objet de manière flexible, en alternative à l'héritage.

## Concept
Le pattern Decorator permet d'attacher de nouvelles fonctionnalités à un objet en l'enveloppant dans un objet décorateur. Les décorateurs offrent une alternative flexible à l'héritage pour étendre les fonctionnalités.

## Exemple : Système de café
Ce projet implémente un système de commande de boissons (cafés) avec des suppléments (décorations).

## Structure du projet

### Composants de base
- `Boisson` : Classe abstraite représentant une boisson
- `Espresso` : Café Espresso
- `Sumatra` : Café Sumatra
- `Deca` : Café décaféiné

### Décorateurs (Suppléments)
- `Decorator` : Classe abstraite pour tous les décorateurs
- `Chocolate` : Supplément chocolat
- `Caramel` : Supplément caramel
- `Hazelnut` : Supplément noisette

### Point d'entrée
- `Main` : Démonstration du pattern avec différentes combinaisons

## Fonctionnalités
- Ajout dynamique de suppléments à une boisson
- Calcul automatique du prix total (boisson + suppléments)
- Description complète de la composition
- Possibilité de combiner plusieurs suppléments

## Utilisation
```bash
# Compiler le projet
cd decorator-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes net.hanane.Main
```

## Exemple d'exécution
```
Sumatra
5.0

Espresso
3.5

Espresso + Chocolate
4.5

Espresso + Chocolate + Caramel
5.0

Espresso + Caramel + Chocolate + Hazelnut + Chocolate
6.5
```

## Avantages du pattern
- Plus flexible que l'héritage
- Respect du principe Ouvert/Fermé
- Combinaisons infinies possibles
- Ajout/retrait de responsabilités à la volée

## Auteur
@hanane
