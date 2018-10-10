package com.company;

public class Main {

    public static void main(String[] args) {

        Student stu1 = new Student(4.9, "Eric");
        Student stu2 = new Student(4.5, "Suzan");
        Student stu3 = new Student(2.5, "Nika");

        String place3 = "";
        String place2 = "";
        String place1 = "";

        if (stu1.gradePointAverage > stu2.gradePointAverage && stu1.gradePointAverage > stu3.gradePointAverage && stu2.gradePointAverage > stu3.gradePointAverage && stu2.gradePointAverage < stu1.gradePointAverage) {
            place1 = stu1.studentName;
            place2 = stu2.studentName;
            place3 = stu3.studentName;
        } else if (stu1.gradePointAverage > stu2.gradePointAverage && stu1.gradePointAverage > stu3.gradePointAverage && stu2.gradePointAverage < stu1.gradePointAverage && stu2.gradePointAverage < stu3.gradePointAverage && stu3.gradePointAverage > stu2.gradePointAverage && stu3.gradePointAverage < stu1.gradePointAverage) {
            place1 = stu1.studentName;
            place2 = stu3.studentName;
            place3 = stu2.studentName;
        } else if (stu1.gradePointAverage < stu2.gradePointAverage && stu1.gradePointAverage > stu3.gradePointAverage && stu2.gradePointAverage > stu1.gradePointAverage && stu2.gradePointAverage > stu3.gradePointAverage){
            place1 = stu2.studentName;
            place2 = stu1.studentName;
            place3 = stu3.studentName;
        } else if (stu1.gradePointAverage < stu3.gradePointAverage) {
            place1 = stu2.studentName;
            place2 = stu3.studentName;
            place3 = stu1.studentName;
        } else if (stu1.gradePointAverage < stu2.gradePointAverage && stu1.gradePointAverage < stu3.gradePointAverage){
            place1 = stu2.studentName;
            place2 = stu3.studentName;
            place3 = stu1.studentName;
        }

        System.out.println(place1 + " " + place2 + " " + place3);
    }
}
