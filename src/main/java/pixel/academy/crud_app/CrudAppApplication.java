package pixel.academy.crud_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pixel.academy.crud_app.dao.StudentDAO;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			createStudent(studentDAO);
		};

	}

	private void createStudent(StudentDAO studentDAO) {

		// cream un obiect Student
		System.out.println("Creating new student object ...");

		// salvam obiectul Student in baza de date folosind DAO

		// afisam ID-ul studentului salvat

	}

}
