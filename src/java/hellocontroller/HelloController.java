/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellocontroller;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello world, I am using spring anotaion ");
model.addObject("msg2","2 eme ");
		return model;
	}

        @RequestMapping("/welcome1")
	public ModelAndView helloWorld2() {

		ModelAndView model = new ModelAndView("HelloPage2");
		model.addObject("msg","hello world from methor HelloWorld2 ");

		return model;
	}
        
}