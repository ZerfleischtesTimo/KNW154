FROM openjdk:17-alpine3.14

MAINTAINER Timo "timo.schaub@bbzbl-it.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./m154-crm-web/target/m154-crm-web-0.0.1-SNAPSHOT.jar m154-crm-web.jar

CMD ["java", "-jar", "m154-crm-web-0.0.1-SNAPSHOT.jar"]