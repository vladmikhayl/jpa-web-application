package com.vladmikhayl.jpa.repositories;

import com.vladmikhayl.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
