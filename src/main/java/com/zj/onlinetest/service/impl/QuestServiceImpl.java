package com.zj.onlinetest.service.impl;

import com.zj.onlinetest.Repository.QuestionRepository;
import com.zj.onlinetest.domain.Question;
import com.zj.onlinetest.service.QuestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Auther: zj
 * @Date: 2019/4/17 14:01
 * @Description:
 */
@Service
public class QuestServiceImpl implements QuestService{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question add(String id, String subject, Long createTime) {
        Question question = new Question();
        question.setId( id );
        question.setSubject( subject );
        question.setCreateTime( createTime );
        questionRepository.save( question );
        return null;
    }

    @Override
    public Question selectOneById(String id) {
        Question question = questionRepository.findOneById( id );
        return question;
    }

    @Override
    public List<Question> selectAll() {
        List<Question> questionList = questionRepository.findAllByOrderByCreateTimeDesc();
        return questionList;
    }

    @Override
    public List<Question> selectAll(Integer pageIndex) {
        Pageable pageable = PageRequest.of( pageIndex,5);
        return questionRepository.findAllByOrderByCreateTimeDesc( pageable).getContent();
    }

    @Override
    public Question saveOrUpdate(Question question) {
        questionRepository.save( question );
        return null;
    }

    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete( question );
    }
}
