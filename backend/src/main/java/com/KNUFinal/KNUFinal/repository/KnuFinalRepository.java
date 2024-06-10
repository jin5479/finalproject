package com.KNUFinal.KNUFinal.repository;

import com.KNUFinal.KNUFinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KnuFinalRepository extends JpaRepository<User, Long> {}