package com.crypto.alerts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author sumanth on 10/06/18
 */
@Controller
public class MyRestController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index";
    }


}
