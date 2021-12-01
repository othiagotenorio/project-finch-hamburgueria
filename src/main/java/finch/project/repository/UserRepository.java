package finch.project.repository;

import finch.project.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UsuarioModel, Integer> {
}
