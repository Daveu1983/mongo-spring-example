FROM eclipse-temurin:17-jre-alpine
RUN mkdir /opt/app
COPY target/*.jar /opt/app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/app.jar"]