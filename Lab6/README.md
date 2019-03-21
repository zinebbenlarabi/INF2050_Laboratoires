# INF2050 Laboratoire 6a : Utilisation avancée de Git

## Les branches
Une branche est une copie parallèle à votre repo master. on créé une branche lorsqu'on a besoin de travailler sur des versions de code différentes de la branche principale.
Cela peut être utile dans des projets live car cela permet de conserver une branche principale de production, une branche secondaire de tests, des branches de développement en fonction des équipes, etc.

Afin de connaître la liste des branches de votre dépot, la branche accompagnée d'une * est la branche actuellement active sur votre invite de commandes :
```
git branch
```  

Afin de naviguer entre les branches (pour rendre active une autre branche) :
```
git checkout [nom de la branche]
```  
Afin d'effectuer ces deux manipulations simultanément utilisez l'option -b :
```
git checkout -b [nom de la branche]
```  

## Une fois le travail séparé en branches
L'utilité de travailler sur des branches séparées est de ne pas impacter directement la branche principale par les modifications apportées. Mais une fois que la branche de test a été vérifiée et approuvée il s'agit de la rappatrier sur la branche de production. Pour cela deux possibilités s'offrent aux utilisateurs de Git : le "merge" le "rebase".
### Les merges
Le merge permet de rappatrier le travail d'une branche vers une autre .
Pour cela il faut rendre la branche sur laquelle on veut rappatrier le travail, et effectuer la commande merge vers la branche contenant les modifications.
```
git checkout [nom de la branche d'origine]
git merge [nom de la branche de destination]
```
Ou signifier l'origine et la destination du merge dans la même commande :
```
git merge [origine] [destination]
```
La branche destination contiendra alors le code modifié depuis la branche origine. Les branches existantes ne sont pas structurellement modifiées. Cependant si beaucoup de modifications avaient été effectuées dans la branche destination, tous les commits de cette branche vont être appliqués à la branche origine et ils serontajoutés dans les logs de commit de la branche d'origine. Cela peut vite devenir difficile de savoir quels commits ont eus lieu sur quelle branche.

Lors d'un merge il peut y avoir des conflits ils se résolvent de la même manière que les conflits lors d'un pull/push.


### Les rebases
Le rebase effectue la même action de base qu'un merge : il permet de rappatrier le travail effectué sur une branche B vers une branche A.
Le rebase s'effectue sous cette forme :
```
git checkout [nom de la branche d'origine]
git rebase [nom de la branche de destination]
```
La spécificité du rebase se situe au niveau des logs des commits. Au lieu d'appliquer les mêmes commits à la destination, Git effectue un rennomage des commits et applique les modifications à la branche de destination comme si c'était de nouveaux commits. L'historique reste donc spécifique à chaque branches du projet et donne des logs beaucoup plus propres et compréhensibles.


### Pourquoi un merge ? Pourquoi un rebase ?
Un rebase est beaucoup plus dangereux qu'un merge. Si le rebase rencontre une erreur alors les deux branches peuvent s'en trouver affectées.  
Dans quel cas un risque est présent ?    
Dans le cas d'une branche master partagée entre plusieurs personnes. Supposons une branche master (A) et vous travaillez sur une branche test (B). D'autres personnes travaillent sur la branche A. Lorsque vous effectuez un rebase cela rappatrie les informations sur une nouvelle branche master. Mais les autres utilisateurs eux conservent la branche A d'origine. Il y aura donc conflit entre A et votre nouveau master. Le seul moyen de resynchroniser cela est d'effectuer à nouveau un merge entre A et le master.  
Il est possible de forcer le push vers la branche master sur le dépot distant, mais cela peut entrainer beaucoup d'erreurs avec le travail déjà en cours d'autres personnes.

## Les tags
Lorsque l'on travaille sur un projet d'envergure il est souvent conseillé de séparer les étapes de travail en versions, par exemple lorsque l'on fait de grosses modifications, ou que l'on rajoute beaucoup de contenu.
Afin de séparer ces versions sur Git il est possible de créer sur Git ce que l'on appelle des "Tag".
Commande pour visualiser la liste des tags :
```
git tag
```  
Si un projet possède de nombreux tags (ex v1.0.1 jusqu'à v5.5.2), il est possible de ne visualiser qu'une partie de la liste des tags avec l'option -l.
```
git tag -l v5.5.*
```  
Afin de créer un tag sur un dépot on utilise toujours la commande git tag :
```
git tag -a v5.5.3 -m "Version finale 5.5.3"
```  
L'option -a permet de remplir les informations contenues dans le tag et l'option -m permet d'ajouter un commentaire qui accompagnera le tag.

# Laboratoire 6b : Mise en contexte
Vous allez créer un environnement Git pour un projet en entreprise pour cela vous allez avoir besoin des branches : master, hotfix, release, development, feature.

## Les branches

### Master
Elle sera votre branche principale contenant votre application donnée au client.  

### Hotfix
Elle est créée à partir de la branche MASTER. Une fois le hotfix finit elle envoie ses données vers MASTER et DEVELOPMENT. Elle servira pour les traitements de bugs rapides qui doivent être appliqués pour assurer le fonctionnement de l'application live.  

### Release
Elle est créée à partir de la branche DEVELOPMENT. Elle servira de point d'entrée d'une partie de développement finie. Elle envoie ses modifications à la branche master.

### Development
Elle est créée à partir de la branche MASTER. Elle servira de rappatriement des différentes features et des modifications apportées au projet. Elle envoie ses modifications en créant la branche RELEASE.

### Feature
Elle est crée à partir de la branche DEVELOPMENT. Elle servira au développement d'une nouvelle fonctionnalité de votre projet. LEs modifications apportées sur cette branche seront envoyées vers la branche DEVELOPMENT.

## Maniuplation des branches
1- Créez un nouveau dépot git  
2- Créez un fichier README.md dans votre branche master  
3- Créez une branche development à partir de ce master  
4- Créez une branche feature à partir de la branche development.  
