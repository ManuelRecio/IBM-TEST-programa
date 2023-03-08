# IBM-TEST-proragama
IBM-TEST-ManuelRecioReal


Se van a definir una serie de pasos para la ejecución del programa y la ruta donde encontrar el fichero.txt creado.

PASO 1
Crear una carpeta en la ruta C:/JavaArchivos. Será en JavaArchivos donde se genere el archivo fichero-proyecto.txt.

PASO 2
Se debe crear una conexión con perfil root (Tanto usuario como contraseña: root/root) para ejecutar en ella el script aportado para la creación del esquema bd_proyectobs, la tabla proveedores y los datos de ejemplo. Si se usa MySQL Workbench se puede importar directamente a través de Server>Import Data>Import from Self-Contained File y seleccionamos nuestro script.sql. Una vez ejecutado el script tendremos un esquema llamado bd_proyectobs con la tabla proveedores en ella.

Datos de la conexión configurada
URL_conexion: jdbc:mysql://localhost:3306/bd_proyectobs
USUARIO: root
PASS: root

Nota: el puerto 3306 es el usado por defecto por MySQL.

PASO 3
Se creará una carpeta en el Escritorio con el nombre que queramos para poner nuestro programa.jar y poder ejecutarlo a través de la Consola de Sistema. Se necesita tener configurado en el PATH de JAVA para la variable de entorno un JDK compatible, pues vamos a utilizar el comando java -jar en la ejecución. (En mi caso, utilizo JAVA17).

PASO 4
Abrimos una Consola de Sistema en la ruta de nuestra carpeta creada en el escritorio. (Podemos ejecutarla dentro de nuestro explorador de Windows utilizando CMD en la ruta y accederemos directamente)

PASO 5
Una vez nos encontremos en la ruta de nuestro ejecutable "programa.jar" podemos ejecutar el siguiente comando:

java -jar programa.jar X 

Donde programa.jar es el nombre que en mi caso se le ha dado al ejecutable y X el id del cliente por el cual se quiere obtener los proveedores asociados.

Una vez ejecutado nos mostrará un mensaje en función de la consulta ha sido exitosa o no. En caso de ser correcta puede consultar los resultados en el fichero txt creado en C:/JavaArchivos/fichero-proyecto.txt .

En cuanto a dependencias utilizadas. Además de las propias libreras de JAVA 17, se ha incluido en las referenciadas mysql-connector-j-8.0.32 para poder establecer la conexión con MySQL.

En caso de dudas, se ha adjuntado en el correo un Manual de Entrega donde se explican estos pasos acompañados de imágenes.
