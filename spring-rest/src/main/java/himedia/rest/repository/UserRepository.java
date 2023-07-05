package himedia.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import himedia.rest.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
