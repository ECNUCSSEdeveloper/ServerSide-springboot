package com.tia.springbootserver.mapper;

import com.tia.springbootserver.entity.MatchRecruit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRecruitMapper {
    int deleteByPrimaryKey(@Param("matchId") Integer matchId, @Param("recruitId") Integer recruitId);

    int insert(MatchRecruit record);

    int insertSelective(MatchRecruit record);
}