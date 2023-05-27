package model;

import io.helidon.config.Config;
import io.helidon.config.objectmapping.Value;
import java.lang.System;

public record Person (
  @Value(key="first_name")
  String firstName,
  @Value(key="last_name")
  String lastName,
  @Value(key="age")
  int age
){
  // public static Person create(Config config) {
  //   var firstName = config.get("first_name").asString().get();
  //   var lastName = config.get("last_name").asString().get();
  //   var age = config.get("age").asInt().get();
  //   return new Person(firstName,lastName,age);
  // }

}
