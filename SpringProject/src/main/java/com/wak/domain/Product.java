package com.wak.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author wak
 * 实体类
 */

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseDomain {
    private Long id;

    private String name;

    private Double price;

    private String remark;

    @JsonFormat(pattern = "yyyy-MM-dd MM:hh:ss", timezone = "GMT+8")
    private Date createTime;

    private Long createId;

    private Date updateTime;

    private Long updateId;
}