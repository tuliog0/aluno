package com.api.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.aluno.model.Aluno;
import com.api.aluno.repository.AlunoRepository;

@RestController
@RequestMapping("/")
public class AlunoController {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/listalunos")
	public List<Aluno> getAllAlunos(){
		return alunoRepository.findAll();		
	}
	
	@GetMapping("/findbyid/{id}")
	public Aluno getAlunoById(@PathVariable(name="id") Long id){
		return alunoRepository.getOne(id);		
	}

	@PostMapping("/save")
	public List<Aluno> saveAluno(Aluno aluno){
		alunoRepository.save(aluno);
		return alunoRepository.findAll();		
	}
	
	@PutMapping("/update")
	public Aluno updateAlunoById(Aluno aluno){
		return alunoRepository.save(aluno);	
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Aluno> deleteAlunoById(@PathVariable(name="id") Long id){
		alunoRepository.deleteById(id);
		return alunoRepository.findAll();		
	}

}
