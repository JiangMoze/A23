package com.weikun.service;

import com.weikun.mapper.DepMapper;
import com.weikun.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/26.
 */
@Service
public class DepService {
    @Autowired
    private DepMapper depMapper;
    public Dep selectByPrimaryKey(Integer id){
        return depMapper.selectByPrimaryKey(id);
    }
}
