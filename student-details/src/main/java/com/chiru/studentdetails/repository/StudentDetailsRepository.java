package com.chiru.studentdetails.repository;

import com.chiru.studentdetails.model.StudentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chiranjeevi
 */
@Repository
public interface StudentDetailsRepository extends MongoRepository<StudentDetails,String> {
}
