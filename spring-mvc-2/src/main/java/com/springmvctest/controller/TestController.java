package com.springmvctest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenjie
 * @date 2020-07-28
 */
@Controller
public class TestController {


    @GetMapping(value = {"/index", "/"})
    public String aaa(Model model) {
        model.addAttribute("msg", "hello");
        return "index.jsp";
    }


}
