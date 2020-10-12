package com.example.Bus_reservationApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bus_reservationApp.Entities.User;
import com.example.Bus_reservationApp.Repository.UserRepository;


@Controller
public class UserController {
	
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login/login";
		
	}
	
	
	
	@RequestMapping("/userRegisteration")
	public String userRegisteration() {
		return "login/userRegisteration";
		
	}
	
	@RequestMapping("/saveReg")
	public String saveRegistration(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap modelMap) {
		User user = userRepo.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "findBuss";
		}else {
			modelMap.addAttribute("msg", "invalid username/password");
			return "login/login";
		}

}
	
}
