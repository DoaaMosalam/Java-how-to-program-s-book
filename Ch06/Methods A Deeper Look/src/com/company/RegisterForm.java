package com.company;


 // This Class own course Mohammad Eldoskey in Youtube;

enum Gender {Male(),Female()};
enum Course {Database,Programming,Math,ERP};
enum Semester {Summer,Winter,Fall,Spring};


public class RegisterForm {
    String stdName;
    Gender stdGender;
    Course stdCourse;
    Semester stdSemester;


    public RegisterForm(){
        stdName = "No Name";
        stdGender = Gender.Male;
        stdCourse = Course.Math;
        stdSemester = Semester.Spring;
    }
}
