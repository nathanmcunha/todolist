package br.com.nathan.todolist.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listarPessoa() {
		return "Teste";
	}
	
	
}
