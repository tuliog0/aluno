package com.api.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.aluno.model.Aluno;
import com.api.aluno.repository.AlunoRepository;

@SpringBootApplication
public class AlunoApplication implements CommandLineRunner{

	@Autowired
	AlunoRepository alunoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AlunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//alunoRepository.save(new Aluno(1,"teste",2323d));
	}

}
