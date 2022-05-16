FROM java:8
EXPOSE 8080
ADD target/shoppingcartservice.jar shoppingcartservice.jar

ENTRYPOINT ["java" , "-jar" , "/shoppingcartservice.jar"]