package com.jacoco.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author issuser
 */
@Component
public interface Demo1Service {
    /**
     * 添加数据
     *
     * @param str1 str1
     * @param str2 str2
     * @return Result<String>
     */
    String sub(String str1,Integer str2);
    /**
     * 取大数
     *
     * @param i i
     * @param j j
     * @return Result<int>
     */
    int max(int i, int j);

    /**
     * 取小数
     *
     * @param i i
     * @param j j
     * @return Result<int>
     */
    int min(int i, int j);
}
