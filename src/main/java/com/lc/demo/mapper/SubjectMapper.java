package com.lc.demo.mapper;

import com.lc.demo.bean.Subject;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName ClassMapper
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 22:04
 * @Version 1.0
 **/
@Mapper
public interface SubjectMapper {

    @Select("select * from subject")
    List<Subject> selectAllSubject();

    @Select("select * from subject where sub_id=#{subId}")
    Subject selectSubjectById(String subId);


    @Delete("DELETE from subject where sub_id=#{subId}")
    int delectSubjectById(String subjectId);

    @Insert("insert into subject values(#{subId},#{subName})")
    int insertSubject(Subject subj);

    @Select("select * from subject where sub_name=#{subName}")
    Subject selectSubjectByName(String className);
}
