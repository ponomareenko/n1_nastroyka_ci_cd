FROM eclipse-temurin:21-jre-alpine

VOLUME /tmp

COPY target/n1_nastroyka_ci_cd-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]