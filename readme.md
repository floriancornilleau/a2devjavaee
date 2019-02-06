
# Pourquoi un projet web ?

Cross-Platform : Facilite le développement, la maintenance et le déploiement.

# Pourquoi une application web plutôt qu'un site ?

Mutualiser plusieurs applications sur un même serveur.

# Pourquoi en Java ?

Gains de performance et de montée en charge grace aux conteneurs.

# MVC en Java EE

* Route : Annotation @WebServlet
* Controller : Servlet
* Model : DAO avec JPA (mais sans Spring)
* View : JSP

# Structure du projet en Java EE

* .gitignore
* build.gradle
* src/
  * main/
    * java/
      * fr/imie/
        * Xyz
        * XyzServlet
    * resources/
      * META-INF/
        * persistence.xml
    * webapp/
      * WEB-INF/
        * views/
          * xyz.jsp
  * test/ (facultatif pour ce cours)
    * java/
    * resources/

# MVC avec Spring

* Configuration : 
  * /WEB-INF/web.xml
  * /WEB-INF/spring-servlet.xml
* Route : Annotation @RequestMapping
* Controller : Annotation @Controller
* Model : Repository avec Spring Data JPA
* View : JSP

# Structure du projet avec Spring

* .gitignore
* build.gradle
* src/
  * main/
    * java/
      * fr/imie/
        * Xyz
        * XyzController
        * XyzRepository
    * resources/
      * META-INF/
        * persistence.xml
    * webapp/
      * WEB-INF/
        * web.xml
        * spring-servlet.xml
        * views/
          * xyz.jsp
  * test/ (facultatif pour ce cours)
    * java/
    * resources/

# Travail en groupe de 2 ou 3 pers

1) rendu d'un projet git avec la structure présentée plus haut (Java EE)

pour rappel : 

* .gitignore
* build.gradle
* src/
  * main/
    * java/
      * fr/imie/
        * Xyz
        * XyzServlet
    * webapp/
      * WEB-INF/
        * views/
          * xyz.jsp

contraintes : 
* affichages en francais dans les vues
* code variables en anglais
* code html valide

contenu du rendu git : 
* un formulaire html pour saisir les informations suivantes : 
prénom, nom, email de une personne
* +1 point si le formulaire est inclus dans un tableau et html valide
* une servlet pour exploiter les données saisies
* une jsp pour afficher les données saisies

v1 : afficher seulement les dernieres données saisies
v2 : afficher tous les contacts saisies dans une table

le formulaire et la table peuvent etre au meme endroit, pas obligatoire de faire 2 fichiers (html, jsp)
