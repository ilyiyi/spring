package com.wak.domain;

import lombok.Data;

/**
 * @author wak
 */
@Data
public class Item {
    private Long id;
    private String name;
    private String type;
    private String remark;
}
