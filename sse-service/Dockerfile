FROM amazoncorretto:17 as build
WORKDIR /app
COPY target .
EXPOSE 8081
CMD ["java", "-jar", "/app/red-net-sse-service.jar"]