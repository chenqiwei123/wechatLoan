package com.tencent.wxcloudrun.model;

import com.tencent.wxcloudrun.tool.LoanTimeUtils;
import lombok.Data;
import lombok.Getter;

@Getter

@Data
public class RequestView {

    // 第几条
    private Integer index;

    // cookie
    private String cookie;

    // json
    private String json;

    // 是否成功
    private String success;

    // 错误信息
    private String errorMsg;

    // 当前时间
    private String time;

    public RequestView() {
        this.time = LoanTimeUtils.getChinaLogTime();
    }
}