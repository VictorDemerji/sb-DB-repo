package pixel.academy.thymeleaf.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pixel.academy.thymeleaf.app.model.Student;

@Controller
public class StudentController {

@GetMapping("/showStudentForm")
    public String showForm(Model theModel) {


    Student theStudent = new Student();

    theModel.addAttribute("student", theStudent);

    return "student-form";
}

}
