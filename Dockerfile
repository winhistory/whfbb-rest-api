FROM java:alpine
EXPOSE 8080

ADD build/libs/whfbb-rest-api-*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
