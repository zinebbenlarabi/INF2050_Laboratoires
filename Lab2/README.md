# INF2050 Laboratoire 2 : Utilisation de Maven

## Au préalable
### Vérifier l'installation de Java
1. Dans le terminal de commandes taper :
```
java --version
```

2. Si la commande renvoie un numéro de version alors Java est bien installé.

3. Sinon installer Java (redémarrer votre machine si nécessaire) :  
Pour Linux : https://www.java.com/fr/download/help/linux_x64_install.xml  
Pour Windows : https://www.java.com/fr/download/help/windows_manual_download.xml  
Pour Mac OS X : https://www.java.com/fr/download/help/mac_install.xml  
Pour toute autre OS : https://www.java.com/fr/download/help/index_installing.xml?os=All+Platforms&j=8&n=20  

### Installation de Maven
(Sous Linux un apt gère l'installation)  
1. Télécharger Maven pour votre OS à l'adresse suivante : https://maven.apache.org/download.cgi  
2. Installer Maven : https://maven.apache.org/install.html  
3. Vérifier l'installation de Maven (terminal de commande) :  
```
mvn --version
```  

## Générer le projet Maven
1. Créer un dossier dans lequel le projet sera monté.
2. Dans le terminal de commande se rendre dans le nouveau dossier créé.
3. Créer le projet Maven :  
```
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.1
```  
4. Remplir les champs suivants :  
groupid : org.exemple.lab2  
artifactId : lab2  
version : [ENTREE]  
package : [ENTREE]  
[ENTREE]   

## Comprendre ce que Maven vient d'effectuer
1. Visiter le dossier Lab2 créé par Maven et trouver l'application "Hello World" qui vient d'être créée.

2. Ouvrir le fichier pom.xml qui est le fichier de configuration de Maven.

3. Modifier le fichier pom.xml afin d'utiliser la bonne version de compiler. Ajouter les lignes suivantes entre les balises <properties\> :  
```
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>
```  
4. En ligne de commande, à la racine du dossier Lab2 entrer la commande suivante :  
```
  mvn package
```  
Ce que Maven effectue après cette commande :  
Copie des sources
Compilation de l'application  
Compilation des tests  
Test de l'application   
Génération du .jar de l'application  

5. Tester l'application générée :  
```
java -cp target/Lab2-1.0-SNAPSHOT.jar org.exemple.lab2.App
```  
Celle-ci devrait renvoyer un "Hello World" dans la console.  
