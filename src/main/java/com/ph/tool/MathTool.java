package com.ph.tool;

import java.math.BigDecimal;

/**
 * Author: Hardy
 * Date:   2018/7/19 18:31
 * Description:
 **/
public class MathTool {

    private static final int SCALE_NUM = 18;

    /**
     * @param a
     * @param b
     * @return 0: a=b; 1: a>b; -1 a<b
     */
    public static int compare(BigDecimal a, BigDecimal b) {
        a = a == null ? BigDecimal.ZERO : a;
        b = b == null ? BigDecimal.ZERO : b;
        return a.compareTo(b);
    }

    /**
     * 连加法
     *
     * @param args
     * @return
     */
    public static BigDecimal add(BigDecimal... args) {
        if (args.length == 0) return BigDecimal.ZERO;

        BigDecimal res = BigDecimal.ZERO;
        for (BigDecimal arg : args) {
            if (arg == null) continue;
            res = res.add(arg);
        }
        return res;
    }

    /**
     * 连减法 args[0] - args[i>0]
     *
     * @param args
     * @return
     */
    public static BigDecimal sub(BigDecimal... args) {
        if (args.length == 0) return BigDecimal.ZERO;
        // 初始化 被减数
        BigDecimal res = args[0] == null ? BigDecimal.ZERO : args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == null) continue;
            res = res.subtract(args[i]);
        }
        return res;
    }

    /**
     * @param args
     * @return (a * b) 四舍五入保留18位
     */
    public static BigDecimal mul(BigDecimal... args) {
        BigDecimal res = BigDecimal.ONE;
        for (BigDecimal arg : args) {
            if (arg == null) return BigDecimal.ZERO;
            res = res.multiply(arg);
        }
        return res;
    }

    /**
     * @param a
     * @param b
     * @return (a / b) 四舍五入保留18位
     */
    public static BigDecimal div(BigDecimal a, BigDecimal b) {
        if (a == null) return BigDecimal.ZERO;
        b = b == null ? BigDecimal.ZERO : b;
        return a.divide(b, SCALE_NUM, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal scale(BigDecimal a, int num) {
        if (a == null) return BigDecimal.ZERO;
        return a.setScale(num, BigDecimal.ROUND_HALF_UP);
    }
}
