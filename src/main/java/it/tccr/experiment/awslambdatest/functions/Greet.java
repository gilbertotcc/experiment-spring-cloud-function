package it.tccr.experiment.awslambdatest.functions;

import java.util.function.Function;

public class Greet implements Function<String, String> {
  @Override
  public String apply(String name) {
    return "Hello " + name + ", and welcome to Spring Cloud Function!!!";
  }
}
