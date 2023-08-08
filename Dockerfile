FROM openjdk:17
EXPOSE 8080
ADD target/onetomany.jar onetomany.jar
ENTRYPOINT ["java","-jar","onetomany.jar"]
