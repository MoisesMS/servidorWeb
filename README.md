# Servidor web en Java

## Descripción del proyecto

Este proyecto consiste en un servidor web implementado en Java.  
El proposito de este proyecto es aprender el funcionamiento más básico
de un servidor web.  

## Como ejecutar el servidor


### Clona el proyecto
Primero clona el proyecto

El archivo "index.html" Se encuentra en la carpeta static

### Compila y ejecuta el proyecto

Muevete a la carpeta raiz del proyecto, abre un terminal y compila el proyecto  

``javac src/Main/Main.java src/Main/Archivo.java src/Main/ClientHandler.java``

Luego ejecutalo con el siguiente comando.  

``java -cp src Main.Main [puerto]``

El proyecto  recibe como argumento opcional el pueto en el que escuhará las peticiones.  
En caso de no especificarlo usará por defecto el puerto 8080.