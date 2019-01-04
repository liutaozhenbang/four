package com.liutao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsSku {
    private Date date;
    private String startDate;
    private String endDate;
    private String site;
    private String goodsName;
    private String categoryId;
    private Long pv;
    private Long uv;
}