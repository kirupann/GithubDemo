package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
@RequestMapping("main")
public String main() {
	System.out.println("HI");
	return "main.jsp";
}
}
