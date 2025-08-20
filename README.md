#EXAMEN BACKEND2 PRIMER MOMENTO
##Proyecto de clase

###PRIMERO
**Preparando el entorno de trabajo y generación del primer commit**

Ingreso a **Spring Initializr**, allí creo por así decir el esquelo del
proyecto
-Selecciono Maven
-En Artifact va el nombre del proyecto en este caso Examen1back22025
-En description, va una descripción la cual no escribí para este 
 proyecto , pero lo dejo asentado en README.md
-**En ADD DEPENDENCIES para este proyecto selecciono**
1. Spring web **WEB**
2. My SQL Driver **SQL**
3. Spring Data JPA **SQL**
4. H2 Database **SQL**
5. Spring Boot Devtools **DEVELOPER TOOLS**
6. Selecciono el Botón **GENERATE**  y listo! ya tengo mi archivo.
7. En **descargas** descomprimo el archivo...Click derecho...Abrir en Intellij

###SEGUNDO
**Preparar el entorno de trabajo**

-En el lado izquiero verifico el archivo **pom.xml** y las dependencias
-En el lado derecho sincronizo versiones del gestor de dependencias,
 ubicando el icono **m**...click...ubico la carpeta "Examen1back22025",
 despliego...lifecycle...despliego...Clean con doble click y despues 
 recargo desde **Maven**

###TRES
**Verificar started en el servidor**

-En el lado izquierdo ubico src...main...java...en la "Clase" 
 Examen1back22025 le doy doble click...public class Examen1back22025
 le doy **play** y debo visualizar el estado del servidor,marca,puerto y
 conexión. Y listo! ya tengo mi servidor corriendo.

###CUATRO
**Crear repositorio en GitHub**
-En descargas busco de nuevo el archivo "Examen1back22025" y lo abro en
 Git Bash para generar el primer commit. Y listo! tengo mi primer commit.


#QUINTO
##GENERACION SEGUNDO COMMIT

**SE CREAN PAQUETES,CLASES,MODIFICADORES DE ACCESO,
  TIPOS DE DATOS Y ATRIBUTOS**

-**Crear paquete**...En el paquete... 
 com.example.examen1backend22025...click derecho...new...Package...**modelos**
-**Crear paquete**...En el paquete...
 com.example.examen1backend22025...click derecho...new...Package...**ayudas** 

-**Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Curso**
-**Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Docente**
-**Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Usuario**

**Modificadores de acceso**
-Se asignan modificadores de acceso, public para los paquetes y private para
 los atributos
-En los tipos de dato se asigna integer para los "id", String para los
 demás atributos; los tipo "Enum" llevan nombre nemotécnico 
 con respecto al nombre del atributo, "variación en plural según el caso"
 ejemplo plural:   private Especialidades especialidad;
 ejemplo singular: private TipoUsuario tipoUsuario;

**Constructores, getter y setter**
-Dentro de la clase, no! por fuera de los corchetes,después del ultimo atributo
 se agrega primero un constructor vacío, luego un constructor lleno y por
 ultimo getter and setter.
-"**Construstor Vacío**"...Click derecho...Generate...Constructor...Select None 
-"**Constructor LLeno**"...Click derecho...Generate...Constructor...
 Shift y selecciono todos los atributos...ok
-"**Getter and Setter**"...Click derecho...Generate...Getter and Setter...
 Shift y selecciono todos los atributos...ok  y listo! tengo mi segundo commit.

 





