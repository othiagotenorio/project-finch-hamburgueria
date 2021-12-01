package finch.project.ControllerDB;

import finch.project.model.UsuarioModel;
import finch.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }
    @GetMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }

}
