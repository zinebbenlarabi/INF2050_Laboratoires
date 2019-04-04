# INF2050 Laboratoire 7 : Selenium et l'automatisation de tests

## Selenium
Selenium est un framework de test qui permet d'automatiser des actions sur des fureteurs. Cela permet d'automatiser des actions utilisateurs sur une application web pendant l'exécution de celle-ci.

### Selenium IDE
Extension de Firefox ou Chrome permettant d'enregistrer des séquences d'actions à reproduire pour des tests.


#### Mise en place de l'environnement de Selenium IDE
Afin d'intégrer Selenium IDE dans votre fureteur il suffit de télécharger et installer l'extension correspondante à votre fureteur.  
Chrome :
```
Menu > Extensions > Menu Extension (a gauche) > Open Chrome Web Store
Recherchez
```
Firefox :
```
Menu > Modules complémentaires >  Catalogue > "Découvrir davantage de modules"
```

Recherchez Selenium IDE et installez le.

#### Faire un test
Vous pouvez activer l'extension Selenium IDE en cliquant dessus en haut à droite de votre écran.  
Essayez de lancer un "Nouveau test sur un nouveau projet".  
Configurez votre test pour qu'il s'effectue sur http://google.ca.  
Effectuez une recherche.  
Arrétez votre enregistrement (bouton stop sur la fenetre de Selenium IDE).  
Lancez le test automatique (bouton lecture une fois le test sélectionné dans la liste à droite).  
Regardez ce qu'il se passe.  
Parcourez les options de Selenium IDE pour extraire le test (enregistrer) ou modifier la vitesse d'exécution du test.  


### Selenium WebDriver
Driver permettant d'écrire des tests en différents langages (PHP, Python, Java, Ruby, .NET, Perl)

#### Mise en place de Selenium Driver
Vérifiez votre installation de Java (version).  
Nous allons devoir télécharger et extraire les drivers (.jar) nécessaires à l'exécution de Selenium Driver dans un environnement Java pour votre distribution : https://docs.seleniumhq.org/download/  
Nous allons télécharger et extraire le driver pour Selenium : https://github.com/mozilla/geckodriver/releases (Sélectionnez celui de votre distribution) et l'extraire.  
Créer un nouveau projet sur Eclipse.  
Ajoutez TOUS les .jar présents dans l'archive précédemment téléchargée dans le classpath du projet. (Properties > Java Build Path > Libraries > Add external jars).  

Créer un nouveau package nommé "selenium".  
Créer, dans ce package, une classe "FirstTestCase" en cochant la case "public static void main(String[] args)".  

Intégrer ce code dans votre classe :  
```
public class FirstTestCase {

	 public static void main(String[] args) throws InterruptedException {

		// On créé une nouvelle instance de Driver pour Firefox !!!Changez le path du geckodriver sur votre propre machine !!!
		System.setProperty("webdriver.gecko.driver", "/home/nouninoun/Bureau/tutoselenium/gecko/geckodriver");
		WebDriver driver = new FirefoxDriver();

		//On lance google.ca dans notre test
		driver.get("http://www.google.ca");

		// On imprime un message après l'ouverture
		System.out.println("Successfully opened Google");

		// Attente de 5s
		Thread.sleep(5000);

		// On ferme le Driver
		driver.quit();
	}
}
```  
Réglez les import manquants (Eclipse vous propose les corrections d'import par défaut).  
Lancez cette classe et voyez ce qu'il se passe.  

## Pour aller plus loin
Vous pouvez vous servir de Selenium IDE afin d'enregistrer une séquence d'actions sur un site internet puis enregistrer cette séquences afin de la réutiliser par la suite dans vos tests. Enregistrez une séquences et voyez ce qui est enregistré dans le fichier .side que vous téléchargez.
