package com.example.c_design.mapper;

import com.example.c_design.domain.Belong;
import com.example.c_design.domain.BelongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BelongMapper {
    long countByExample(BelongExample example);

    int deleteByExample(BelongExample example);

    int deleteByPrimaryKey(@Param("sId") Long sId, @Param("uId") Long uId);

    int insert(Belong record);

    int insertSelective(Belong record);

    List<Belong> selectByExample(BelongExample example);

    int updateByExampleSelective(@Param("record") Belong record, @Param("example") BelongExample example);

    int updateByExample(@Param("record") Belong record, @Param("example") BelongExample example);
}