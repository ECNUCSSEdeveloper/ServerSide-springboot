package com.tia.springbootserver.service;

import com.github.pagehelper.PageInfo;
import com.tia.springbootserver.entity.*;
import com.tia.springbootserver.entity.returnType.simpleMatch;


public interface RecruitService {
    int createRecruit(Recruitment recruitment);
    int createRecruitWithId(Recruitment recruitment);
    int updateRecruitInfo(Recruitment recruitment);
    PageInfo<Recruitment> findAllRecruit(Integer pageNum, Integer pageSize);
    Recruitment findRecruitById(Integer recruitId);
    PageInfo<Recruitment> findRecruitByName(String recruitName,Integer pageNum, Integer pageSize);
    int deleteRecruit(Integer recruitId);
    int bindToMatch(Integer recruitId, Integer matchId, String matchName);
    simpleMatch getBindMatch(Integer recruitId);
    int deleteRecruitFromUser(Integer recruitId);
    int register(RecruitApplicants record);
    int unregister(RecruitApplicants record);
    PageInfo<User> getApplicantsInfo(Integer recruitId, Integer pageNum, Integer pageSize);

}
