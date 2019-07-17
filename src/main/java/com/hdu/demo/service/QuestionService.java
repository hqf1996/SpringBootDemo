package com.hdu.demo.service;

import com.hdu.demo.bean.Question;
import com.hdu.demo.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 15:02 2019/7/17
 * @Modified By:
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 获取全部问题
     * */
    public List<Question> findAll(){
        return questionMapper.findall();
    }

    /**
     * 添加问题
     * */
    @Transactional
    public void addQuestion(Question question){
        questionMapper.addQuestion(question);
    }

    /**
     * 修改问题
     * */
    public void updateQuestion(Question question){
        questionMapper.updateQuestion(question);
    }

    /**
     * 删除问题
     * */
    public void deleteQuestion(int id){
        questionMapper.deleteQuestion(id);
    }

    /**
     * 查询指定问题
     * */
    public Question findById(int id) {
        return questionMapper.findById(id);
    }
}
