package bg.softuni.footballhistory.controller;

import bg.softuni.footballhistory.dto.UserRegistrationDTO;
import bg.softuni.footballhistory.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String viewRegister(Model model){
        model.addAttribute("registerDTO", new UserRegistrationDTO());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserRegistrationDTO registrationDTO){
        userService.registerUser(registrationDTO);
        return "redirect:/";
    }
}
