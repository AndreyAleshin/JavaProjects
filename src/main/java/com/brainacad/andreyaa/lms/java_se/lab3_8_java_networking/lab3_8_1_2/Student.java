package com.brainacad.andreyaa.lms.java_se.lab3_8_java_networking.lab3_8_1_2;

import java.io.Serializable;

class Student implements Serializable {

    private String name;
    private String course;
    private int id;
    private String access = "*Ask server for rights*";

    Student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name = " + name +
                ", course = " + course +
                ", id = " + id +
                ", access = " + access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (course != null ? !course.equals(student.course) : student.course != null) return false;
        return access != null ? access.equals(student.access) : student.access == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (access != null ? access.hashCode() : 0);
        return result;
    }

}
