package br.com.pedrobastos.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrobastos.gestao_vagas.modules.candidate.entities.CandidateEntity;
import br.com.pedrobastos.gestao_vagas.modules.candidate.useCases.CandidateUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")

public class CandidateController {
    @Autowired
    private CandidateUseCase candidateUseCase;
    @PostMapping
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity) {
        try{
            var result = this.candidateUseCase.execute(candidateEntity);
            return ResponseEntity.ok().body(result);
        } catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
