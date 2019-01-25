# INF2050 Laboratoire 2 : Utilisation de Maven

## Au préalable
### Vérifier l'installation de Java
1. Dans le terminal de commandes taper :
```
java -version
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

## Comprendre le pom.xml
### Informations pour Maven
  ```
  <groupId>org.exemple.lab2</groupId>
  <artifactId>Lab2</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>
  ```
  1. groupId : organisation gérant le projet (fonctionne comme les packages de Java)
  2. artifactId : identifiant du projet
  3. version : version du projet (ici la version est la 1.0, -SNAPSHOT indiquant que c'est une version en cours de développement)
  4. packaging : génération de Maven (ici un .jar est généré)

Le projet Maven possède un identifiant qui doit être unique : groupId:artifactId:version

### Les informations du projet
Ici seront listées toutes les informations utiles au développement du projet afin d'informer les développeurs du contenu du projet.
  ```
    <name>Lab2</name>
    <description>
        INF2050 - Laboratoire 2 - Maven
    </description>
    <url>http://maven.apache.org</url>
  ```

### Les informations de développement
Ici seront listées toutes les information relatives à l'entreprise effectuant le développement. Cela peut être pratique en cas de mise en ligne du code source et de gestion des droits d'utilisation.
  ```
    <organization>
      <name> INF2050 </name>
      <url>https://github.com/Nouninoun/INF2050_Laboratoires</url>
    </organization>
  ```

### Les propriétés pour Maven
Permet d'indiquer à Maven des éléments qui sont vrais tout au long du projet. Cela peut être pratique lorsque l'on fait appel à un framework mettant à disposition plusieurs librairies et que l'on fait appel à la même version du framework. On définit alors la version à utiliser dans les propriétés et il n'est plus nécessaire de le préciser à chaque appel de librairies.
  ```
    <properties>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
  ```

### Le build pour Maven
Permet d'indiquer le comportement que Maven aura à l'exécution.
Exemple pour que le .jar connaisse automatiquement sa classe Main lors de son exécution :
  ```
    <build>
      <!-- On liste les plugins dont on souhaite modifier le comportement -->
      <pluginManagement>
        <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.0.2</version>
          </plugin>
        </plugins>
      </pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-jar-plugin</artifactId>
          <configuration>
              <archive>
                  <manifest>
                      <addClasspath>true</addClasspath>
                      <classpathPrefix>libs/</classpathPrefix>
                      <mainClass>
                          org.exemple.lab2.App
                      </mainClass>
                  </manifest>
              </archive>
          </configuration>
      </plugin>
      </plugins>
    </build>
  ```

  Maintenant pour lancer l'application il suffira d'écrire :
  ```
  java -jar target/lab2-1.0-SNAPSHOT.jar
  ```

# Manipulations
Les étapes suivantes nécessitent votre cours ainsi que des recherches de votre part (le corrigé vous sera fourni sur le Github)

## Ajout d'une fonction avec un test
### Ajout d'une fonction permettant d'effectuer une addition
Dans la classe App ajouter une fonction "add" prenant en paramètre deux int et retournant le résultat de l'addition de ces int.

### Ajout d'un test sur add()
Dans le fichier AppTest.java ajouter une fonction de test permettant de vérifier que la fonction add() effectue bien une addition.
Info : Ce test doit être effectué via un "assertTrue" accompagné d'un commentaire explicite sur le type d'erreur potentiellement trouvée.

### Ajouts dans le main pour intégrer la fonction add()
```
int a = 1452;
int b = 567;
int f = add(a,b);
```

### Vérifier votre test
1. Effectuer la commande
```
mvn package
```

Le build présente les lignes suivantes (spécifiquement 2 tests) :

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.exemple.lab2.AppTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
```

2. Modifier le comportement de la fonction add() afin qu'elle effectue un autre traitement qu'une addition.

3. Si tout est correct une erreur est trouvée lors du build :

```
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```
L'erreur est accompagnée d'explications et du commentaire ajouté dans le test.

4. Réparer l'erreur dans la fonction add().


## Ajout d'une dépendance
Dans le projet il va falloir faire appel à la fonction suivante :

```
StringUtils.isEmpty()
```

Elle permet de vérifier si un String est null ou non.
Le package StringUtils se trouve dans la dépendance Apache commons lang 3.  

1. Trouver la dépendance concernée sur : https://mvnrepository.com/
2. Modifier le pom.xml afin d'intégrer la dépendance
3. Utiliser le plugin org.apache.maven.plugins:maven-dependency-plugin afin que Maven charge la dépendance lors de la commande package

4. Faire un test sur le main  (attention ceci est du pseudo code ! vous devez coder votre if/else vous même)

```
if (StringUtils.isEmpty())
...
else
...
```

5. Effectuer un build et un run du projet afin de vérifier les étapes précédentes.
