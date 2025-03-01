package spring.projects.springstarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.projects.springstarter.Models.Account;

@Controller
public class AccountController {
    @GetMapping("/register")
    public String register(Model model){
        Account account=new Account();
        model.addAttribute("account", account);
        return "register";
    }
}
