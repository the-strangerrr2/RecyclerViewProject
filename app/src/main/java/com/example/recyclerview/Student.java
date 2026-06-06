package com.example.recyclerview;

public class Student {
    private final String name;
    private final String major;
    private final String code;

    public Student(String name, String major, String code) {
        this.name = name;
        this.major = major;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getCode() {
        return code;
    }
}
