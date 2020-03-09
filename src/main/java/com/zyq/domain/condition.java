package com.zyq.domain;

import lombok.Data;

/**
 * 情况说明实体类  各省的数据情况说明
 */
@Data
public class condition {

    /***
     * id 字段主键
     */
    private int id;

    /**
     *  目前确诊人数
     */
    private int definite;

    /**
     * 累计总感染人数
     */
    private int confirmed;

    /**
     * 疑似感染人数
     */
    private int suspected;

    /**
     * 康复(治愈)人数
     */
    private int recovery;

    /**
     * 重症人数
     */
    private int icu;


    /**
     * 死亡人数
     */
    private int die;


    /**
     * 统计时间
     */
    private String date;
}
