package com.example.testing.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.testing.entity.StudentEntity;
import com.example.testing.repository.StudentRepository;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepository stdRepo;
	
	@RequestMapping("/studentPage")
     public String studentPage() {
		return "student_page"; 
     }
	
	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute StudentEntity student, ModelMap result ){
		stdRepo.save(student);
		result.addAttribute("message", "registration success");
		return "student_page";
		
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int id, ModelMap result) {
		stdRepo.deleteById(id);
		result.addAttribute("delete", "delete success");
		return "student_page";
		
	}
	
	@RequestMapping("/searchStudent")
	public String searchStudent(@RequestParam int id, ModelMap result) {
		try {
			System.out.println("inside 4");
		Optional<StudentEntity> st = stdRepo.findById(id);
		
		
		if(Optional.empty().isEmpty())
			 result.addAttribute("search", "not found");
		else
	    result.addAttribute("search", st.get().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "student_page";
		
	}
	
	
}
