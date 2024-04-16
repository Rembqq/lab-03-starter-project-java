FROM openjdk:22-jdk-bullseye

WORKDIR /app

COPY target/friends_app-0.0.1-SNAPSHOT.jar /friends_app.jar

CMD ["java", "-jar", "/friends_app.jar"]

