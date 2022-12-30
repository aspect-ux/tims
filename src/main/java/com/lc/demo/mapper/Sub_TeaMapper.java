package com.lc.demo.mapper;

import com.lc.demo.bean.Sub_Tea;
import com.lc.demo.bean.Subject;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName ClassMapper
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 22:04
 * @Version 1.0
 **/
@Mapper
public interface Sub_TeaMapper {

    @Select("select * from subject_teacher")
    List<Sub_Tea> selectAllSubject();

    @Select("select * from subject_teacher where sub_id=#{subId}")
    Sub_Tea selectSubjectById(String subId);


    @Delete("DELETE from subject_teacher where sub_id=#{subId}")
    int delectSubjectById(String subjectId);

    @Insert("insert into subject_teacher values(null,#{subId},#{subName},'18-2020-1',#{teaName})")
    int insertSubject(Sub_Tea subj);

    @Select("select * from subject_teacher where sub_name=#{subName}")
    Sub_Tea selectSubjectByName(String className);
}
