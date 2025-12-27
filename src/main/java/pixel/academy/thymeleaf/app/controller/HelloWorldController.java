package pixel.academy.thymeleaf.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //method for diplay initial HTML form

    @GetMapping("/showForm")
    public String showForm() {
        return"helloworld-form";
    }

    //the method that handles processing data from the HTML form

    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @PostMapping("/greetingNewForm")
    public String generateGreeting(@RequestParam("studentName") String theName, Model model) {

        //transform the input to uppercase
        theName = theName.toUpperCase();

        //build the response message
        String result = "Submission succesful. User: " + theName;

        //add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
