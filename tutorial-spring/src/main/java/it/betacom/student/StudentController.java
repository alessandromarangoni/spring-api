package it.betacom.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//qui per far si che una volta lanciato sia un rest
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
	//qui dichiaro che è una richiesta get
	@GetMapping	
	public List<Student> getStudents() {
		return List.of(
				new Student(1L,"Alessandro","Alessandro@gmail.com",LocalDate.of(2000,Month.JANUARY,5),21)
				);
	}
}
