package org.sid.dao;

import org.sid.entitie.TypeVetement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http://localhost:4200")
public interface TypeVetementRepository  extends JpaRepository<TypeVetement, Long>{
	public TypeVetement findByidType(long id);
}
