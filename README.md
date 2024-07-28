# Servidor web en Java

## Descripción del proyecto

Este proyecto consiste en un servidor web implementado en Java.  
El proposito de este proyecto es aprender el funcionamiento más básico
de un servidor web.  

## Como ejecutar el servidor


### Clona el proyecto
Primero clona el proyecto y genera fuera del mismo un archivo index.html
siguiendo el ejemplo siguiente.  


.\servidorWeb  
index.html

El archivo "index.html" debe estar fuera de la carpeta principal del proyecto.

### Compila y ejecuta el proyecto

Muevete a la carpeta raiz del proyecto, abre un terminal y compila el proyecto  

``javac src/Main/Main.java src/Main/Archivo.java src/Main/ClientHandler.java``

Luego ejecutalo con el siguiente comando.  

``java -cp src Main.Main [puerto]``

El proyecto  recibe como argumento opcional el pueto en el que escuhará las peticiones.  
En caso de no especificarlo usará por defecto el puerto 8080.