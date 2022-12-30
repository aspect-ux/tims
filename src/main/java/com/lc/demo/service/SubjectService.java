package com.lc.demo.service;

import com.lc.demo.bean.Subject;
import java.util.List;

/**
 * @ClassName SubjectService
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 22:14
 * @Version 1.0
 **/
public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject selectById(String subjectId);

    Subject selectByName(String subjectName);

    int deleteById(String subjectId);

    int addSubject(Subject subject);


}
