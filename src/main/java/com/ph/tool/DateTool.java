package com.ph.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Hardy
 * Date:   2018/7/19 15:54
 * Description:
 **/
public class DateTool {

    /**
     * @return 当前时间毫秒秒值
     */
    public static long getCurrentTimeMillis(){
        return System.currentTimeMillis();
    }

    /**
     * @return 当前时间秒值
     */
    public static int getCurrentTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /**
     * @return 今日0时
     */
    public static int getTodayTime() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String nowDay = sdf.format(new Date());
            return (int) (sdf.parse(nowDay).getTime() / 1000);
        } catch (ParseException ignored) {
        }
        return 0;
    }

    /**
     * @return 某日0时
     */
    public static int getDayTime(int offset) {
        int todayTime = getTodayTime();
        return offset * 86400 + todayTime;
    }
}
