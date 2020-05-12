package life.manong.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping(value = "/login")
    public String login(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "/view/index";
    }
}
