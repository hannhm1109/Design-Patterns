# Design Pattern Observer

## Description
Ce projet démontre l'implémentation du **Design Pattern Observer** en Java. Il établit une relation de dépendance un-à-plusieurs entre objets, de sorte que lorsqu'un objet change d'état, tous ses dépendants sont notifiés automatiquement.

## Concept
Le pattern Observer définit une dépendance un-à-plusieurs entre objets : quand un objet (Observable) change d'état, tous ses observateurs sont notifiés et mis à jour automatiquement.

## Structure du projet

### Interfaces
- `Observable` : Interface pour les objets observables
  - `subscribe(Observer)` : Ajouter un observateur
  - `unsubscribe(Observer)` : Retirer un observateur
  - `notifyObservers()` : Notifier tous les observateurs

- `Observer` : Interface pour les observateurs
  - `update(Observable)` : Méthode appelée lors d'une notification

### Implémentations
- `ObservableImpl` : Implémentation concrète d'un observable avec un état (int)
- `ObserverImpl1` : Premier observateur (affiche l'état × 3)
- `ObserverImpl2` : Deuxième observateur (affiche l'état × 2)
- Observer Lambda : Troisième observateur utilisant une expression lambda (affiche cos(état))

### Point d'entrée
- `Main` : Démonstration du pattern avec plusieurs observateurs

## Fonctionnalités
- Abonnement/désabonnement dynamique d'observateurs
- Notification automatique lors du changement d'état
- Support des expressions lambda pour les observateurs
- Gestion de plusieurs observateurs simultanément

## Utilisation
```bash
# Compiler le projet
cd observer-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes net.hanane.Main
```

## Exemple d'exécution
```
********Observable Impl 1********
Res=360

********Observable Impl 2********
Res=240

********Observable Impl 3********
Res=97.42...

[État change à 60]

********Observable Impl 1********
Res=180

********Observable Impl 2********
Res=120

********Observable Impl 3********
Res=-30.48...

[Observer 2 se désabonne]

********Observable Impl 1********
Res=240

********Observable Impl 3********
Res=-13.57...
```

## Cas d'usage
- Systèmes d'événements
- Notifications
- Mise à jour d'interfaces graphiques
- Synchronisation de données

## Avantages du pattern
- Couplage faible entre Observable et Observers
- Ajout/retrait dynamique d'observateurs
- Support de multiples observateurs
- Extensibilité facile

## Auteur
@hanane
