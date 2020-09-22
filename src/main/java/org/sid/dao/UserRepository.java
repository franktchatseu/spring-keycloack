package org.sid.dao;

import org.sid.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository  extends JpaRepository<User, String>{
	
	//rechercher un user par son login
	public User findByLogin(String login);
}
