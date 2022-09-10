package com.example.c_design.mapper;

import com.example.c_design.domain.Store;
import com.example.c_design.domain.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Long sId);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Long sId);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}