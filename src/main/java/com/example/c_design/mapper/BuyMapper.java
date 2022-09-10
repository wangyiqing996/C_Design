package com.example.c_design.mapper;

import com.example.c_design.domain.Buy;
import com.example.c_design.domain.BuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {
    long countByExample(BuyExample example);

    int deleteByExample(BuyExample example);

    int deleteByPrimaryKey(@Param("cId") Long cId, @Param("gId") Long gId);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExample(BuyExample example);

    Buy selectByPrimaryKey(@Param("cId") Long cId, @Param("gId") Long gId);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}