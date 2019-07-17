package com.hdu.demo.mapper;

import com.hdu.demo.bean.Question;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 14:53 2019/7/17
 * @Modified By:
 */
@Mapper
@Component(value = "QuestionMapper")
public interface QuestionMapper {

    /**
     * 全部问题查询
     * */
    @Select("select id, question, choose, type, answer from test")
    List<Question> findall();

    /**
     * 新增问题
     * */
    @Insert("INSERT INTO test(question, choose, type, answer)VALUES(#{question}, #{choose}, #{type}, #{answer})")
    void addQuestion(Question question);

    /**
     * 修改问题
     * */
    @Update("UPDATE test SET answer=#{answer} WHERE id=#{id}")
    void updateQuestion(Question question);

    /**
     * 删除问题
     * */
    @Delete("DELETE FROM test WHERE ID=#{id}")
    void deleteQuestion(int id);

    @Select("select id, question, choose, type, answer from test where id=#{id}")
    Question findById(@Param("id")int id);
}
