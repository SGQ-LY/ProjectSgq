package com.example.bean;

public class User {
    private Integer id;
    private String truename;
    private String loginname;
    private String password;
    private String gender;
    private Integer age;
    private Integer fk_dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFk_dept() {
        return fk_dept;
    }

    public void setFk_dept(Integer fk_dept) {
        this.fk_dept = fk_dept;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", truename='" + truename + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", fk_dept=" + fk_dept +
                '}';
    }
}
