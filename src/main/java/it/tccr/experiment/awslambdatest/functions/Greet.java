package it.tccr.experiment.awslambdatest.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Greet implements Function<String, String> {
  @Override
  public String apply(String name) {
    return "Hello " + name + ", and welcome to Spring Cloud Function!!!";
  }
}
