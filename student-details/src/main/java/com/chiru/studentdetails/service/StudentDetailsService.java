package com.chiru.studentdetails.service;

import com.chiru.studentdetails.model.StudentDetails;
import com.chiru.studentdetails.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chiranjeevi
 */
@Service
public class StudentDetailsService {
    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public List<StudentDetails> getAll(){
        return studentDetailsRepository.findAll();
    }
}
