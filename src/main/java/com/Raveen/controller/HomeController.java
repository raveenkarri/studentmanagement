package com.Raveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Raveen.entity.Student;
import com.Raveen.repo.StudentRepo;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class HomeController {
	@Autowired
       public StudentRepo repo;

	@GetMapping("/")
	public String getMain() {
		return "Main";
	}
	@GetMapping("/classes")
	public String getClasses() {
		return "Classes";
	}
	@GetMapping("/registerpage")
	public String getRegistration(Student student) {
		return "Registration";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute("student") Student student )  {	
		repo.save(student);
		return "Main";
	}
	@GetMapping("/List")
	public String getStudentList(Model model,Student student){
		 List<Student> list = repo.findAll();
		 model.addAttribute("list",list);
		return "StudentList";
	}
	@GetMapping("/students/{admissionNo}")
	public String deleteStudent(@PathVariable int admissionNo) {
		repo.deleteById(admissionNo);
		return "StudentList";
		
	}
	@GetMapping("/edit/{admissionNo}")
	public String editStudent(@PathVariable int admissionNo, Model model) {
	    Student student = repo.findById(admissionNo).orElse(null);
	    model.addAttribute("student", student);
	    return "edit";
	}

	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student) {
	    repo.save(student);
	    return "redirect:/List";
	}

}
