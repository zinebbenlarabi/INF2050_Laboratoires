# INF2050 Laboratoire 1 : Utilisation de Git

## Au préalable
Tout d'abord vérifiez votre installation de Git : [Installation de Git](GIT_installation.md)  
Ensuite prenez rapidement connaissance des commandes : [Liste des commandes pour Git](GIT_commandes.md)  
Vous pourrez vous servir de ce fichier de commandes comme aide mémoire.  


## Récupérez le Dépôt distant sur votre propre compte Github
Afin de pouvoir travailler sur votre propre copie du dépôt ci présent il va falloir que vous l'importiez sur votre propre compte Github.
Pour cela nous allons utiliser l'option FORK de Github.

### Récupération du dépôt sur Github
1 - Connectez-vous à votre compte Github sur https://github.com/  
2 - Rendez-vous sur le dépôt suivant : https://github.com/Nouninoun/INF2050_Laboratoires  
3 - Effectuez un fork du dépôt : ![alt text](https://github.com/Nouninoun/INF2050_Laboratoires/blob/master/Lab1/img/lab1_fork.png "Github fork")  

### Récupération du dépôt en local
4 - Ouvrez Git Bash
5 - Prévenez le Git Bash de votre identité
```
git config --global user.nom "[Votre nom de compte github]"
git config --global user.email "[Votre email de compte github]"
```
Note : n'utilisez "--global" que si vous n'utilisez qu'un seul compte Git. 
Si vous en utilisez plusieurs via ce Git Bash n'utilisez pas le "--global" ceci affectera uniquement le dépôt en cours d'utilisation.  
6 - Rendez-vous dans le dossier de vos cours INF 2050  
7 - Créez un dosser dans lequel vous allez gérer vos Laboratoires.  
```
mkdir [nom du dossier]
```
8 - Entrez dans ce dossier  
```
cd [nom du dossier]
```
9 - Clonez ce dépôt en local sur votre ordinateur.  
```
git clone [url de votre depot forké]
```
10 - Vérifiez le statut de votre dépôt en local  
```
git status
```
