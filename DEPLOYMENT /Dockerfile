FROM openjdk:16-alpine3.13

RUN apk --no-cache add curl 

LABEL MAINTAINER Dr.Rao

EXPOSE 8080

COPY FirstExample-0.0.1-SNAPSHOT.jar .

CMD java -jar FirstExample-0.0.1-SNAPSHOT.jar

