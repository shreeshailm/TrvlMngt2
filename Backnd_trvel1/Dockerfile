FROM eclipse-temurin:11
EXPOSE 7070
ADD target/dockerSpring.jar docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]