package com.test.apiwebjava8newrelic.repository;

import com.test.apiwebjava8newrelic.model.Testes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository<Testes, Long> {
}
