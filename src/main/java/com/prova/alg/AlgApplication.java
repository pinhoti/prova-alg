package com.prova.alg;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AlgApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgApplication.class, args);
	}

	@RequestMapping("v1/prova")
	String home(){

		DadosAserRetornado usuario = new DadosAserRetornado();
		usuario.nome = "Diogo Santos";
		usuario.endereco = "Av. Jose Carlos Paes, Nº500";
		usuario.telefone = "2299757222";
		usuario.cidade = "Macae";

		Gson gson = new Gson();

		String json = gson.toJson(usuario);

		return json;
	}

}
