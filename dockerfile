FROM openjdk:11
VOLUME /temp
COPY  target/api-gateway-service-0.0.1-SNAPSHOT.jar api-gateway.jar
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]