package com.jacoco.demo.service.impl;

import com.jacoco.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author issuser
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String joinStr(String str1,String str2) {
        return str1 + str2;
    }
    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public String add0(int i) {
        int j = 10;
        if(i<j){

            return "0" +String.valueOf(i);
        }else {
            return String.valueOf(i);
        }
    }
}
