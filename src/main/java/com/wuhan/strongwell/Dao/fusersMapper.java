package com.wuhan.strongwell.Dao;

import com.wuhan.strongwell.Entity.fusers;

public interface fusersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(fusers record);

    int insertSelective(fusers record);

    fusers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(fusers record);

    int updateByPrimaryKey(fusers record);
}