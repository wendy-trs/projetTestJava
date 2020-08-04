package fr.isika.testprojet.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestPrjetController {
	
	@Autowired
	TestProjetService testProjetService;
	
	
	@RequestMapping(value = "/")
	  public String sayHi(Model model) {
	      return "TestSaisie";
	  }
	
	@PostMapping(value = "/resultatSaisie")
	  public String afficherSaisie(@RequestParam("msg") String msg, Model model) {
		  model.addAttribute("msg", testProjetService.getMessage(msg));
		  System.out.println(msg);
	      return "Saisie";
	  }


}
