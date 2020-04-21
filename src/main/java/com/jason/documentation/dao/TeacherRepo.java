package com.jason.documentation.dao;

import com.jason.documentation.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
    List<Teacher> findAllBySubject(String subject);
}
