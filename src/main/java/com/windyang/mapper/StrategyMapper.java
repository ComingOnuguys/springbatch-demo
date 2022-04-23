package com.windyang.mapper;

import com.windyang.domain.Strategy;
import com.windyang.domain.StrategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrategyMapper {
    long countByExample(StrategyExample example);

    int deleteByExample(StrategyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Strategy row);

    int insertSelective(Strategy row);

    List<Strategy> selectByExampleWithBLOBs(StrategyExample example);

    List<Strategy> selectByExample(StrategyExample example);

    Strategy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Strategy row, @Param("example") StrategyExample example);

    int updateByExampleWithBLOBs(@Param("row") Strategy row, @Param("example") StrategyExample example);

    int updateByExample(@Param("row") Strategy row, @Param("example") StrategyExample example);

    int updateByPrimaryKeySelective(Strategy row);

    int updateByPrimaryKeyWithBLOBs(Strategy row);

    int updateByPrimaryKey(Strategy row);
}