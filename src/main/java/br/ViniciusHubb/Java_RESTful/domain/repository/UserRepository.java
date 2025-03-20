package br.ViniciusHubb.Java_RESTful.domain.repository;

import br.ViniciusHubb.Java_RESTful.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
