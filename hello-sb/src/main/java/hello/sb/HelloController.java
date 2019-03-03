package hello.sb;


import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    Publisher<String> hello() {
        return Mono.just("Hello world");
    }
}