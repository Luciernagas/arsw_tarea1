## INTRODUCCIÓN A JAVA, MVN Y GIT: CONTEO LOC
## 14 de junio del 2023

### Tiempo dedicado a este proyecto y cálculo LOC/h
♡ El tiempo dedicado al proyecto fue una hora en clase y dos horas en casa.

♡ En total se realizaron 72 lineas

LOC = (72/3) = 24

### Prerrequisitos
Se debe tener instalado java, maven y git.
* Descargar maven en  http://maven.apache.org/download.html
* Descargar git en https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

### Ejecutando las pruebas
La estrucutura para ejecutar la prueba es la siguiente:
```
java -cp "./target/classes" co.edu.escuelaing.arsw.countLines.countlines loc/phy "ubicacion de la clase que desea ejecutar"
```
A continuación se muestra la ejecucion de las pruebas y la estructura mencionada anteriormente: 
* En la primeras pruebas podemos observar que se esta demostrando el correcto funcionamiento del algoritmo realizado, podemos observar que cuando se ejecuta con "loc" se obtiene lo esperado que es que nos demuestre que no se conto ninguna linea de comentario o en blanco, por ello su resultado es 36, por otro lado cuando se ejecuta "phy" podemos observar que cuenta todas las lineas y nos da como resultado 52 lineas.
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/c31bc6c6-b855-4c2f-9839-d73630dd9606)
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/f1ffecd7-601f-47dc-9fd5-32cdc7ce72ed)

pruebas:
* En la primera prueba se planea demostrar el funcionamiento cuando se tiene un archivo todo comentado, podemos observar que cuando se ejecuta con "loc" se obtiene lo esperado que es que nos demuestre que no se conto ninguna linea, por otro lado cuando se ejecuta "phy" podemos observar que cuenta todas las lineas y nos da como resultado 52 lineas.
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/7a5c5d9e-f393-4b6c-bf1c-4c1e002a94c2)
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/58b45fa1-3173-4da0-87aa-62c40ebd63c7)

* En esta prueba se tiene un codigo sencillo, en el cual solo queremos verificar que la linea en blanco no es contada cuando se ejecuta el "loc" pero cuando se ejecuta el "phy" si se contara.
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/154c0bf5-6828-477c-903c-048d89bf5e53)
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/12d21b6c-c475-4b87-8a84-2c064ca86ea7)

## Diagrama de clase
![image](https://github.com/Luciernagas/arsw_tarea1/assets/104604359/9697b731-5a00-43ac-af42-6ea044ec49fb)

Se puede observar que solo se tienen dos clases, la clase principal la cual es countlines la cual tiene un método main, el cual es el que hace que la aplicacion se pueda ejecutar, tambien tenemos la clase counter la cual tiene dos métodos, el primero es countlines el cual lee el archivo teniendo en cuenta la validacion y realiza el conteo de lineas, la segunda es confirmlines el cual confirma si la linea es vacia o un comentario.

En el diagrama se tiene una relación 1 a 1, esto nos indica que se relaciona directamente con una y solo una instancia de otra clase.

## Licencia
Este proyecto esta autorizado bajo la licencia que se puede encontar en el archivo LICENSE.txt, en el se pueden encontrar los detalles

## Contribuidores
♡ Luisa Valentina De la hoz Rocha ♡


