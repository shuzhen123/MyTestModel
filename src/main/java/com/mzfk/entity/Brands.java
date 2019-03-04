package com.mzfk.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName: Brands
 * @Description: 牌子
 * @Author sz
 * @Date 2019/3/1/16:51
 */
@Data
public class Brands {

    private String code;

    private int name;

    private String wallet;

    private String jackpotUrl
            ;

    private String status;

    private String rate;

    private Timestamp createdAt;

    private Timestamp updatedAt;//asd//1213

}
