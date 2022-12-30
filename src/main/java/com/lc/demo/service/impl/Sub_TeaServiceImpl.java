package com.lc.demo.service.impl;

import com.lc.demo.bean.Sub_Tea;
import com.lc.demo.bean.Subject;
import com.lc.demo.mapper.Sub_TeaMapper;
import com.lc.demo.service.Sub_TeaService;
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
public class Sub_TeaServiceImpl implements Sub_TeaService {

    @Autowired
    private Sub_TeaMapper subjectMapper;

    @Override
    public List<Sub_Tea> getAllSubjects() {
        return subjectMapper.selectAllSubject();
    }

    @Override
    public Sub_Tea selectById(String SubjectId) {
        return subjectMapper.selectSubjectById(SubjectId);
    }

    @Override
    public int deleteById(String SubjectId) {
        return subjectMapper.delectSubjectById(SubjectId);
    }


    @Override
    public int addSubject(Sub_Tea Subjects) {
        return subjectMapper.insertSubject(Subjects);
    }

    @Override
    public Sub_Tea selectByName(String subjectName) {
        return subjectMapper.selectSubjectByName(subjectName);
    }
}
