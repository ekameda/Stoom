package br.com.stoom.service;

import br.com.stoom.entity.Use;
import br.com.stoom.repository.UseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UseService {

    @Autowired
    private UseRepository userepository;

    public List<Use> findAll() {
        return userepository.findAll();
    }

    public Optional<Use> findOne(Long id) {
        return userepository.findById(id);
    }

    public void salvar(Use use) {
        userepository.save(use);
    }

    public void atualizar(Use use) {
        userepository.saveAndFlush(use);
    }
    
    public void deletar(Long id) {
        userepository.deleteById(id);
    }




}
