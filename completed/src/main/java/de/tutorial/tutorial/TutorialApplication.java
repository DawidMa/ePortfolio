package de.tutorial.tutorial;

import de.tutorial.tutorial.model.Student;
import de.tutorial.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            Student student = new Student("Dawid","+491234567",true);
            repository.save(student);
        };
    }
}
