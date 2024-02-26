package com.sarita.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarita.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
