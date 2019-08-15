package fineto.websample.springstuff.controllers;

import fineto.websample.springstuff.repositories.AuthorRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepositories authorRepositories;

    public AuthorController(AuthorRepositories authorRepositories) {
        this.authorRepositories = authorRepositories;
    }

    @RequestMapping("/authors")
    private String getAuthor(Model model)
    {
        model.addAttribute("authors",authorRepositories.findAll());
        return "authors";
    }
}
