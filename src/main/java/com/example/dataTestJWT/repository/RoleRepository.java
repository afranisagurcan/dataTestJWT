package com.example.dataTestJWT.repository;

import com.example.dataTestJWT.models.ERole;
import com.example.dataTestJWT.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}