package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Login;
import model.User;
import service.UserService;

@Controller
public class LoginController {
	
	User user;
	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
	public ModelAndView validateUser(HttpServletRequest request, HttpServletResponse response,Login login) {
		user = userService.validateUser(login);
		ModelAndView mav = new ModelAndView("userHome");
		if(user!=null) {
			mav = new ModelAndView("welcome", "user", user.getName());
		}else {
			mav = new ModelAndView("login", "message", "Email or Password is wrong");
		}
		return mav;
	}

}
