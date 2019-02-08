# INF2050 Laboratoire 3 : Mise en place de tests unitaires sur IntelliJ

## Au préalable
### Vérifier l'installation de Java
1. Dans le terminal de commandes taper :
```
java -version
```
Se référer au Lab2 en cas de soucis.

### En cas de problèmes de lib dans IntelliJ
Cliquez sur le problème de librairie et reportez vous au menu contextuel de débugage (ALT + ENTREE).

## Une base de travail
### Créer un projet Java

Créer un nouveau projet Java vide sur IntelliJ IDEA.
Dans ce projet nous aurons besoin de :
1- La classe Functions
Celle-ci comprendra une fonction d'addition et une fonction de soustraction que vous implémenterez vous même.

2- La classe Main
Qui contient 2 Scanner d"entrée afin de récupérer deux valeurs tapées par l'utilisateur.
Une implémentation de la fonction add (ou sub) de la classe Functions.
Un print du résultat.

Votre programme se présentera sous la forme :  
![alt text](https://github.com/Nouninoun/INF2050_Laboratoires/blob/master/Lab3/img/001.png)  


## Mettre en place ses tests
### Isoler ses tests
Par convention on essaie de séparer les fichiers de test des autres fichiers.
Dans votre projet créez un dossier nommé "Test".
Dans ce dossier créez un fichier nomme "FunctionsTest".

### Les tests que nous mettrons en place :
1- Créer un Test BeforeAll qui effectue un new sur la classe Functions que nous avons créé toute à l'heure. Ce new nous permettra de réutiliser les fonctions add et sub présentes dans Functions.

2- Créer un Test \@Test qui vérifie que la fonction add() effectue bien une addition. (vous allez devoir utiliser la fonction assertEquals())

3- Créer un Test \@Test qui vérifier que la fonction sub() effectue bien une soustraction.

4- Créez un Test \@AfterEach qui effectuera un println affichant "Le Test [nom du test précédent] est OK"

## Pour aller plus loin
### Nommer ses tests
Afin que les tests soient plus lisibles utilisez l'annotation \@DisplayName qui permettra à IntelliJ de réafficher le nom du test dans son interface.

### Exploration libre
Sentez-vous libre d'explorer tous les types de tests applicables dans JUnit5 et 4.
