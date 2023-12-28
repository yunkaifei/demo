package com.jacoco.demo.service.impl;

import com.jacoco.demo.service.Demo1Service;
import com.jacoco.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author issuser
 */
@Service
public class Demo1ServiceImpl implements Demo1Service {

    @Override
    public String sub(String str1,Integer str2) {
        if(str2>str1.length()){
            return str1.substring(str2);
        }else{
            return str1;
        }
    }
    @Override
    public int max(int i, int j) {
        if (i>=j){
            return i;
        }else{
            return j;
        }
    }
    @Override
    public int min(int i, int j) {
        if (i>=j){
            return j;
        }else{
            return i;
        }
    }
}
