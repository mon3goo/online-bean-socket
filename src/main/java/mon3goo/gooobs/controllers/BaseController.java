package mon3goo.gooobs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping("/")
	public String viewConfigurationPanel(HttpServletRequest request,
			HttpServletResponse response,Model model) throws Exception {

		return "default";
	}

}