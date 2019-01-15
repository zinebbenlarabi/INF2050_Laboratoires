# INF2050_example_repo
Ce Repository Git sert de base pour vous entraîner à utiliser les commandes Git.

## Installation de Git

### En lignes de commande (Linux)
#### Vérifier si git n'est pas déjà installé
```
git --version
```
Si la commande renvoi un numéro de version alors git est déjà installé.
Sinon 
```
sudo apt-get install git
```
### En mode graphique (Linux, Windows, Mac)
#### Lien de téléchargement : https://git-scm.com/download/
Installez Git en incluant dans l'installation le Git Bash. 
C'est le terminal de commande qui vous permettra de manipuler les deépots Git en local.

## Les commandes de base dans le Git Bash (ou la console Linux)

### La commande ls
Permet de lister les fichiers et dossiers présents dans le dossier actif.

Options utiles :
-l : Permet d'afficher les éléments sous forme de liste
-a : Permet d'afficher plus d'informations sur les éléments

Exemple avec les options : 
```
ls -l -a
```

### La commande cd
Permet de se déplacer dans les dossiers.
Si vous voulez accéder à un dossier qui est présent dans le répertoire actif :
```
cd [nom du dossier]
```
OU si vous voulez accéder à un dossier inclu dans un dossier dans le répertoire actif :
```
cd [chemin vers le dossier]
```
OU si vous voulez accéder à un dossier qui n'est pas présent dans le dossier actif :
```
cd /[chemin depuis la racine]
```
OU si vous voulez remonter d'un dossier dans l'arborescence du dossier actif :
```
cd ..
```

Pour changer de disque :
```
cd [lettre du disk]:
```

### La commande mkdir
Permet de créer un dossier.
```
mkdir [nom du dossier]
```

### La commande touch
Permet de créer un fichier
```
touch [nom du fichier].[extension]
```

## Les commandes de manipulation de dépôt Git
### La commande clone
Afin de récupérer le Repository sur votre propre Github faites usage de la commande "CLONE".
Cette commande vous permet d'effectuer un clone du dépot Git original sur votre propre compte.
Les deux copies fonctionneront indépendamment l'une de l'autre.
