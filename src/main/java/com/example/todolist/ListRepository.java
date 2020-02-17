package com.example.todolist;

import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<List, Long> {
}
