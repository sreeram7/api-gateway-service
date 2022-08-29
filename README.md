#Singtel-Api Gateway Implementation

Run Spring Boot App - ApiGatewayServiceApplication.java
Gateway Port : 8010
Eureka Port :  8083

#Implementation of API Gateway Server
API used: Spring Cloud Gateway

Why this : Because of reactive nature which will avoid blocking

Style : Configuration way (also can be done in java way)

AuthorizationHeaderFilter.java : Will do the JWT validation
CustomFilter.java, 
CustomPostFilter.java ,
CustomPreFilter.java and 
GlobalFilterConfiguration.java are the custom filters we can use 







