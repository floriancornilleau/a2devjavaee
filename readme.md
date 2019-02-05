
# MVC en Java EE

* Route : 
  * soit via /WEB-INF/web.xml
  * soit par Annotation : @WebServlet
* Controller : Servlet
* View : JSP
* Model : pas de modele à l'étape actuelle

# Structure du projet en Java EE

* src
  * build.gradle
  * main
    * java
      * fr.imie
        * HelloServlet
    * resources
    * webapp
      * WEB-INF
        * views
          * hello.jsp
  * test
    * java
    * resources

# MVC avec Spring

* Configuration : Fichier /WEB-INF/web.xml
* Route : Annotation @RequestMapping
* Controller : Annnotation @Controller
* View : JSP
* Model : pas de modele à l'étape actuelle

# Structure du projet en Java EE

* src
  * build.gradle
  * main
    * java
      * fr.imie
        * HelloController
    * resources
    * webapp
      * WEB-INF
        * web.xml
        * views
          * hello.jsp
  * test
    * java
    * resources
