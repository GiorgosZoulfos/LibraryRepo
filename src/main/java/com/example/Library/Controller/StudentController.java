package com.example.Library.Controller;

import com.example.Library.Entities.Student;
import com.example.Library.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/library/api/v1")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /* ****************************************************** */
    /* ******************** GET GROUP *********************** */
    /* ****************************************************** */
    @GetMapping(path = "/student")
    public Optional<List<Student>> getAllStudents(){
        return Optional.ofNullable(studentService.getAllStudents());
    }

    @GetMapping(path = "/student/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    /* ****************************************************** */
    /* ********************* PUT GROUP ********************** */
    /* ****************************************************** */
    @PutMapping(path = "/student")
    public HttpStatus updateStudentById(@RequestBody Student student){
        studentService.updateStudent(student);
        return HttpStatus.CREATED;
    }

    /* ****************************************************** */
    /* ******************* DELETE GROUP ********************* */
    /* ****************************************************** */
    @DeleteMapping(path = "/student/{id}")
    public HttpStatus deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudent(id);
        return HttpStatus.OK;
    }


    /* ****************************************************** */
    /* ******************** POST GROUP ********************** */
    /* ****************************************************** */
    @PostMapping(path = "/student")
    public HttpStatus createNewStudent(@RequestBody Student student){
        studentService.saveNewStudent(student);
        return HttpStatus.CREATED;
    }
}

