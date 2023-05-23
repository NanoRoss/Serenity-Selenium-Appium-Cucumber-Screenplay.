
## README CENCOui

### Contexto:

```
Este proyecto tiene como objetivo automatizar el escenario de éxito y de error de la funcionalidad de inicio de sesión en la aplicacion proporcionada
```

### Tecnologia Utilizada:
```
Se utilizarán los siguientes frameworks y tecnologías: Serenity/Selenium, Appium, Cucumber y el patrón de diseño Screenplay.
El lenguaje de programación utilizado será Java.

1. Serenity/Selenium
Serenity es un framework de automatización de pruebas que proporciona una capa de abstracción sobre Selenium. Permite escribir pruebas en lenguaje natural y ofrece una forma estructurada de organizar las pruebas. En este proyecto, utilizaremos Serenity para manejar las interacciones con la aplicación web.

2. Appium
Appium es un framework de automatización de pruebas diseñado específicamente para aplicaciones móviles. Permite interactuar con aplicaciones nativas, híbridas y web en dispositivos Android e iOS. En este proyecto, utilizaremos Appium para automatizar las pruebas en la aplicación móvil relacionadas con el inicio de sesión.

3. Cucumber
Cucumber es una herramienta de desarrollo de software que admite el comportamiento impulsado por el desarrollo (BDD, por sus siglas en inglés). Permite escribir pruebas en un lenguaje fácil de entender por los stakeholders y luego traducir esas pruebas a código ejecutable. Utilizaremos Cucumber para definir los escenarios de prueba en un formato legible y comprensible.

4. Patrón de Diseño Screenplay
El patrón de diseño Screenplay es un enfoque para estructurar y organizar las pruebas de automatización. Proporciona una abstracción más clara y orientada a las acciones que se realizan en la interfaz de usuario, facilitando el mantenimiento y la legibilidad de las pruebas. Utilizaremos el patrón de diseño Screenplay para desarrollar las interacciones con la aplicación en un formato más estructurado.
```

### Problemas Encontrados:
```
Durante el desarrollo del proyecto de automatización, se identificaron y resolvieron los siguientes problemas:

1)
No se proporcionaron los valores necesarios para las propiedades appium.appPackage y appium.appActivity.
Estas propiedades son requeridas para interactuar con la aplicación bajo prueba.
Para solucionar este problema, se utilizó una aplicación adicional que genera información de otras aplicaciones.
De esta manera, se obtuvieron los valores necesarios para las propiedades faltantes.

2)
Se encontró un problema de seguridad al intentar interactuar con la aplicación específica que se estaba probando.
La causa exacta de este problema estaba relacionada con la propia aplicación (APK) y no pudo ser resuelta directamente a través de Appium.
Sin embargo, se decidió continuar con el desarrollo y la implementación del framework de automatización a pesar de este problema.
El objetivo era tener una estructura sólida y funcional para su evaluación y considerar posibles soluciones o alternativas en el futuro.

En resumen, se resolvió el primer problema obteniendo los datos necesarios de una aplicación adicional, mientras que el segundo problema relacionado con la seguridad de la APK no pudo ser solucionado directamente, pero se procedió con el desarrollo del framework de automatización para su evaluación y consideración posterior.
```
![s.png](src%2Ftest%2Fresources%2Fs.png)


### Para ejecutar las pruebas:

```
mvn clean verify  
```

### Capturas Reporte Serenity y Dispositivo Virtual:

![33.png](src%2Ftest%2Fresources%2F33.png)
![d.png](src%2Ftest%2Fresources%2Fd.png)

