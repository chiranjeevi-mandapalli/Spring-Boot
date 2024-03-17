package com.chiru.studentdetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Chiranjeevi
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collation = "student_details")
public class StudentDetails {
    @Id
    private String id;
    private String name;
    private int age;
}
