package com.tencent.wxcloudrun.tool;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LoanTimeUtils {

    // 固定使用中国大陆时区
    private static final ZoneId CHINA_ZONE = ZoneId.of("Asia/Shanghai");
    // 格式：年-月-日 时:分:秒.毫秒 时区偏移（+0800 让人一眼看出是东八区）
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS Z");

    public static String getChinaLogTime() {
        ZonedDateTime now = ZonedDateTime.now(CHINA_ZONE);
        return now.format(FORMATTER);
    }
}