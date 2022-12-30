package com.lc.demo.service;

import com.lc.demo.bean.Sub_Tea;
import com.lc.demo.bean.Subject;
import java.util.List;

/**
 * @ClassName SubjectService
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 22:14
 * @Version 1.0
 **/
// copy from subjectService,ignore some repeats
public interface Sub_TeaService {

    List<Sub_Tea> getAllSubjects();

    Sub_Tea selectById(String subjectId);

    Sub_Tea selectByName(String subjectName);

    int deleteById(String subjectId);

    int addSubject(Sub_Tea subject);


}
