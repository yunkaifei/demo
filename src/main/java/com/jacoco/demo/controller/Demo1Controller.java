package com.jacoco.demo.controller;

import com.jacoco.demo.service.Demo1Service;
import com.jacoco.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author issuser
 */
@RestController
@RequestMapping(path = "/test1")
public class Demo1Controller {
    @Autowired(required=true)
    private Demo1Service demo1Service;
    @PostMapping(path = "/sub")
        public String sub(@RequestParam("str1") String str1,@RequestParam("index") Integer index){
        return demo1Service.sub(str1,index);
    }
    @GetMapping(path = "/max")
    public int max(@RequestParam("i") int i,@RequestParam("j") int j){
        return demo1Service.max(i,j);
    }
    @GetMapping(path = "/min")
    public int min(@RequestParam("i") int i,@RequestParam("j") int j){
        return demo1Service.min(i,j);
    }
}
