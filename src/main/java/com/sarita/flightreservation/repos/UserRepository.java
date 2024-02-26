package com.sarita.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarita.flightreservation.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
