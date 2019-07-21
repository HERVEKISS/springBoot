package com.herve.Controller;

import com.herve.Entity.Student;
import com.herve.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudenController {

    /*get Service */
    @Autowired
    private StudentService studentService;
/**-----Get All**/
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
/**Get By Id***/
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }
/**Delete***/
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentsById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }
/**-----UPDATE------**/
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentsById(@RequestBody Student student){
        studentService.updateStudent(student);
    }
/***----POST (ADD)-------***/
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentsById(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
