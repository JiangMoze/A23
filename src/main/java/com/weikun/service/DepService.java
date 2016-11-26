package com.weikun.service;

import com.weikun.mapper.DepMapper;
import com.weikun.mapper.MyDepMapper;
import com.weikun.model.Dep;
import com.weikun.model.DepExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/26.
 */
@Service
public class DepService {
    @Autowired
    private DepMapper depMapper;

    @Autowired
    private MyDepMapper myDepMapper;

    public Dep selectByPrimaryKey(Integer id){
        return depMapper.selectByPrimaryKey(id);
    }


    public List<Dep> selectByExample(DepExample example){
        return depMapper.selectByExample(example);
    }

    public List<Dep> selectAll(){
        return myDepMapper. selectAll();
    }
}
