
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
