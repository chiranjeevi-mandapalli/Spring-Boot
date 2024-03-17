package com.chiru.studentdetails.controller;

import com.chiru.studentdetails.model.StudentDetails;
import com.chiru.studentdetails.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chiranjeevi
 */
@RestController
@RequestMapping("/students")
public class StudentDetailsController {
    @Autowired
    private StudentDetailsService studentDetailsService;

    @GetMapping()
    public List<StudentDetails> getAll(){
        return studentDetailsService.getAll();
    }
}
