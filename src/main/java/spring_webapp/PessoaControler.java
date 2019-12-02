package spring_webapp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoa")
public class PessoaControler {

	@RequestMapping("/showForms")
	public String showForm(Model pessoaModel) {
		
		Pessoa pessoa = new Pessoa(null, 0, null, null);
		pessoaModel.addAttribute("pessoa", pessoa);
		System.out.println(" pessoa " + pessoa);
		return "pessoa-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("pessoa") Pessoa pessoaModel, 
			BindingResult bindingResult) {
		
		System.out.print("Name " + pessoaModel.getNome() + " " +  bindingResult.hasErrors());
		System.out.print("idade " + pessoaModel.getIdade() + " " +  bindingResult.hasErrors());
		System.out.print("genero " + pessoaModel.getGenero() + " " +  bindingResult.hasErrors());
		System.out.print("servico " + pessoaModel.getServico() + " " +  bindingResult.hasErrors());
		
		
		if(bindingResult.hasErrors())
			return "pessoa-form";
		
		return "pessoa-confirmacao";
	}
	
}
