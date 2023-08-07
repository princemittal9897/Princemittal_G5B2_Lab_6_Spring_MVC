package com.greatlearning.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentregistration.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
