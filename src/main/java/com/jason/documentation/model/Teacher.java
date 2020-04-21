package com.jason.documentation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Teacher {
    @Id
    @GeneratedValue
    @JsonProperty("Teacher_Id")
    private int id;
    @JsonProperty("Teacher_Name")
    private  String teacherName;
    @JsonProperty("Teacher_Age")
    private int age;
    @JsonProperty("Teacher's_Subject")
    private String subject;
}
