package com.fs.ntes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("table")
public class TableController extends BaseController{

    @RequestMapping("/")
    public String index(){

        return "db_table";
    }
}
