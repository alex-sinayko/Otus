FROM openjdk:17-alpine
# VOLUME /tmp
# ARG JAR_FILE
# COPY ${JAR_FILE} app.jar
COPY build/libs/homework1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8000
ENTRYPOINT exec java -jar /app.jar