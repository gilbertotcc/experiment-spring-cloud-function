package it.tccr.experiment.awslambdatest.function;

import java.util.function.Function;

public class GreetFunction implements Function<String, String> {
  @Override
  public String apply(String name) {
    return "Hello " + name + ", and welcome to Spring Cloud Function!!!";
  }
}
