package com.example.web;

import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ArchiveShowController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/archives")
    public String archives(Model model) {
        //model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("archiveMap",blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        return "archives";
    }
}
