package com.lc.demo.bean;

import javax.validation.constraints.Size;

/**
 * @ClassName Class
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 21:55
 * @Version 1.0
 **/
public class Classes {

    @Size(min=1,max = 6,message = "课程号号长度为小于6")
    private String classId;
    private String className;

    public Classes() {
    }

    public Classes(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
