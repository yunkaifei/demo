package com.jacoco.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author issuser
 */
@Component
public interface DemoService {
    /**
     * 添加数据
     *
     * @param str1 str1
     * @param str2 str2
     * @return Result<String>
     */
    String joinStr(String str1,String str2);
    /**
     * 添加数据
     *
     * @param i i
     * @param j j
     * @return Result<String>
     */
    int add(int i, int j);
    /**
     * 自动补领
     *
     * @param i i
     * @param j j
     * @return Result<String>
     */
    String add0(int i);
}
