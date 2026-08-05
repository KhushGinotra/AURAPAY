package com.aurapay.proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @RequestMapping ("/home")
    @ResponseBody
    String data(){
        return "<h1>Hello</h1>";
    }
}
