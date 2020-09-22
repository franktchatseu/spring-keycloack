package org.sid.dao;

import org.sid.entitie.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//@RepositoryRestResource
@CrossOrigin("*")
@RequestMapping("/api/clients")
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	public Client findByidClient(Long id);
}
