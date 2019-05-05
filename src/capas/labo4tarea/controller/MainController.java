package capas.labo4tarea.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import capas.labo4tarea.domain.Product;

@Controller
public class MainController {
	
		@RequestMapping("/")
		public ModelAndView initMain() {
			ModelAndView mav = new ModelAndView();
			Product producto = new Product();
			mav.addObject("product", producto);
			mav.setViewName("index");
			return mav;
		}

		//Controlador que recibe el producto
		@RequestMapping("/formData")
		@ResponseBody
		public ModelAndView form(@Valid @ModelAttribute Product producto, BindingResult result) {
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				mav.setViewName("index");
			} else {
				mav.addObject("message", "Producto agregado con &eacute;xito");
				mav.setViewName("form");
			}
			
			return mav;
		}
		
		@InitBinder
		protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");   
		    dateFormat.setLenient(false);
		    binder.registerCustomEditor(Date.class, null,  new CustomDateEditor(dateFormat, true));
		}
		
}
