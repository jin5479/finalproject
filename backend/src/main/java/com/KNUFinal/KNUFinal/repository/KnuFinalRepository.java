package com.KNUFinal.KNUFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KNUFinal.KNUFinal.model.User;

@Repository
public interface KnuFinalRepository extends JpaRepository<User, Long> {}
