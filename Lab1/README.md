# INF2050 Laboratoire 1 : Utilisation de Git

## Au préalable
Tout d'abord vérifiez votre installation de Git : [Installation de Git](GIT_installation.md)  
Ensuite prenez rapidement connaissance des commandes : [Liste des commandes pour Git](GIT_commandes.md)  
Vous pourrez vous servir de ce fichier de commandes comme aide mémoire.  


## Récupérez le Dépôt
Afin de pouvoir travailler sur votre propre copie du dépôt ci présent il va falloir que vous l'importiez sur votre propre compte Github.
Pour cela nous allons utiliser l'option FORK de Github.

### Récupération du dépôt sur Github
1. Connectez-vous à votre compte Github sur https://github.com/  
2. Rendez-vous sur le dépôt suivant : https://github.com/Nouninoun/INF2050_Laboratoires  
3. Effectuez un fork du dépôt : ![alt text](https://github.com/Nouninoun/INF2050_Laboratoires/blob/master/Lab1/img/lab1_fork.png "Github fork")  

### Récupération du dépôt en local
4. Ouvrez Git Bash  
5. Prévenez le Git Bash de votre identité  
```
git config --global user.name "[Votre nom de compte github]"
git config --global user.email "[Votre email de compte github]"
```
Note : n'utilisez "--global" que si vous n'utilisez qu'un seul compte Git. 
Si vous en utilisez plusieurs via ce Git Bash n'utilisez pas le "--global" ceci affectera uniquement le dépôt en cours d'utilisation.  

6. Rendez-vous dans le dossier de vos cours INF 2050  
7. Créez un dossier dans lequel vous allez gérer vos Laboratoires.  
```
mkdir [nom du dossier]
```
8. Entrez dans ce dossier  
```
cd [nom du dossier]
```
9. Clonez ce dépôt en local sur votre ordinateur.  
```
git clone [url de votre depot forké]
```
10. Vérifiez le statut de votre dépôt en local  
```
git status
```

## Manipulations sur le dépôt
### Modification sur un fichier
Ouvrez votre Explorateur de fichiers (Windows, Linux ou Mac).  
Vous trouverez le dépôt là ou vous avez effectué le clone.  
Dans le dossier /INF2050_Laboratoires/Lab1/projet vous trouverez un fichier nommé README.md.  
Un fichier \*.md est un fichier Markdown. C'est un fichier faisant usage du langage Markdown, souvent utilisé sur Github pour les README car ils peuvent s'afficher directement sur la page Github (en dessous des fichiers).  
Ouvrez le fichier README.md sur votre IDE préféré (Atom, Notepad++, Sublime...).  
Modifiez le fichier pour insérer votre nom et ce que vous souhaitez afficher à l'écran sur votre dossier Github.  

### Appliquer vos nouvelles modifications sur le dépôt Github
#### Sur votre Git Bash (ou console sur Linux)
Rendez-vous dans la racine de votre dépôt.  
Vérifiez le statut de votre dépôt local :  
```
git status
```
Git devrait vous indiquer que des changements ont été effectués sur votre copie locale ainsi que des informations sur ces changements.  

Indiquer à Git que vous souhaitez référencer des fichiers :  
```
git add .
```
Indiquer à Git que vous souhaitez référencer tous les changements apportés aux fichiers :  
```
git commit -m "modifications dans le README du projet lab1"
```
Indiquer à Git d'appliquer ces changements sur le dépôt distant :  
```
git push origin master
```

### Vérifier vos modifications
Rendez-vous sur Github.com dans votre dépôt.  
Allez dans le dossier /Lab1/projet/.  
Vos modifications devraient apparaitre sous votre liste de fichiers.  

## Résoudre un conflit de version
### Créer un conflit de version
Quand on travaille à plusieurs sur un dépôt distant il est plus que probable de rencontrer des conflits.  
Souvent cela se produit lorsque plusieurs personnes travaillent en même temps sur un même fichier.  
Cas de figure :  
- A et B sont deux collaborateurs sur un même dépôt Git.  
- A effectue des changements sur le fichier /Lab1/projet/README.md.  
- B effectue également des modifications au même endroit sur le même fichier.  
- A push ses changements.  
- B push ses changements => Git lui renverra une erreur lors de son push.  

Afin de simuler ces modifications voici la démarche :  
1. Modifiez le fichier README.md sur Github.com en modifiant votre nom et validez ces modifications  
2. Modifiez le fichier README.md sur votre ordinateur en modifiant votre nom (pour autre chose que 1-)  
3. Effectuez la boucle normale de add-commit-push.  

Vous rencontrez l'erreur de push indiquant qu'un autre push entre en conflit avec le votre.  
![alt text](https://github.com/Nouninoun/INF2050_Laboratoires/blob/master/Lab1/img/lab1_fetchfirst.PNG "Git error")  

4. Effectuez un  pull. Dans le fichier que vous avez modifié vous trouverez un message d'erreur Git vous indiquant :  
HEAD : vos dernières modifications entrant en conflit.  
\<xxxxxxxxxx\> : les modifications effectuées sur Github.  
Supprimez les messages d'erreur ainsi que la version que vous ne souhaitez pas garder des modifications.  

5. Effectuez la boucle add-commit-push. Tout est rentré dans l'ordre.  
