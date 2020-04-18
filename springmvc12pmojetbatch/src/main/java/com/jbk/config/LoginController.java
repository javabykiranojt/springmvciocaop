package com.jbk.config;

import java.util.ArrayList;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	LoginController() {
		System.out.println("LoginController ..... const...");
	}

	/*
	 * @RequestMapping(value = "/login") public String checkLogin(@ModelAttribute
	 * User user) { // getdata System.out.println("user >>> " + user); // process
	 * data System.out.println("checkLogin..........."); if
	 * ("javabykiran".equals(user.getUsername())) { return "home"; } else { return
	 * "login"; } // navigate }
	 */
	private void m2() {
		System.out.println(11111);
	}

	@Async
	private void m1() {// uploading
		System.out.println(22222);
	}

	@RequestMapping(value = "/login")
	public ModelAndView checkLogin(@ModelAttribute User user) {
		m1();// side by side // email /...... // 5 hr//upload
		m2();// moview

		System.out.println("user >>> " + user);
		System.out.println("checkLogin...........");
		ModelAndView mv = new ModelAndView();
		if ("javabykiran".equals(user.getUsername())) {
			ArrayList<String> al = new ArrayList<>();
			al.add("ksdsd");
			al.add("sdsd");
			al.add("sdsd");
			al.add("sdsd");
			al.add("sdsd");
			mv.setViewName("home");
			mv.addObject("data", al);
		} else {
			mv.addObject("msg", "your passwd is wrong..");
			mv.setViewName("login");
		}
		return mv;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		System.out.println("Employee needs to be deleted ... >>> " + id);
		// delete from table whr id =
		ModelAndView mv = new ModelAndView();
		ArrayList<String> al = new ArrayList<>();
		al.add("ksdsd");
		al.add("sdsd");
		al.add("sdsd");
		al.add("sdsd");
		al.add("sdsd");
		mv.setViewName("home");
		mv.addObject("data", al);
		return mv;
	}

	@RequestMapping(value = "/loginpage")
	public String openLoginPage() {
		System.out.println("openLoginPage..........");
		return "login";
	}

}
