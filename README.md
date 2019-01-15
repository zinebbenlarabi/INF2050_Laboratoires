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

### La commande init
```
git init
```
Permet d'initialiser un nouveau dépôt Git.

### La commande clone
```
git clone [adresse du dépôt à cloner]
```
Afin de récupérer une copie du dépôt sur votre propre Github faites usage de la commande "CLONE".
Cette commande vous permet d'effectuer un clone du dépot Git master sur votre propre compte.
Les deux copies fonctionneront indépendamment l'une de l'autre.

### La commande config
```
git config
```
Permet de configurer le dépôt Git.

### La commande status
```
git status
```
Permet de vérifier le status de votre dépôt Git.
Permet d'afficher, par exemple, les différences entre le dossier local (présent sur l'ordinateur) et le dépôt distant (présent sur le serveur).

### La commande add
```
git add [nom du fichier/dossier]
```
OU Si vous voulez répertorier tous les nouveaux fichiers/dossiers pour votre dépôt distant :
```
git add .
```
Permet de signaler à votre dépôt Git que de nouveaux fichiers sont à prendre en compte pour la suite.

### La commande commit
```
git commit
```
OU si vous souhaitez ajoute un commentaire (RECOMMANDÉ)
```
git commit -m "[mettez ici votre commentaire]"
```
Permet de signaler à Git que des modifications ont été effectuées sur les fichiers/dossiers qui sont répertoriés sur le dépôt distant.

### La commande branch
```
git branch [nom de la nouvelle branche]
```
Permet de créer une "branche" sur le dépôt. 
Cela peut être utile lorsque l'on travaille à plusieur(e)s personnes/équipes.
Le dépôt est alors copié sur une autre branche. 
Les add et commit fais sur la branche n'affectent pas le dépôt master et inversement.

### La commande merge
```
git merge [nom de la branche]
```
Permet d'appliquer les changements d'une branche vers son dépôt master.

### La commande push
```
git push
```
Permet de "pousser" les modifications effectuées en local sur un dépôt distant.

### La commande pull
```
git pull
```
Permet de "tirer" les modifications effectuées sur le dépôt distant vers le dossier local.
