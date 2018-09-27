package com.ph.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UUIDTool {

    private static Integer addition = 1;
    private static Integer base = 1000000000;

    public static String genUUID() {

        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(dt);

        Integer poster = UUIDTool.base + UUIDTool.addition;
        String uuid = "RAID_" + date + "_" + poster.toString();
        UUIDTool.addition ++;

        return uuid;
    }

}
