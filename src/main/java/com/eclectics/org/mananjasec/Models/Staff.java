package com.eclectics.org.mananjasec.Models;

public class Staff {
    private Long Id;
    private String Name;
    private String Gender;
    private String Subject;
    private String status;


    public Staff(Long id, String name, String gender, String subject, String status) {
        Id = id;
        Name = name;
        Gender = gender;
        Subject = subject;
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //converting to a string

    @Override
    public String toString() {
        return "Staff{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Subject='" + Subject + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
