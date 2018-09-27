package com.ph.tool;

/**
 * Author: Hardy
 * Date:   2018/7/20 19:58
 * Description:
 **/
public class SleepTool {

    /**
     * @param ms 毫秒值
     */
    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }
}
