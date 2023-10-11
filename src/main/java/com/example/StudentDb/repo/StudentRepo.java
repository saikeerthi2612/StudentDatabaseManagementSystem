package com.example.StudentDb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentDb.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
