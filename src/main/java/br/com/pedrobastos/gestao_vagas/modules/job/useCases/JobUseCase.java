package br.com.pedrobastos.gestao_vagas.modules.job.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrobastos.gestao_vagas.modules.job.entities.JobEntity;
import br.com.pedrobastos.gestao_vagas.modules.job.repositories.JobRepository;

@Service
public class JobUseCase {
    
    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return jobRepository.save(jobEntity);
    }
}
