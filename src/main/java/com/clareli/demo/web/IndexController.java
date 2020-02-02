package com.clareli.demo.web;

import com.clareli.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
        /*
        String blog = null;

        if (blog == null) {
            throw new NotFoundException("Blog does not exsit");
        } */
        System.out.println("----index----");
        return "index";
    }
}
