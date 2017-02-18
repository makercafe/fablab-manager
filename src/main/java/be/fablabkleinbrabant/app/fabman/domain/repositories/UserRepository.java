package be.fablabkleinbrabant.app.fabman.domain.repositories;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import be.fablabkleinbrabant.app.fabman.domain.model.User;



@Repository
@RepositoryRestResource()
public interface UserRepository extends org.springframework.data.repository.CrudRepository<User, String>{
	   List<User> findAll();

	    @Transactional
	    User save(User user);

	    @Transactional(readOnly = true)
	    String findPasswordByUserName(String userName);

	    @Transactional(readOnly = true)
	    User findUserByUserName(String userName);

	    @Transactional(readOnly = true)
	    List<String> findAllByUserName(String userName);

//	    @Transactional(readOnly = true)
//	    boolean isSecurityCodeValid(String email, String securityCode);

	    @Transactional(readOnly = true)
	    User findByEmail(String email);
	    
	    

}
