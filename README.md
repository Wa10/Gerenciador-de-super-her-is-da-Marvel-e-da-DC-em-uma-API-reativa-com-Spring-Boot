
# API Reativa com Spring Boot de Gerenciamento de Super Heróis da Marvel e da DC 



## Stack utilizada

  * Java 8
  * spring webflux
  * Spring data
  * dynamodb
  * junit
  * sl4j
  * reactor


Tópicos abordados no bootcamp para esse projeto:

* Java Reativo
* Documentação com o Postman
* Requisições 
* Conta na AWS
* Logar na Aws para usar o dynamoDB
* Spring Framework

  
Obs: É necessário ter o aws cli configurado.



### Executar dynamo: 

Na pasta em que o jar está baixado: 
```shell script
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```
 
para listar as tabelas criadas:  
```shell script
aws dynamodb list-tables --endpoint-url http://localhost:8000
```

documentacao gerada pela aplicação: 
```shell script
swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html
```
