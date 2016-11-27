package com.weikun.controller;

import com.weikun.model.Dep;
import com.weikun.model.DepExample;
import com.weikun.model.Employee;
import com.weikun.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/11/26.
 */
@Controller
public class MyController {
    @Autowired
    private DepService service;
    @RequestMapping("/")
    public Object index(){
        Dep d=service.selectByPrimaryKey(1);
        System.out.print(d.getDeptname());

        return "ok";
    }

    @RequestMapping("/all")
    public Object getAll(){
        DepExample example=new DepExample();
        List<Dep> list=service.selectByExample(example);
        System.out.print(list);
        return list;
    }
    @RequestMapping("/all1")
    public Object getAll1(){
        List<Dep> list=service.selectAll();
        System.out.print(list);
        return "";
    }


    @RequestMapping("/all2/no/{no}")
    public Object getAll2(@PathVariable("no") Integer no){//通过dep找到employees
        Dep dep=service.findDepEmployeesById(no);
        System.out.print(dep.getDeptname());

        List<Employee> list=(List<Employee>)dep.getElist();

        for(Employee e :list){
            System.out.print(e.getName());
        }
        return "";
    }
}
