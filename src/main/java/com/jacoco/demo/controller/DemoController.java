package com.jacoco.demo.controller;

import com.jacoco.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author issuser
 */
@RestController
@RequestMapping(path = "/test")
public class DemoController {
    @Autowired(required=true)
    private DemoService demoService;
    @PostMapping(path = "/joinStr")
        public String joinStr(@RequestParam("str1") String str1,@RequestParam("str2") String str2){
        return demoService.joinStr(str1,str2);
    }
    @GetMapping(path = "/add")
    public int add(@RequestParam("i") int i,@RequestParam("j") int j){
        return demoService.add(i,j);
    }
    @GetMapping(path = "/add0")
    public String add0(@RequestParam("i") int i){
        return demoService.add0(i);
    }
}
