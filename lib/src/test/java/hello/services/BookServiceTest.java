package hello.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest("book-service.welcomeMessage=welcome!")// or put config file to test classpath
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void contextLoads() {
        assertThat(bookService.getWelcomeMessage()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}
