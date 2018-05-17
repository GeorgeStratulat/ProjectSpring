FROM openjdk:8
ADD target/project-0.0.1-SNAPSHOT.jar project-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "project-0.0.1-SNAPSHOT.jar"]