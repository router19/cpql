FROM openjdk:11
ADD cpql-simulator-0.0.1-SNAPSHOT.jar cpql-simulator-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","cpql-simulator-0.0.1-SNAPSHOT.jar"]