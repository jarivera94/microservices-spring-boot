package co.com.microservices.helloworld;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {

  private final AtomicLong AUTO_ID = new AtomicLong();
  private final String TEMPLATE_GREETING = "hello %s";

  @GetMapping
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(AUTO_ID.incrementAndGet(), String.format(TEMPLATE_GREETING, name));
  }
}
