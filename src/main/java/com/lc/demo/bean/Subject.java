package com.lc.demo.bean;

import javax.validation.constraints.Size;

/**
 * @subjectName subject
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 21:55
 * @Version 1.0
 **/
public class Subject {

    @Size(min=6,max = 6,message = "班级号长度必须为6")
    private String subId;
    private String subName;
    private String subTerm;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName,String subjectTerm) {
        this.subId = subjectId;
        this.subName = subjectName;
        this.subTerm = subjectTerm;
    }

    public String getsubjectId() {
        return subId;
    }

    public void setsubjectId(String subjectId) {
        this.subId = subjectId;
    }

    public String getsubjectName() {
        return subName;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubTerm() {
        return subTerm;
    }

    public void setSubTerm(String subTerm) {
        this.subTerm = subTerm;
    }

    public void setsubjectName(String subjectName) {
        this.subName = subjectName;
    }

    @Override
    public String toString() {
        return "subject{" +
                "subjectId='" + subId + '\'' +
                ", subjectName='" + subName + '\'' +
                '}';
    }
}
