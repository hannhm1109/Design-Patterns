# Design Pattern Singleton + Builder

## Description
Ce projet démontre l'implémentation de deux Design Patterns en Java : **Singleton** et **Builder**. Il présente un système de gestion de comptes bancaires avec un repository unique (Singleton) et une construction d'objets complexes (Builder).

## Patterns Implémentés

### 1. Singleton Pattern
Garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance.

### 2. Builder Pattern
Permet de construire des objets complexes étape par étape avec une interface fluide.

---

## Architecture du Projet

### Package `model`

#### Classes et Enums
- `BankAccount` : Représente un compte bancaire
  - Attributs : accountId, balance, currency, type, status, customer
  - Implémente le pattern **Builder** via classe interne
  - Support du clonage

- `Customer` : Représente un client
- `AccountType` : Enum (CURRENT_ACCOUNT, SAVING_ACCOUNT)
- `AccountStatus` : Enum (CREATED, ACTIVATED, SUSPENDED, BLOCKED)
- `BankDirector` : Facilite l'accès au Builder

#### Builder Pattern (Classe interne)
```java
BankAccount account = BankDirector.accountBuilder()
    .accountId(1L)
    .balance(10000)
    .currency("MAD")
    .type(AccountType.CURRENT_ACCOUNT)
    .status(AccountStatus.ACTIVATED)
    .build();
```

### Package `repository`

#### Singleton Pattern
- `AccountRepository` : Interface du repository
- `AccountRepositoryImpl` : **Implémentation Singleton**
  - Instance unique avec initialisation statique (eager initialization)
  - Thread-safe avec méthodes synchronisées
  - Stockage en mémoire (HashMap)

**Caractéristiques du Singleton :**
- Initialisation eagerly (bloc static)
- Constructeur privé
- getInstance() synchronisé
- Thread-safe pour environnements multi-threads

### Package `util`
- `JsonSerializer<T>` : Sérialisation JSON avec Jackson
  - Générique pour tout type d'objet
  - Pretty printing automatique

---

## Fonctionnalités

### Repository (CRUD Complet)
- `save(BankAccount)` : Créer un compte avec ID auto-incrémenté
- `findAll()` : Récupérer tous les comptes
- `findById(Long)` : Rechercher par ID
- `searchAccount(Predicate)` : Recherche avec prédicats
- `update(BankAccount)` : Mettre à jour un compte
- `deleteById(Long)` : Supprimer un compte
- `populateData()` : Générer 10 comptes aléatoires

### Thread Safety
- Méthodes `save()` et `getInstance()` synchronisées
- Test multi-threading dans Main.java
- Compteur d'instances thread-safe

### Sérialisation JSON
- Conversion automatique en JSON
- Format lisible (pretty print)
- Support de tous les attributs

---

## Démonstrations

### Main.java - Test Singleton Multi-Thread

**Objectif :** Vérifier que le Singleton fonctionne correctement en environnement multi-thread.
```java
// Crée 10 threads qui tentent d'accéder au repository
for (int i = 0; i < 10; i++) {
    new Thread(() -> {
        accountRepository.populateData();
    }).start();
}
```

**Résultat attendu :** Une seule instance du repository, mais plusieurs threads peuvent peupler les données simultanément.

### Test2.java - Comparaison Référence vs Clone

**Démontre la différence entre :**
1. **Copie manuelle** (account2) : Nouvel objet, nouvelles données
2. **Clone** (account3) : Copie profonde indépendante
3. **Référence** (account4) : Pointe vers le même objet
```java
BankAccount account1 = new BankAccount();
account1.setBalance(1000);

BankAccount account2 = new BankAccount(); // Copie manuelle
BankAccount account3 = account1.clone();  // Clone
BankAccount account4 = account1;          // Référence

account1.setBalance(8888);
// account3.getBalance() = 1000 (indépendant)
// account4.getBalance() = 8888 (même référence)
```

---

## Utilisation

### Compilation
```bash
cd singleton-pattern
mvn clean compile
```

### Exécution

**Test du Singleton avec Multi-Threading :**
```bash
java -cp target/classes net.nahim.Main
```

**Sortie exemple :**
```
Singleton instantiation
**************
Thread-0
Account Count = 10
Size: 10
**************
Tape a character:
[Appuyer sur Entrée]
**************
main
Account Count = 20
Size: 20
**************
{JSON des comptes...}
```

**Test Clone vs Référence :**
```bash
java -cp target/classes net.nahim.Test2
```

**Sortie exemple :**
```
ACC1=BankAccount{accountId=1, balance=1000.0, ...}
ACC2=BankAccount{accountId=1, balance=1000.0, ...}
ACC3=BankAccount{accountId=1, balance=1000.0, ...}
ACC4=BankAccount{accountId=1, balance=1000.0, ...}
8888.0
1000.0
8888.0
```

---

## Points Clés

### Singleton Pattern

**Avantages :**
- Une seule instance garantie
- Point d'accès global
- Économie de ressources
- Thread-safe avec synchronisation

**Implémentation :**
```java
private static final AccountRepositoryImpl accountRepository;

static {
    accountRepository = new AccountRepositoryImpl();
}

private AccountRepositoryImpl() {}

public synchronized static AccountRepositoryImpl getInstance() {
    return accountRepository;
}
```

### Builder Pattern

**Avantages :**
- Construction d'objets complexes étape par étape
- Interface fluide et lisible
- Paramètres optionnels sans constructeurs multiples
- Immutabilité possible

**Implémentation :**
```java
public static class AccountBuilder {
    private BankAccount bankAccount = new BankAccount();
    
    public AccountBuilder balance(double balance) {
        bankAccount.balance = balance;
        return this;
    }
    
    public BankAccount build() {
        return this.bankAccount;
    }
}
```

---

## Dépendances

### Jackson pour JSON
```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
</dependency>
```

---

## Cas d'Usage

### Singleton
- Gestionnaires de configuration
- Pools de connexions
- Caches
- Loggers
- Repositories

### Builder
- Objets avec nombreux paramètres
- Construction progressive
- Objets immutables
- Configuration complexe

---

## Thread Safety

Le projet démontre la gestion de la concurrence :
- Repository Singleton thread-safe
- Méthodes save() synchronisées
- Test avec 10 threads simultanés
- Compteur atomique pour les IDs

---

## Auteur
@nahim
