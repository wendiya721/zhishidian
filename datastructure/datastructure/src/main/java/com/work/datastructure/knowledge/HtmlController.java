package com.work.datastructure.knowledge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
	@GetMapping("/html")
	public String html() {
		return "/index.html";
	}
}