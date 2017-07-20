package com.jhsystems.colosseum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LeeJangHyeop on 2017. 7. 18..
 */
@RequestMapping("/templates")
@Controller
public class TemplateController {

    @RequestMapping(path = "/{template}")
    public String template(@PathVariable String template) {
        return "templates/" + template;
    }
}
