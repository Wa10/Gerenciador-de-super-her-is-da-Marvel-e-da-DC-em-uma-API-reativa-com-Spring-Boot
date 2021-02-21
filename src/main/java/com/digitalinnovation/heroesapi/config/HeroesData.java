package com.digitalinnovation.heroesapi.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.heroesapi.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.heroesapi.constants.HeroesConstant.REGION_DYNAMO;

public class HeroesData {
  public static void main(String[] args){

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Api_Table");

    Item hero = new Item()
      .withPrimaryKey("id", "11")
      .withString("name", "Homem de Ferro")
      .withString("universe", "Marvel")
      .withNumber("films", 7);

    Item hero2 = new Item()
      .withPrimaryKey("id", "12")
      .withString("name", "Homem Aranha")
      .withString("universe", "marvel")
      .withNumber("films", 5);

    Item hero3 = new Item()
      .withPrimaryKey("id", "13")
      .withString("name", "Pantera Negra")
      .withString("universe", "marvel")
      .withNumber("films", 4);

    Item hero4 = new Item()
            .withPrimaryKey("id", "14")
            .withString("name", "Batman")
            .withString("universe", "DC Comics")
            .withNumber("films", 5);

    Item hero5 = new Item()
            .withPrimaryKey("id", "15")
            .withString("name", "Doutor Estranho")
            .withString("universe", "marvel")
            .withNumber("films", 3);

    Item hero6 = new Item()
            .withPrimaryKey("id", "16")
            .withString("name", "Wolverine")
            .withString("universe", "marvel")
            .withNumber("films", 2);


    PutItemOutcome outcome1 = table.putItem(hero);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);
    PutItemOutcome outcome4 = table.putItem(hero4);
    PutItemOutcome outcome5 = table.putItem(hero5);
    PutItemOutcome outcome6 = table.putItem(hero6);

  }

}

