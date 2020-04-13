package com.rtpl.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class Controller2 {
	@RequestMapping("/hello2")  
    public String display()  
    {  
        return "viewpage2";  
    }     
}
