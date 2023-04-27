FROM amazoncorretto:17-alpine-jdk

MAINTAINER POV

COPY target/pov-0.0.1-SNAPSHOT.jar pov-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/pov-0.0.1-SNAPSHOT.jar"]