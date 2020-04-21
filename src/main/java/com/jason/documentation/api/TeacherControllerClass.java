package com.jason.documentation.api;

import com.jason.documentation.model.Teacher;
import com.jason.documentation.service.TeacherServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherControllerClass {

    @Autowired
    private TeacherServiceClass service;



    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public String addTeacher(@RequestBody Teacher teacher)
    {
        service.addTeacherDetails(teacher);
        return "Teacher Added";
    }
    @RequestMapping(value = "getTeacher",method = RequestMethod.GET)
    public List<Teacher> getALlTeachers()
    {
        return service.getAllTeacher();
    }
    @RequestMapping(value = "/getTeacherBySubject/{sub}",method = RequestMethod.GET)
    public List<Teacher> getTeacherBySubject(@PathVariable String sub)
    {
        return service.getTeacherBySubject(sub);
    }

    @RequestMapping(value = "/deleteTeacher/{id}",method = RequestMethod.DELETE)
    public List<Teacher> deleteTeacher(@PathVariable int id)
    {
        return service.deleteTeacher(id);
    }
}
