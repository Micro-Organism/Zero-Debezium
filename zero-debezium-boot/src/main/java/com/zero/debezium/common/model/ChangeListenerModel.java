package com.zero.debezium.common.model;

import lombok.Data;

@Data
public class ChangeListenerModel {

    /**
     * 当前DB
     */
    private String db;

    /**
     * 当前表
     */
    private String table;

    /**
     * 操作类型 1add 2update 3 delete
     */
    private Integer eventType;

    /**
     * 操作时间
     */
    private Long changeTime;

    /**
     * 现数据
     */
    private String data;

    /**
     * 之前数据
     */
    private String beforeData;

}
