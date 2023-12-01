package workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
