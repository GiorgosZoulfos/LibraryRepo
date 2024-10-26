package com.example.Library.Service;

import com.example.Library.Entities.Student;
import com.example.Library.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /* Retrieve all students from Database */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /* Retrieve student from Database using the id */
    public Optional<Student> getStudentById(int studentId) {
        return studentRepository.findById(studentId);
    }

    /* Save new student to Database */
    public void saveNewStudent(Student student) {
        studentRepository.save(student);
    }

    /* Delete existing student */
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }

    /* Update student info */
    public void updateStudent(Student student){
        studentRepository.save(student);
    }
}
