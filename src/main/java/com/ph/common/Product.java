package com.ph.common;

import java.util.Arrays;
import java.util.List;

public class Product {

    public final static Integer IS_ADMIN = 1;       //是管理员
    public final static Integer IS_NOT_ADMIN = 0;   //不是管理员

    public final static Integer RUN_TEST_INIT = 0;       //试跑初始化
    public final static Integer RUN_TEST_SUC = 1;   //试跑成功
    public final static Integer RUN_TEST_FAIL = 2;   //试跑失败

    public final static Integer PREVIEW_TYPE_SINGLE = 0;       //单例试跑
    public final static Integer PREVIEW_TYPE_BATCH = 1;       //批量试跑

    //支持的产品线
    public final static String PRODUCT_LINE_CS = "CS";      //CS-现金分期
    public final static String PRODUCT_LINE_BT = "BT";      //BT-信用卡代偿
    public final static String PRODUCT_LINE_HF = "HF";      //HF-公积金贷款
    public final static List PRODUCT_LINE = Arrays.asList(PRODUCT_LINE_CS, PRODUCT_LINE_BT, PRODUCT_LINE_HF);


    //支持的策略类型
    public final static String STRATEGY_TYPE_SET = "SET";       //SET-决策集
    public final static String STRATEGY_TYPE_TABLE = "TABLE";   //TABLE-决策表
    public final static String STRATEGY_TYPE_TREE = "TREE";     //TREE-决策树
    public final static String STRATEGY_TYPE_CARD = "CARD";     //CARD-评分卡
    public final static String STRATEGY_TYPE_FLOW = "FLOW";     //FLOW-决策流
    public final static List STRATEGY_TYPE = Arrays.asList(STRATEGY_TYPE_SET, STRATEGY_TYPE_TABLE, STRATEGY_TYPE_TREE, STRATEGY_TYPE_CARD, STRATEGY_TYPE_FLOW);


    //检测传入的产品线是否支持
    public static boolean checkProductLine(Object productLine){
        String test = productLine.toString().toUpperCase();
        if (PRODUCT_LINE.contains(test)) {
            return true;
        }
        return true;
    }

    //检测传入的策略类型是否支持
    public static boolean checkStrategyType(Object strategyType){
        String test = strategyType.toString().toUpperCase();
        if (STRATEGY_TYPE.contains(test)) {
            return true;
        }
        return false;
    }

}
