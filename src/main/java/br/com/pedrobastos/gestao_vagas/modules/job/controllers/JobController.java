package br.com.pedrobastos.gestao_vagas.modules.job.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrobastos.gestao_vagas.modules.job.entities.JobEntity;
import br.com.pedrobastos.gestao_vagas.modules.job.useCases.JobUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")

public class JobController {
    @Autowired
    private JobUseCase jobUseCase;

    @PostMapping
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
        return this.jobUseCase.execute(jobEntity);
    }
}
