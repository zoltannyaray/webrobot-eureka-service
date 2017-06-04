FROM frolvlad/alpine-oraclejdk8:slim
WORKDIR /usr/share/webrobot-eureka-service
ADD target/webrobot-eureka-service.jar webrobot-eureka-service.jar
RUN touch webrobot-eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["/usr/bin/java", "-jar", "webrobot-eureka-service.jar"]
