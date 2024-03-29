package it.betacom.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//qui per far si che una volta lanciato sia un rest
@RestController
@RequestMapping(path = "students")
public class StudentController {
	
	private final StudentService studentService;

	/**
	 * @param studentService
	 */
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping	
	public List<Student> getStudent(){
		return studentService.getStudents();
	}
	
	
}
