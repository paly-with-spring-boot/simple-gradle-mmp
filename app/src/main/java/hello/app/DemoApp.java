package hello.app;

import hello.services.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApp {
    private final BookService bookService;

    public DemoApp(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home(){
        return bookService.getWelcomeMessage();
    }

    public static void main(String[] args){
        SpringApplication.run(DemoApp.class,args);
    }
}
