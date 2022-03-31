package pl.supra.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student
                    ("John", "john@mail.com", LocalDate.of(2000, JANUARY, 10));

            Student alex = new Student
                    ("Alex", "alex@mail.com", LocalDate.of(2002, JANUARY, 12));

            repository.saveAll(
                    List.of(john, alex)
            );
        };
    }
}

