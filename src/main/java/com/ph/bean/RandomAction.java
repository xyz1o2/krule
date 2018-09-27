package com.ph.bean;

import com.bstek.urule.model.library.action.annotation.ActionBean;
import com.bstek.urule.model.library.action.annotation.ActionMethod;
import com.bstek.urule.model.library.action.annotation.ActionMethodParameter;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
@ActionBean(name="随机数")
public class RandomAction {

    private static Random rand = new Random();

    @ActionMethod(name="生成大于0到给定上限范围内的随机整数")
    @ActionMethodParameter(names={"上限"})
    public Integer random(Integer upper){
        Integer num = RandomAction.rand.nextInt(upper) + 1;
        return num;
    }

    @ActionMethod(name="生成[1-100]随机整数")
    public Integer random100(){
        Integer num = RandomAction.rand.nextInt(100) + 1;
        return num;
    }

}
