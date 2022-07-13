FROM openjdk:11
ADD target/demo_anagrafica-1.1.war demo_anagrafica-1.1.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo_anagrafica-1.1.war"]