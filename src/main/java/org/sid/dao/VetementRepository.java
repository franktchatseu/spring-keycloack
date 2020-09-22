package org.sid.dao;

import org.sid.entitie.Vetement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http://localhost:4200")
public interface VetementRepository extends JpaRepository<Vetement, Long> {

	public Vetement findByidVetement(Long id);
}
