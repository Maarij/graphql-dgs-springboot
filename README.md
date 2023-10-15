# graphql-dgs-springboot
Using DGS (**D**omain **G**raph **S**ystem) to streamline GraphQL development with Spring Boot. 
For simple examples, refer to the "faker" packages. For a more complete application example, refer to
the "problemz" packages that mimics a Stack Overflow service. The [carmazing](https://github.com/Maarij/carmazing) 
project implements this between two teams, product and sales.

# Guides & Docs
Udemy: https://www.udemy.com/course/code-graphql-application-with-java-spring-boot-netflix-dgs/

DGS: https://netflix.github.io/dgs/getting-started/

Apollo: https://www.apollographql.com/docs/
* Download schema for apollo-client
  * `gradle downloadApolloSchema --endpoint="http://localhost:8080/graphql" --schema="lib/src/main/graphql/com/course/graphqlclient/schema.json`
