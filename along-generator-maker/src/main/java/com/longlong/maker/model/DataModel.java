package com.longlong.maker.model;

import lombok.Data;

/**
 * 动态模版配置
 * @author longlong
 */
@Data
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "longlong";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
