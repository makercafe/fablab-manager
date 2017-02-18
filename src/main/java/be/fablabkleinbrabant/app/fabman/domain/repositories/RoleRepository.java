package be.fablabkleinbrabant.app.fabman.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import be.fablabkleinbrabant.app.fabman.domain.model.Role;


@Repository
@RepositoryRestResource()
public interface RoleRepository extends CrudRepository<Role, String> {
	

}
