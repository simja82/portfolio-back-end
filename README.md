# Introducción
En este documento se deja constancia de todo lo realizado en la rama del repositorio presente que contiene el primer back-end del Trabajo Práctico Final e Integrador de YoProgramo, segunda etapa de Argentina Programa

## Tecnologías
La versión de Spring Boot es la: 3.0.4<br>
La versión de Java es la: 17

## Dependencias
Este proyecto cuenta con las siguientes dependencias:

Spring Boot Starter Data JPA<br>
Spring Boot Starter Web<br>
Spring Boot Devtools<br>
MySQL Connector-J<br>
Lombok<br>
Spring Boot Starter Test<br>
Jakarta Validation API

## Características
Esta parte del trabajo contiene los paquetes: Entities, Interfaces, Services y Controllers

A cada Entidad le corresponde una Interface, un Service y un Controller, capas que están identificadas por el nombre de la Entidad seguido del tipo de capa y siempre dentro de su paquete correspondiente.

Todas las Entidades tienen su nombre en singular y se corresponden con distintas partes del front-end para las cuales se suman por medio de ellas tablas con nombres en plural.

## Herramientas
En todos los casos, en las Entidades, se respetan todos los datos creados en el JSON que se encuentra en el repositorio de front-end de este mismo proyecto. 

## Testeo
Todos los métodos utilizados fueron testeados con Postman y con la Extensión Thunder Client de Visual Studio Code.
