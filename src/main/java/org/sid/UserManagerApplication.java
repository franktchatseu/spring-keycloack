package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.dao.TypeVetementRepository;
import org.sid.dao.UserInterface;
import org.sid.dao.UserRepository;
import org.sid.entitie.Client;
import org.sid.entitie.TypeVetement;
import org.sid.entitie.User;
import org.sid.entitie.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserManagerApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(UserManagerApplication.class, args);

		UserInterface userinterface;
		UserRepository userrepository;
		ClientRepository clientrepository=ctx.getBean(ClientRepository.class);
		TypeVetementRepository categorierepository=ctx.getBean(TypeVetementRepository.class);
		
		userinterface=ctx.getBean(UserInterface.class);
		userrepository=ctx.getBean(UserRepository.class);
		//insertion de quelques champs
		userrepository.save(new User("frank","$2a$12$D55EQJWShYBH3NWWeRkI7Ob1TuO1R/UJBE77XhEaehoGX3/OH.PMu","junior","admin"));
		clientrepository.save(new Client("frank", "677124830", "koutaba"));
		clientrepository.save(new Client("Armand", "677124830", "Buea"));
		
		//insertion de quelques categorie
		categorierepository.save(new TypeVetement("chemise", 500));
		categorierepository.save(new TypeVetement("chaussure", 1000));
		categorierepository.save(new TypeVetement("pantallon", 2000));
		userinterface.save(new Utilisateur("Tchatseu", "frank", "louenkamfrank@gmail.com", "fj", "123", 1, "impressing.jpg"));
		userinterface.save(new Utilisateur("Komegne", "liliane", "liliane@gmail.com", "li", "123", 1, "impressing.jpg"));
		userinterface.save(new Utilisateur("Kamtchop", "line", "line@gmail.com", "line", "123", 1, "impressing.jpg"));
	}

}
