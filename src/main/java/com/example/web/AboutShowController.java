package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: YUN
 * \* Date: 2021/4/11
 * \* Time: 11:00
 * \* Description:
 * \
 */

@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
