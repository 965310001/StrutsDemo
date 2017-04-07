package com.imooc.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by wd on 2017/4/7.
 */
public class HelloWorldAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        System.out.println("执行Action");
        return SUCCESS;
    }
}
