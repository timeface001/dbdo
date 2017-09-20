package com.fs.ntes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class MainController extends BaseController {


    @RequestMapping("/")
    public String index() {
        return "admin-index";
    }
}
