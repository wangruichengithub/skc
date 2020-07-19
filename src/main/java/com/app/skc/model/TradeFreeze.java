package com.app.skc.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("skc_trade_freeze")
public class TradeFreeze extends Model <TradeFreeze> {
    private String id;
    private String userName;
    private String userId;
    private String status;
    private Date createTime;
    private Date modifyTime;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
