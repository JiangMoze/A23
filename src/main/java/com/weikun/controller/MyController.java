package com.weikun.controller;

import com.weikun.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/26.
 */
@Controller
public class MyController {
    @Autowired
    private DepService service;
    @RequestMapping("/")
    public String index(){
        service.selectByPrimaryKey(1);


        return "";
    }
}
