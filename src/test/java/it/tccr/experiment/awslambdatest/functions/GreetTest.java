package it.tccr.experiment.awslambdatest.functions;

import it.tccr.experiment.awslambdatest.AwsLambdaTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.RequestEntity;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = AwsLambdaTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetTest {
  @Autowired
  private TestRestTemplate rest;

  @Test
  public void shouldSucceed() throws Exception {
    // given
    var request = RequestEntity.post(new URI("/greet")).body("hello");

    // when
    var response = this.rest.exchange(request, String.class);

    // then
    assertThat(response.getBody()).isEqualTo("Hello hello, and welcome to Spring Cloud Function!!!");
  }
}
