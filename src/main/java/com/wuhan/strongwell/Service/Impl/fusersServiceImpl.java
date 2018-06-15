package com.wuhan.strongwell.Service.Impl;

import com.wuhan.strongwell.Entity.fusers;
import com.wuhan.strongwell.Dao.fusersMapper;
import com.wuhan.strongwell.Service.fusersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("fuserService")
public class fusersServiceImpl implements fusersService {
    @Resource
    private fusersMapper fusersMapper;

    @Override
    public fusers selectByPrimaryKey(int id) {
        return this.fusersMapper.selectByPrimaryKey(id);
    }
}
