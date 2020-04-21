package com.jason.documentation.service;

import com.jason.documentation.dao.TeacherRepo;
import com.jason.documentation.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceClass {
    @Autowired
    private TeacherRepo daoClass;

    public Teacher addTeacherDetails(Teacher teacher)
    {
        return daoClass.save(teacher);
    }
    public List<Teacher> getAllTeacher()
    {
        return daoClass.findAll();
    }
    public List<Teacher> getTeacherBySubject(String sub)
    {
        return  daoClass.findAllBySubject(sub);
    }
    public List<Teacher> deleteTeacher(int id)
    {
        daoClass.deleteById(id);
        return daoClass.findAll();
    }
}
