package it.betacom.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(
				new Student(1L,"Alessandro","Alessandro@gmail.com",LocalDate.of(2000,Month.JANUARY,5),21),
				new Student(1L,"gianfranco","gianfranco@gmail.com",LocalDate.of(2000,Month.JANUARY,5),19),
				new Student(1L,"maria","maria@gmail.com",LocalDate.of(2000,Month.JANUARY,5),10),
				new Student(1L,"lucia","lucia@gmail.com",LocalDate.of(2000,Month.JANUARY,5),11)
				);
	}
}
