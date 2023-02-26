FROM azul/zulu-openjdk:17.0.4.1
ARG JAR_FILE=server/build/libs/*.jar
COPY ${JAR_FILE} server.jar
ENTRYPOINT ["java","-jar","/server.jar"]
