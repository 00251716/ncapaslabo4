package capas.labo4tarea.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import capas.labo4tarea.domain.User;

@Controller
public class MainController {
	
		@RequestMapping("/")
		public ModelAndView initMain() {
			ModelAndView mav = new ModelAndView();
			User usuario = new User();
			mav.addObject("message", "Bienvenidos a Spring MVC");
			mav.addObject("user", usuario);
			mav.setViewName("index");
			return mav;
		}

		//Controlador que recibe el usuario
		@RequestMapping("/formData")
		@ResponseBody
		public ModelAndView form(@Valid @ModelAttribute User user, BindingResult result) {
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				mav.setViewName("index");
			} else {
				mav.addObject("message", "Persona agregada con &eacute;xito");
				mav.setViewName("form");
			}
			
			return mav;
		}
		
}
