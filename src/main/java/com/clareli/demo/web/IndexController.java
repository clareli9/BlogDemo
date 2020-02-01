package com.clareli.demo.web;

import com.clareli.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {

        String blog = null;

        if (blog == null) {
            throw new NotFoundException("Blog does not exsit");
        }
        return "index";
    }
}
