package com.example.testing.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.testing.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

}
