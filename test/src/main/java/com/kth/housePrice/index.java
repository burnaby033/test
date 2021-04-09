package com.kth.housePrice;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
	
	@GetMapping("/index")
	public String indexController(Model model, HttpServletRequest request) throws SQLException {
		
		System.out.println("index 클래스에 접속이 생겼습니다.");
		return "index";
	}
}
