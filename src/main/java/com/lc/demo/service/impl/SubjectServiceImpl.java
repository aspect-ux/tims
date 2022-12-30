package com.lc.demo.service.impl;

import com.lc.demo.bean.Subject;
import com.lc.demo.mapper.SubjectMapper;
import com.lc.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @SubjectName SubjectServiceImpl
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 22:15
 * @Version 1.0
 **/
@Service
public class SubjectServiceImpl implements SubjectService {


    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectMapper.selectAllSubject();
    }

    @Override
    public Subject selectById(String SubjectId) {
        return subjectMapper.selectSubjectById(SubjectId);
    }

    @Override
    public int deleteById(String SubjectId) {
        return subjectMapper.delectSubjectById(SubjectId);
    }

    @Override
    public int addSubject(Subject Subjects) {
        return subjectMapper.insertSubject(Subjects);
    }

    @Override
    public Subject selectByName(String subjectName) {
        return subjectMapper.selectSubjectByName(subjectName);
    }
}
