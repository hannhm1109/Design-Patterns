# Design Pattern Proxy

## Description
Ce projet démontre l'implémentation du **Design Pattern Proxy** en Java. Il fournit un substitut ou un représentant d'un autre objet pour contrôler l'accès à celui-ci.

## Concept
Le pattern Proxy fournit un intermédiaire pour contrôler l'accès à un objet. Il permet d'ajouter des fonctionnalités supplémentaires comme la mise en cache, la sécurité, ou le contrôle d'accès sans modifier l'objet original.

## Exemple : Service de calcul avec cache et sécurité
Ce projet implémente un service de calcul mathématique avec deux types de proxy : un proxy de cache pour optimiser les performances et un proxy de sécurité pour contrôler l'accès.

## Structure du projet

### Interface
- `IService` : Interface du service
  - `compute(int a)` : Effectuer un calcul mathématique

### Service réel
- `ServiceImpl` : Implémentation concrète du service
  - Effectue le calcul : cos(a × π/180) × √(a²)

### Proxies
- `ProxyCash` : Proxy de mise en cache
  - Stocke les résultats dans une Map
  - Évite les recalculs pour les valeurs déjà traitées
  - Lazy initialization du service réel

- `SecuredProxy` : Proxy de sécurité
  - Vérifie l'authentification via mot de passe
  - Contrôle l'accès au service cible
  - Lance une exception si non authentifié

### Client
- `Client` : Utilise le service via le proxy
- `Main` : Démonstration des deux types de proxy combinés

## Fonctionnalités
- Mise en cache automatique des résultats
- Authentification par mot de passe
- Composition de proxies (sécurité + cache)
- Lazy initialization
- Transparence pour le client

## Utilisation
```bash
# Compiler le projet
cd proxy-pattern
javac -d target/classes src/main/java/**/*.java

# Exécuter
java -cp target/classes net.hanane.Main
```

## Exemple d'exécution
```
Inside compute method
Res=22.516...
Res=22.516...
Inside compute method
Res=17.677...
Res=22.516...
```

**Explication :**
- Premier appel avec 23 : calcul effectué et mis en cache
- Deuxième appel avec 23 : résultat récupéré du cache (pas de recalcul)
- Troisième appel avec 25 : nouveau calcul et mise en cache
- Quatrième appel avec 23 : résultat récupéré du cache

## Types de Proxy implémentés

### Proxy de Cache (ProxyCash)
- Optimise les performances
- Évite les calculs redondants
- Stockage en mémoire (HashMap)

### Proxy de Sécurité (SecuredProxy)
- Contrôle d'accès basé sur mot de passe
- Protection du service réel
- Gestion des erreurs d'authentification

## Avantages du pattern
- Contrôle d'accès centralisé
- Optimisation des performances (cache)
- Lazy initialization
- Séparation des responsabilités
- Transparence pour le client

## Auteur
@hanane
