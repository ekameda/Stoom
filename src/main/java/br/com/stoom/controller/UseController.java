package br.com.stoom.controller;

import br.com.stoom.entity.Use;
import br.com.stoom.service.UseService;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UseController {

    @Autowired
    private UseService useService;

    @RequestMapping("home")
    public String formUse(Model model) {
        List<Use> use = useService.findAll();
        model.addAttribute("use", use);
        return "cadastro";
    }

    @RequestMapping("")
    public String forUse(Model model) {
        List<Use> use = useService.findAll();
        model.addAttribute("use", use);
        return "cadastro";
    }

    @RequestMapping(value = "home/{id}", method = RequestMethod.GET)
    public String formAlterar(Model model, @PathVariable("id") Long id) {
        Optional<Use> useOptional = useService.findOne(id);
        Use use = new Use();
        use = useOptional.get();
        model.addAttribute("use", use);
        return "alteracao";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String save(Model model, Use use) {
        use.setCreationDate(Calendar.getInstance());
        if (use.getId() < 1) {
            useService.salvar(use);
        } else {
            useService.atualizar(use);
        }
        List<Use> user = useService.findAll();
        model.addAttribute("use", user);
        return "cadastro";
    }
    
// Pelo boas pratica de programação, o metodo correto para DELETE seria este
    //mas a linguagem do front thymeleaf,nao permite fazer PUT nem DELETE
    //Mas deixei os 2 metodos feitos 
    
    @RequestMapping(value = "excluirr/{id}", method = RequestMethod.DELETE)
    public String deletar(Model model, @PathVariable("id") Long id) {
        if (id >= 1) {
            useService.deletar(id);
        }
        List<Use> user = useService.findAll();
        model.addAttribute("use", user);
        return "cadastro";
    }
    
    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
    public String delet(Model model, @PathVariable Long id) {
           if (id >= 1) {
            useService.deletar(id);
        }
        List<Use> user = useService.findAll();
        model.addAttribute("use", user);
        return "cadastro";
    }
    
// Pelo boas pratica de programação, o metodo correto para DELETE seria este.
    //masa a linguagem do front thymeleaf,nao permite fazer PUT nem DELETE
    //Mas deixei os 2 metodos feitos
    
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public String update(Model model, Use use) {
        use.setCreationDate(Calendar.getInstance());
        useService.atualizar(use);
        List<Use> user = useService.findAll();
        model.addAttribute("use", user);
        return "cadastro";
    }
    
    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String updavte(Model model, Use use) {
        use.setCreationDate(Calendar.getInstance());
        useService.atualizar(use);
        List<Use> user = useService.findAll();
        model.addAttribute("use", user);
        return "cadastro";
    }

}
