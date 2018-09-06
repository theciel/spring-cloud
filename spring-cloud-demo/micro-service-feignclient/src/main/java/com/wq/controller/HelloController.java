package com.wq.controller;import com.wq.entity.User;import com.wq.feign.FeignClient;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestParam;import org.springframework.web.bind.annotation.RestController;/** * Created by wengqian on 2018/6/15. */@RestControllerpublic class HelloController {    @Autowired    FeignClient feignClient;    @RequestMapping(value = "/hello")    public String hello( @RequestParam String name) {        return feignClient.hello(name);    }    @RequestMapping(value = "/hello1")    public String hello1( @RequestParam String name) {        User user = new User();        user.setName(name);        return feignClient.hello(user);    }    @RequestMapping(value = "/hello2")    public String hello( @RequestBody User user) {        return feignClient.hello(user);    }}