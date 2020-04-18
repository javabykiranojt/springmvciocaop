package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.model.User;
import com.javabykiran.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login")
	public ModelAndView checkLogin(@ModelAttribute User user) {
		System.out.println("user >>> " + user);
		System.out.println("checkLogin...........");
		ModelAndView mv = new ModelAndView();
		if (loginService.checkLogin(user)) {
			mv.setViewName("home");
			mv.addObject("data", loginService.loadUsers());
		} else {
			mv.addObject("msg", "your passwd is wrong..");
			mv.setViewName("login");
		}
		return mv;
	}

//	@RequestMapping(value = "/delete")
//	public ModelAndView deleteUser(@RequestParam int id) {
//		System.out.println("Employee needs to be deleted ... >>> " + id);
//		// delete from table whr id =
//		ModelAndView mv = new ModelAndView();
//		ArrayList<String> al = new ArrayList<>();
//		al.add("ksdsd");
//		al.add("sdsd");
//		al.add("sdsd");
//		al.add("sdsd");
//		al.add("sdsd");
//		mv.setViewName("home");
//		mv.addObject("data", al);
//		return mv;
//	}

	@RequestMapping(value = "/loginpage")
	public String openLoginPage() {
		System.out.println("openLoginPage..........");
		return "login";
	}

}
