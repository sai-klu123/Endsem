package com.klu.endsem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Orders, Integer> {
}
