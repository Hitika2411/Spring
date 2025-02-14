package spring.projects.springstarter.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//import ch.qos.logback.core.model.Model;
import spring.projects.springstarter.Models.Post;
import spring.projects.springstarter.Service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @Autowired
    private PostService ps;
    @GetMapping("/home")
    public String home(Model model){
        List<Post> posts=ps.getAll();
        model.addAttribute("posts", posts);
        return "home";
    }

}
