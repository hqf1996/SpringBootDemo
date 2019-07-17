package com.hdu.demo.controller;

import com.hdu.demo.bean.Question;
import com.hdu.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 15:15 2019/7/17
 * @Modified By:
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/listQuestion")
    public String listQuestion(Model model){
        List<Question> questions = questionService.findAll();
        model.addAttribute("questions", questions);
        return "listQuestion";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/addQuestion";
    }

    @RequestMapping("/add")
    public String addQuestion(Question question){
        questionService.addQuestion(question);
        return "redirect:/listQuestion";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, int id) {
        Question question = questionService.findById(id);
        model.addAttribute("question", question);
        return "/updateQuestion";
    }

    @RequestMapping("/update")
    public String updateQuestion(Question question) {
        questionService.updateQuestion(question);
        return "redirect:/listQuestion";
    }

    @RequestMapping("/delete")
    public String deleteQuestion(int id) {
        questionService.deleteQuestion(id);
        return "redirect:/listQuestion";
    }
}
