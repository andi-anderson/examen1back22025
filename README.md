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

1. En el lado izquiero verifico el archivo **pom.xml** y las dependencias
2. En el lado derecho sincronizo versiones del gestor de dependencias,
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


#CINCO
##GENERACION SEGUNDO COMMIT

**SE CREAN PAQUETES,CLASES,MODIFICADORES DE ACCESO,
  TIPOS DE DATOS Y ATRIBUTOS**

1. **Crear paquete**...En el paquete... 
 com.example.examen1backend22025...click derecho...new...Package...**modelos**
2. **Crear paquete**...En el paquete...
 com.example.examen1backend22025...click derecho...new...Package...**ayudas** 

3. **Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Curso**
4. **Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Docente**
5. **Crear Clase**...
 En el paquete "modelos"...click derecho...new...Java Class...**Usuario**

**Modificadores de acceso**
6. Se asignan modificadores de acceso, public para los paquetes y private para
 los atributos
7. En los tipos de dato se asigna integer para los "id", String para los
 demás atributos; los tipo "Enum" llevan nombre nemotécnico 
 con respecto al nombre del atributo, "variación en plural según el caso"
 ejemplo plural:   private Especialidades especialidad;
 ejemplo singular: private TipoUsuario tipoUsuario;

**Constructores, getter y setter**
8. Dentro de la clase, no! por fuera de los corchetes,después del ultimo atributo
 se agrega primero un constructor vacío, luego un constructor lleno y por
 ultimo getter and setter.
9. "**Construstor Vacío**"...Click derecho...Generate...Constructor...Select None 
10. "**Constructor LLeno**"...Click derecho...Generate...Constructor...
 Shift y selecciono todos los atributos...ok
11. "**Getter and Setter**"...Click derecho...Generate...Getter and Setter...
 Shift y selecciono todos los atributos...ok  y listo! tengo mi segundo commit.

 #SEIS
##GENERACIÓN TERCER COMMIT

SE CONFIGURA SERVIDOR **application.properties**,
SE CREA BASE DE DATOS **"phpMyAdmin"**,
SE ASIGNAN ANOTACIONES.

**Ingreso a XAMPP y enciendo "Apache" y "MySQL"**

**Configuración del servidor**
Configurar desde src/main/resources/application.properties
1.   spring.application.name= **"Nombre de archivo"**
2.   spring.datasource.url=jdbc:mysql://localhost/ **"Nombre base de datos"**
3.   spring.datasource.username=**root**"en producción se usan personalizadas"
4.   spring.datasource.password=**de ser requerido** "en producción son contraseñas fuertes"
5.   spring.jpa.hibernate.ddl-auto=**create** 
     "borra y vuelve a crear todas las tablas cada vez que inicia la app"

**Crear base de datos**
1. Ingreso en phpMyAdmin
- **"XAMPP"...Admin...+Nueva..."Nombre db"...Crear**

**Ingresar anotaciones**
- las anotaciones empiezan con @ "**lo especial**"
- siempre se ponen **encima** de aquello que quiero volver especial
- ejemplo para crear tabla: `@Entity
                             @Table(name="cursos")
                             public class Curso {}`

            




