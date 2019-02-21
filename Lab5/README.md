# INF2050 Laboratoire 5 : Outil d'intégration continue
## Au préalable
Ce Laboratoire se découpe en quatre parties :  
1 - Créer un nouveau repo Git  
2 - Transférer le projet Maven du Laboratoire 2 dans ce nouveau repo  
3 - Lier le nouveau repository à Travis CI  
4 - Configurer Travis CI afin qu'il build automatiquement le projet.  


## Créer un nouveau repository
Créez un nouveau Repository PUBLIC sur votre compte Github en faisant usage de l'interface graphique de Github.

## Récupérez ce repository
Récupérez votre repository sur votre ordinateur à l'aide d'un git clone sur votre nouveau repository.  
!!! Attention ce repo doit être seul dans un dossier et ce dosser ne peut pas être contenu dans un dossier déjà lié à un autre repo !!!

## Intégrer le contenu nécessaire pour le Laboratoire
Dans ce nouveau repository Git vous allez devoir intégrer le nécessaire afin d'utiliser Travis CI.
À la racine de ce nouveau repository intégrez :  
- Le dossier "src" du Lab2  
- le fichier pom.xml du Lab2  

## Travis CI
### Créer un compte Travis CI
Afin d'utiliser Travis CI il vous faut créer un compte sur : https://travis-ci.com/ .  
Ce compte doit-être créé à partir de votre compte Github.

### Lier votre repository à Travis CI
1 - Dans Github allez dans Settings > Applications > Travis CI > Configure  
2 - Dans "Repository access" ajoutex votre repository pour le Lab5  
3 - Sauvegardez.  

## Travis CI pour votre projet
### Configuration (.travis.yml)
https://docs.travis-ci.com/user/tutorial/  
En local sur votre PC créez un fichier .travis.yml en racine de votre repository.  
Afin que Travis CI soit en capacité d'effectuer le build de votre application vous devez lui indiquer le "language" dans ce fichier .yml .  

### Activer Travis CI
Effectuer la boucle classique de commandes Git afin de push vos modifications sur votre repository.  
Si toutes les étapes ont été respectées Travis CI va être en capacité d'effectuer le build de votre application sur votre Github à partir des fichiers .travis.yml et pom.xml .  
Vérifiez le statut de votre build sur https://travis-ci.com/ > Dashboard.  
Analysez un peu votre "Job log" afin de constater les différences et similitudes avec le terminal de commande lorsque vous effectuez un build Maven.
