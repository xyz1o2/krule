package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;

import java.util.Date;


/**
 * 
 * <p>Title: pdl_mobile_fea1 - 运营商特征表1 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-05
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PdlMobileFea1 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("主叫第3周时区b通话次数")
	private Double d14210712CallCt = null;
	@Label("主叫第3周时区b通话平均时长")
	private Double d14210712CallLen = null;
	@Label("被叫第3周时区b通话次数")
	private Double d14210712CalledCt = null;
	@Label("被叫第3周时区b通话平均时长")
	private Double d14210712CalledLen = null;
	@Label("第3周时区b通话次数")
	private Double d14210712Ct = null;
	@Label("第3周时区b通话平均时长")
	private Double d14210712Len = null;
	@Label("第3周时长1主叫通话次数")
	private Double d1421010CallCt = null;
	@Label("第3周时长1被叫通话次数")
	private Double d1421010CalledCt = null;
	@Label("第3周时长1通话次数")
	private Double d1421010Ct = null;
	@Label("第3周时长2主叫通话次数")
	private Double d14211040CallCt = null;
	@Label("第3周时长2被叫通话次数")
	private Double d14211040CalledCt = null;
	@Label("第3周时长2通话次数")
	private Double d14211040Ct = null;
	@Label("第3周时长4主叫通话次数")
	private Double d1421120350CallCt = null;
	@Label("第3周时长4被叫通话次数")
	private Double d1421120350CalledCt = null;
	@Label("第3周时长4通话次数")
	private Double d1421120350Ct = null;
	@Label("主叫第3周时区c通话次数")
	private Double d14211218CallCt = null;
	@Label("主叫第3周时区c通话平均时长")
	private Double d14211218CallLen = null;
	@Label("被叫第3周时区c通话次数")
	private Double d14211218CalledCt = null;
	@Label("被叫第3周时区c通话平均时长")
	private Double d14211218CalledLen = null;
	@Label("第3周时区c通话次数")
	private Double d14211218Ct = null;
	@Label("第3周时区c通话平均时长")
	private Double d14211218Len = null;
	@Label("主叫第3周时区d通话次数")
	private Double d14211822CallCt = null;
	@Label("主叫第3周时区d通话平均时长")
	private Double d14211822CallLen = null;
	@Label("被叫第3周时区d通话次数")
	private Double d14211822CalledCt = null;
	@Label("被叫第3周时区d通话平均时长")
	private Double d14211822CalledLen = null;
	@Label("第3周时区d通话次数")
	private Double d14211822Ct = null;
	@Label("第3周时区d通话平均时长")
	private Double d14211822Len = null;
	@Label("主叫第3周时区a通话次数")
	private Double d14212207CallCt = null;
	@Label("主叫第3周时区a通话平均时长")
	private Double d14212207CallLen = null;
	@Label("被叫第3周时区a通话次数")
	private Double d14212207CalledCt = null;
	@Label("被叫第3周时区a通话平均时长")
	private Double d14212207CalledLen = null;
	@Label("第3周时区a通话次数")
	private Double d14212207Ct = null;
	@Label("第3周时区a通话平均时长")
	private Double d14212207Len = null;
	@Label("第3周时长5主叫通话次数")
	private Double d1421350CallCt = null;
	@Label("第3周时长5被叫通话次数")
	private Double d1421350CalledCt = null;
	@Label("第3周时长5通话次数")
	private Double d1421350Ct = null;
	@Label("第3周时长3主叫通话次数")
	private Double d142140120CallCt = null;
	@Label("第3周时长3被叫通话次数")
	private Double d142140120CalledCt = null;
	@Label("第3周时长3通话次数")
	private Double d142140120Ct = null;
	@Label("第3周不同地址数量")
	private Double d1421AddrCt = null;
	@Label("第3周主叫通话总时长")
	private Double d1421AllCallLen = null;
	@Label("第3周被叫通话总时长")
	private Double d1421AllCalledLen = null;
	@Label("第3周通话总时长")
	private Double d1421AllLen = null;
	@Label("主叫第3周不同地址数量")
	private Double d1421CallAddrCt = null;
	@Label("第3周主叫数量")
	private Double d1421CallCt = null;
	@Label("第3周主被叫比值  主叫为0，值为0；被叫为0，值为-1；主叫被叫都为0，值为-2")
	private Double d1421CallPer = null;
	@Label("被叫第3周不同地址数量")
	private Double d1421CalledAddrCt = null;
	@Label("第3周被叫数量")
	private Double d1421CalledCt = null;
	@Label("第3周呼叫数量")
	private Double d1421Ct = null;
	@Label("第3周数量排名第1位地址占总呼叫次数比")
	private Double d1421Top1AddrPer = null;
	@Label("第3周主叫数量排名第1位地址占总呼叫次数比")
	private Double d1421Top1CallAddrPer = null;
	@Label("第3周被叫数量排名第1位地址占总呼叫次数比")
	private Double d1421Top1CalledAddrPer = null;
	@Label("第3周数量排名第2位地址占总呼叫次数比")
	private Double d1421Top2AddrPer = null;
	@Label("第3周主叫数量排名第2位地址占总呼叫次数比")
	private Double d1421Top2CallAddrPer = null;
	@Label("第3周被叫数量排名第2位地址占总呼叫次数比")
	private Double d1421Top2CalledAddrPer = null;
	@Label("主叫第1月时区b通话次数")
	private Double d1300712CallCt = null;
	@Label("主叫第1月时区b通话平均时长")
	private Double d1300712CallLen = null;
	@Label("被叫第1月时区b通话次数")
	private Double d1300712CalledCt = null;
	@Label("被叫第1月时区b通话平均时长")
	private Double d1300712CalledLen = null;
	@Label("第1月时区b通话次数")
	private Double d1300712Ct = null;
	@Label("第1月时区b通话平均时长")
	private Double d1300712Len = null;
	@Label("第1月时长1主叫通话次数")
	private Double d130010CallCt = null;
	@Label("第1月时长1被叫通话次数")
	private Double d130010CalledCt = null;
	@Label("第1月时长1通话次数")
	private Double d130010Ct = null;
	@Label("第1月时长2主叫通话次数")
	private Double d1301040CallCt = null;
	@Label("第1月时长2被叫通话次数")
	private Double d1301040CalledCt = null;
	@Label("第1月时长2通话次数")
	private Double d1301040Ct = null;
	@Label("第1月时长4主叫通话次数")
	private Double d130120350CallCt = null;
	@Label("第1月时长4被叫通话次数")
	private Double d130120350CalledCt = null;
	@Label("第1月时长4通话次数")
	private Double d130120350Ct = null;
	@Label("主叫第1月时区c通话次数")
	private Double d1301218CallCt = null;
	@Label("主叫第1月时区c通话平均时长")
	private Double d1301218CallLen = null;
	@Label("被叫第1月时区c通话次数")
	private Double d1301218CalledCt = null;
	@Label("被叫第1月时区c通话平均时长")
	private Double d1301218CalledLen = null;
	@Label("第1月时区c通话次数")
	private Double d1301218Ct = null;
	@Label("第1月时区c通话平均时长")
	private Double d1301218Len = null;
	@Label("主叫第1月时区d通话次数")
	private Double d1301822CallCt = null;
	@Label("主叫第1月时区d通话平均时长")
	private Double d1301822CallLen = null;
	@Label("被叫第1月时区d通话次数")
	private Double d1301822CalledCt = null;
	@Label("被叫第1月时区d通话平均时长")
	private Double d1301822CalledLen = null;
	@Label("第1月时区d通话次数")
	private Double d1301822Ct = null;
	@Label("第1月时区d通话平均时长")
	private Double d1301822Len = null;
	@Label("主叫第1月时区a通话次数")
	private Double d1302207CallCt = null;
	@Label("主叫第1月时区a通话平均时长")
	private Double d1302207CallLen = null;
	@Label("被叫第1月时区a通话次数")
	private Double d1302207CalledCt = null;
	@Label("被叫第1月时区a通话平均时长")
	private Double d1302207CalledLen = null;
	@Label("第1月时区a通话次数")
	private Double d1302207Ct = null;
	@Label("第1月时区a通话平均时长")
	private Double d1302207Len = null;
	@Label("第1月时长5主叫通话次数")
	private Double d130350CallCt = null;
	@Label("第1月时长5被叫通话次数")
	private Double d130350CalledCt = null;
	@Label("第1月时长5通话次数")
	private Double d130350Ct = null;
	@Label("第1月时长3主叫通话次数")
	private Double d13040120CallCt = null;
	@Label("第1月时长3被叫通话次数")
	private Double d13040120CalledCt = null;
	@Label("第1月时长3通话次数")
	private Double d13040120Ct = null;
	@Label("第1月不同地址数量")
	private Double d130AddrCt = null;
	@Label("第1月主叫通话总时长")
	private Double d130AllCallLen = null;
	@Label("第1月被叫通话总时长")
	private Double d130AllCalledLen = null;
	@Label("第1月通话总时长")
	private Double d130AllLen = null;
	@Label("主叫第1月不同地址数量")
	private Double d130CallAddrCt = null;
	@Label("被叫第1月不同地址数量")
	private Double d130CalledAddrCt = null;
	@Label("主叫第1周时区b通话次数")
	private Double d170712CallCt = null;
	@Label("主叫第1周时区b通话平均时长")
	private Double d170712CallLen = null;
	@Label("被叫第1周时区b通话次数")
	private Double d170712CalledCt = null;
	@Label("被叫第1周时区b通话平均时长")
	private Double d170712CalledLen = null;
	@Label("第1周时区b通话次数")
	private Double d170712Ct = null;
	@Label("第1周时区b通话平均时长")
	private Double d170712Len = null;
	@Label("第1周时长1主叫通话次数")
	private Double d17010CallCt = null;
	@Label("第1周时长1被叫通话次数")
	private Double d17010CalledCt = null;
	@Label("第1周时长1通话次数")
	private Double d17010Ct = null;
	@Label("第1周时长2主叫通话次数")
	private Double d171040CallCt = null;
	@Label("第1周时长2被叫通话次数")
	private Double d171040CalledCt = null;
	@Label("第1周时长2通话次数")
	private Double d171040Ct = null;
	@Label("第1周时长4主叫通话次数")
	private Double d17120350CallCt = null;
	@Label("第1周时长4被叫通话次数")
	private Double d17120350CalledCt = null;
	@Label("第1周时长4通话次数")
	private Double d17120350Ct = null;
	@Label("主叫第1周时区c通话次数")
	private Double d171218CallCt = null;
	@Label("主叫第1周时区c通话平均时长")
	private Double d171218CallLen = null;
	@Label("被叫第1周时区c通话次数")
	private Double d171218CalledCt = null;
	@Label("被叫第1周时区c通话平均时长")
	private Double d171218CalledLen = null;
	@Label("第1周时区c通话次数")
	private Double d171218Ct = null;
	@Label("第1周时区c通话平均时长")
	private Double d171218Len = null;
	@Label("主叫第1周时区d通话次数")
	private Double d171822CallCt = null;
	@Label("主叫第1周时区d通话平均时长")
	private Double d171822CallLen = null;
	@Label("被叫第1周时区d通话次数")
	private Double d171822CalledCt = null;
	@Label("被叫第1周时区d通话平均时长")
	private Double d171822CalledLen = null;
	@Label("第1周时区d通话次数")
	private Double d171822Ct = null;
	@Label("第1周时区d通话平均时长")
	private Double d171822Len = null;
	@Label("主叫第1周时区a通话次数")
	private Double d172207CallCt = null;
	@Label("主叫第1周时区a通话平均时长")
	private Double d172207CallLen = null;
	@Label("被叫第1周时区a通话次数")
	private Double d172207CalledCt = null;
	@Label("被叫第1周时区a通话平均时长")
	private Double d172207CalledLen = null;
	@Label("第1周时区a通话次数")
	private Double d172207Ct = null;
	@Label("第1周时区a通话平均时长")
	private Double d172207Len = null;
	@Label("第1周时长5主叫通话次数")
	private Double d17350CallCt = null;
	@Label("第1周时长5被叫通话次数")
	private Double d17350CalledCt = null;
	@Label("第1周时长5通话次数")
	private Double d17350Ct = null;
	@Label("第1周时长3主叫通话次数")
	private Double d1740120CallCt = null;
	@Label("第1周时长3被叫通话次数")
	private Double d1740120CalledCt = null;
	@Label("第1周时长3通话次数")
	private Double d1740120Ct = null;
	@Label("第1周不同地址数量")
	private Double d17AddrCt = null;
	@Label("第1周主叫通话总时长")
	private Double d17AllCallLen = null;
	@Label("第1周被叫通话总时长")
	private Double d17AllCalledLen = null;
	@Label("第1周通话总时长")
	private Double d17AllLen = null;
	@Label("主叫第1周不同地址数量")
	private Double d17CallAddrCt = null;
	@Label("第1周主叫数量")
	private Double d17CallCt = null;
	@Label("第1周主被叫比值  主叫为0，值为0；被叫为0，值为-1；主叫被叫都为0，值为-2")
	private Double d17CallPer = null;
	@Label("被叫第1周不同地址数量")
	private Double d17CalledAddrCt = null;
	@Label("第1周被叫数量")
	private Double d17CalledCt = null;
	@Label("第1周呼叫数量")
	private Double d17Ct = null;
	@Label("第1周数量排名第1位地址占总呼叫次数比")
	private Double d17Top1AddrPer = null;
	@Label("第1周主叫数量排名第1位地址占总呼叫次数比")
	private Double d17Top1CallAddrPer = null;
	@Label("第1周被叫数量排名第1位地址占总呼叫次数比")
	private Double d17Top1CalledAddrPer = null;
	@Label("第1周数量排名第2位地址占总呼叫次数比")
	private Double d17Top2AddrPer = null;
	@Label("第1周主叫数量排名第2位地址占总呼叫次数比")
	private Double d17Top2CallAddrPer = null;
	@Label("第1周被叫数量排名第2位地址占总呼叫次数比")
	private Double d17Top2CalledAddrPer = null;
	@Label("主叫第4周时区b通话次数")
	private Double d21280712CallCt = null;
	@Label("主叫第4周时区b通话平均时长")
	private Double d21280712CallLen = null;
	@Label("被叫第4周时区b通话次数")
	private Double d21280712CalledCt = null;
	@Label("被叫第4周时区b通话平均时长")
	private Double d21280712CalledLen = null;
	@Label("第4周时区b通话次数")
	private Double d21280712Ct = null;
	@Label("第4周时区b通话平均时长")
	private Double d21280712Len = null;
	@Label("第4周时长1主叫通话次数")
	private Double d2128010CallCt = null;
	@Label("第4周时长1被叫通话次数")
	private Double d2128010CalledCt = null;
	@Label("第4周时长1通话次数")
	private Double d2128010Ct = null;
	@Label("第4周时长2主叫通话次数")
	private Double d21281040CallCt = null;
	@Label("第4周时长2被叫通话次数")
	private Double d21281040CalledCt = null;
	@Label("第4周时长2通话次数")
	private Double d21281040Ct = null;
	@Label("第4周时长4主叫通话次数")
	private Double d2128120350CallCt = null;
	@Label("第4周时长4被叫通话次数")
	private Double d2128120350CalledCt = null;
	@Label("第4周时长4通话次数")
	private Double d2128120350Ct = null;
	@Label("主叫第4周时区c通话次数")
	private Double d21281218CallCt = null;
	@Label("主叫第4周时区c通话平均时长")
	private Double d21281218CallLen = null;
	@Label("被叫第4周时区c通话次数")
	private Double d21281218CalledCt = null;
	@Label("被叫第4周时区c通话平均时长")
	private Double d21281218CalledLen = null;
	@Label("第4周时区c通话次数")
	private Double d21281218Ct = null;
	@Label("第4周时区c通话平均时长")
	private Double d21281218Len = null;
	@Label("主叫第4周时区d通话次数")
	private Double d21281822CallCt = null;
	@Label("主叫第4周时区d通话平均时长")
	private Double d21281822CallLen = null;
	@Label("被叫第4周时区d通话次数")
	private Double d21281822CalledCt = null;
	@Label("被叫第4周时区d通话平均时长")
	private Double d21281822CalledLen = null;
	@Label("第4周时区d通话次数")
	private Double d21281822Ct = null;
	@Label("第4周时区d通话平均时长")
	private Double d21281822Len = null;
	@Label("主叫第4周时区a通话次数")
	private Double d21282207CallCt = null;
	@Label("主叫第4周时区a通话平均时长")
	private Double d21282207CallLen = null;
	@Label("被叫第4周时区a通话次数")
	private Double d21282207CalledCt = null;
	@Label("被叫第4周时区a通话平均时长")
	private Double d21282207CalledLen = null;
	@Label("第4周时区a通话次数")
	private Double d21282207Ct = null;
	@Label("第4周时区a通话平均时长")
	private Double d21282207Len = null;
	@Label("第4周时长5主叫通话次数")
	private Double d2128350CallCt = null;
	@Label("第4周时长5被叫通话次数")
	private Double d2128350CalledCt = null;
	@Label("第4周时长5通话次数")
	private Double d2128350Ct = null;
	@Label("第4周时长3主叫通话次数")
	private Double d212840120CallCt = null;
	@Label("第4周时长3被叫通话次数")
	private Double d212840120CalledCt = null;
	@Label("第4周时长3通话次数")
	private Double d212840120Ct = null;
	@Label("第4周不同地址数量")
	private Double d2128AddrCt = null;
	@Label("第4周主叫通话总时长")
	private Double d2128AllCallLen = null;
	@Label("第4周被叫通话总时长")
	private Double d2128AllCalledLen = null;
	@Label("第4周通话总时长")
	private Double d2128AllLen = null;
	@Label("主叫第4周不同地址数量")
	private Double d2128CallAddrCt = null;
	@Label("第4周主叫数量")
	private Double d2128CallCt = null;
	@Label("第4周主被叫比值  主叫为0，值为0；被叫为0，值为-1；主叫被叫都为0，值为-2")
	private Double d2128CallPer = null;
	@Label("被叫第4周不同地址数量")
	private Double d2128CalledAddrCt = null;
	@Label("第4周被叫数量")
	private Double d2128CalledCt = null;
	@Label("第4周呼叫数量")
	private Double d2128Ct = null;
	@Label("第4周数量排名第1位地址占总呼叫次数比")
	private Double d2128Top1AddrPer = null;
	@Label("第4周主叫数量排名第1位地址占总呼叫次数比")
	private Double d2128Top1CallAddrPer = null;
	@Label("第4周被叫数量排名第1位地址占总呼叫次数比")
	private Double d2128Top1CalledAddrPer = null;
	@Label("第4周数量排名第2位地址占总呼叫次数比")
	private Double d2128Top2AddrPer = null;
	@Label("第4周主叫数量排名第2位地址占总呼叫次数比")
	private Double d2128Top2CallAddrPer = null;
	@Label("第4周被叫数量排名第2位地址占总呼叫次数比")
	private Double d2128Top2CalledAddrPer = null;
	@Label("主叫第2月时区b通话次数")
	private Double d30600712CallCt = null;
	@Label("主叫第2月时区b通话平均时长")
	private Double d30600712CallLen = null;
	@Label("被叫第2月时区b通话次数")
	private Double d30600712CalledCt = null;
	@Label("被叫第2月时区b通话平均时长")
	private Double d30600712CalledLen = null;
	@Label("第2月时区b通话次数")
	private Double d30600712Ct = null;
	@Label("第2月时区b通话平均时长")
	private Double d30600712Len = null;
	@Label("第2月时长1主叫通话次数")
	private Double d3060010CallCt = null;
	@Label("第2月时长1被叫通话次数")
	private Double d3060010CalledCt = null;
	@Label("第2月时长1通话次数")
	private Double d3060010Ct = null;
	@Label("第2月时长2主叫通话次数")
	private Double d30601040CallCt = null;
	@Label("第2月时长2被叫通话次数")
	private Double d30601040CalledCt = null;
	@Label("第2月时长2通话次数")
	private Double d30601040Ct = null;
	@Label("第2月时长4主叫通话次数")
	private Double d3060120350CallCt = null;
	@Label("第2月时长4被叫通话次数")
	private Double d3060120350CalledCt = null;
	@Label("第2月时长4通话次数")
	private Double d3060120350Ct = null;
	@Label("主叫第2月时区c通话次数")
	private Double d30601218CallCt = null;
	@Label("主叫第2月时区c通话平均时长")
	private Double d30601218CallLen = null;
	@Label("被叫第2月时区c通话次数")
	private Double d30601218CalledCt = null;
	@Label("被叫第2月时区c通话平均时长")
	private Double d30601218CalledLen = null;
	@Label("第2月时区c通话次数")
	private Double d30601218Ct = null;
	@Label("第2月时区c通话平均时长")
	private Double d30601218Len = null;
	@Label("主叫第2月时区d通话次数")
	private Double d30601822CallCt = null;
	@Label("主叫第2月时区d通话平均时长")
	private Double d30601822CallLen = null;
	@Label("被叫第2月时区d通话次数")
	private Double d30601822CalledCt = null;
	@Label("被叫第2月时区d通话平均时长")
	private Double d30601822CalledLen = null;
	@Label("第2月时区d通话次数")
	private Double d30601822Ct = null;
	@Label("第2月时区d通话平均时长")
	private Double d30601822Len = null;
	@Label("主叫第2月时区a通话次数")
	private Double d30602207CallCt = null;
	@Label("主叫第2月时区a通话平均时长")
	private Double d30602207CallLen = null;
	@Label("被叫第2月时区a通话次数")
	private Double d30602207CalledCt = null;
	@Label("被叫第2月时区a通话平均时长")
	private Double d30602207CalledLen = null;
	@Label("第2月时区a通话次数")
	private Double d30602207Ct = null;
	@Label("第2月时区a通话平均时长")
	private Double d30602207Len = null;
	@Label("第2月时长5主叫通话次数")
	private Double d3060350CallCt = null;
	@Label("第2月时长5被叫通话次数")
	private Double d3060350CalledCt = null;
	@Label("第2月时长5通话次数")
	private Double d3060350Ct = null;
	@Label("第2月时长3主叫通话次数")
	private Double d306040120CallCt = null;
	@Label("第2月时长3被叫通话次数")
	private Double d306040120CalledCt = null;
	@Label("第2月时长3通话次数")
	private Double d306040120Ct = null;
	@Label("第2月不同地址数量")
	private Double d3060AddrCt = null;
	@Label("第2月主叫通话总时长")
	private Double d3060AllCallLen = null;
	@Label("第2月被叫通话总时长")
	private Double d3060AllCalledLen = null;
	@Label("第2月通话总时长")
	private Double d3060AllLen = null;
	@Label("主叫第2月不同地址数量")
	private Double d3060CallAddrCt = null;
	@Label("被叫第2月不同地址数量")
	private Double d3060CalledAddrCt = null;
	@Label("主叫第2周时区b通话次数")
	private Double d7140712CallCt = null;
	@Label("主叫第2周时区b通话平均时长")
	private Double d7140712CallLen = null;
	@Label("被叫第2周时区b通话次数")
	private Double d7140712CalledCt = null;
	@Label("被叫第2周时区b通话平均时长")
	private Double d7140712CalledLen = null;
	@Label("第2周时区b通话次数")
	private Double d7140712Ct = null;
	@Label("第2周时区b通话平均时长")
	private Double d7140712Len = null;
	@Label("第2周时长1主叫通话次数")
	private Double d714010CallCt = null;
	@Label("第2周时长1被叫通话次数")
	private Double d714010CalledCt = null;
	@Label("第2周时长1通话次数")
	private Double d714010Ct = null;
	@Label("第2周时长2主叫通话次数")
	private Double d7141040CallCt = null;
	@Label("第2周时长2被叫通话次数")
	private Double d7141040CalledCt = null;
	@Label("第2周时长2通话次数")
	private Double d7141040Ct = null;
	@Label("第2周时长4主叫通话次数")
	private Double d714120350CallCt = null;
	@Label("第2周时长4被叫通话次数")
	private Double d714120350CalledCt = null;
	@Label("第2周时长4通话次数")
	private Double d714120350Ct = null;
	@Label("主叫第2周时区c通话次数")
	private Double d7141218CallCt = null;
	@Label("主叫第2周时区c通话平均时长")
	private Double d7141218CallLen = null;
	@Label("被叫第2周时区c通话次数")
	private Double d7141218CalledCt = null;
	@Label("被叫第2周时区c通话平均时长")
	private Double d7141218CalledLen = null;
	@Label("第2周时区c通话次数")
	private Double d7141218Ct = null;
	@Label("第2周时区c通话平均时长")
	private Double d7141218Len = null;
	@Label("主叫第2周时区d通话次数")
	private Double d7141822CallCt = null;
	@Label("主叫第2周时区d通话平均时长")
	private Double d7141822CallLen = null;
	@Label("被叫第2周时区d通话次数")
	private Double d7141822CalledCt = null;
	@Label("被叫第2周时区d通话平均时长")
	private Double d7141822CalledLen = null;
	@Label("第2周时区d通话次数")
	private Double d7141822Ct = null;
	@Label("第2周时区d通话平均时长")
	private Double d7141822Len = null;
	@Label("主叫第2周时区a通话次数")
	private Double d7142207CallCt = null;
	@Label("主叫第2周时区a通话平均时长")
	private Double d7142207CallLen = null;
	@Label("被叫第2周时区a通话次数")
	private Double d7142207CalledCt = null;
	@Label("被叫第2周时区a通话平均时长")
	private Double d7142207CalledLen = null;
	@Label("第2周时区a通话次数")
	private Double d7142207Ct = null;
	@Label("第2周时区a通话平均时长")
	private Double d7142207Len = null;
	@Label("第2周时长5主叫通话次数")
	private Double d714350CallCt = null;
	@Label("第2周时长5被叫通话次数")
	private Double d714350CalledCt = null;
	@Label("第2周时长5通话次数")
	private Double d714350Ct = null;
	@Label("第2周时长3主叫通话次数")
	private Double d71440120CallCt = null;
	@Label("第2周时长3被叫通话次数")
	private Double d71440120CalledCt = null;
	@Label("第2周时长3通话次数")
	private Double d71440120Ct = null;
	@Label("第2周不同地址数量")
	private Double d714AddrCt = null;
	@Label("第2周主叫通话总时长")
	private Double d714AllCallLen = null;
	@Label("第2周被叫通话总时长")
	private Double d714AllCalledLen = null;
	@Label("第2周通话总时长")
	private Double d714AllLen = null;
	@Label("主叫第2周不同地址数量")
	private Double d714CallAddrCt = null;
	@Label("第2周主叫数量")
	private Double d714CallCt = null;
	@Label("第2周主被叫比值  主叫为0，值为0；被叫为0，值为-1；主叫被叫都为0，值为-2")
	private Double d714CallPer = null;
	@Label("被叫第2周不同地址数量")
	private Double d714CalledAddrCt = null;
	@Label("第2周被叫数量")
	private Double d714CalledCt = null;
	@Label("第2周呼叫数量")
	private Double d714Ct = null;
	@Label("第2周数量排名第1位地址占总呼叫次数比")
	private Double d714Top1AddrPer = null;
	@Label("第2周主叫数量排名第1位地址占总呼叫次数比")
	private Double d714Top1CallAddrPer = null;
	@Label("第2周被叫数量排名第1位地址占总呼叫次数比")
	private Double d714Top1CalledAddrPer = null;
	@Label("第2周数量排名第2位地址占总呼叫次数比")
	private Double d714Top2AddrPer = null;
	@Label("第2周主叫数量排名第2位地址占总呼叫次数比")
	private Double d714Top2CallAddrPer = null;
	@Label("第2周被叫数量排名第2位地址占总呼叫次数比")
	private Double d714Top2CalledAddrPer = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("第1月combocost")
	private Double m1Combo = null;
	@Label("第1月comb/sum")
	private Double m1ComboDevideSum = null;
	@Label("第1月comb-sum")
	private Double m1ComboMinusSum = null;
	@Label("第1月sumcost")
	private Double m1Sum = null;
	@Label("第2月combocost")
	private Double m2Combo = null;
	@Label("第2月comb/sum")
	private Double m2ComboDevideSum = null;
	@Label("第2月comb-sum")
	private Double m2ComboMinusSum = null;
	@Label("第2月sumcost")
	private Double m2Sum = null;
	@Label("第3月combocost")
	private Double m3Combo = null;
	@Label("第3月comb/sum")
	private Double m3ComboDevideSum = null;
	@Label("第3月comb-sum")
	private Double m3ComboMinusSum = null;
	@Label("第3月sumcost")
	private Double m3Sum = null;
	@Label("第4月combocost")
	private Double m4Combo = null;
	@Label("第4月comb/sum")
	private Double m4ComboDevideSum = null;
	@Label("第4月comb-sum")
	private Double m4ComboMinusSum = null;
	@Label("第4月sumcost")
	private Double m4Sum = null;
	@Label("第5月combocost")
	private Double m5Combo = null;
	@Label("第5月comb/sum")
	private Double m5ComboDevideSum = null;
	@Label("第5月comb-sum")
	private Double m5ComboMinusSum = null;
	@Label("第5月sumcost")
	private Double m5Sum = null;
	@Label("第6月combocost")
	private Double m6Combo = null;
	@Label("第6月comb/sum")
	private Double m6ComboDevideSum = null;
	@Label("第6月comb-sum")
	private Double m6ComboMinusSum = null;
	@Label("第6月sumcost")
	private Double m6Sum = null;
	@Label("主叫每周时区b通话次数")
	private Double mean0712CallCt = null;
	@Label("主叫每周时区b通话平均时长")
	private Double mean0712CallLen = null;
	@Label("被叫每周时区b通话次数")
	private Double mean0712CalledCt = null;
	@Label("被叫每周时区b通话平均时长")
	private Double mean0712CalledLen = null;
	@Label("平均每周时区b通话次数")
	private Double mean0712Ct = null;
	@Label("平均每周时区b通话平均时长")
	private Double mean0712Len = null;
	@Label("平均每周时长1主叫通话次数")
	private Double mean010CallCt = null;
	@Label("平均每周时长1被叫通话次数")
	private Double mean010CalledCt = null;
	@Label("平均每周时长1通话次数")
	private Double mean010Ct = null;
	@Label("平均每周时长2主叫通话次数")
	private Double mean1040CallCt = null;
	@Label("平均每周时长2被叫通话次数")
	private Double mean1040CalledCt = null;
	@Label("平均每周时长2通话次数")
	private Double mean1040Ct = null;
	@Label("平均每周时长4主叫通话次数")
	private Double mean120350CallCt = null;
	@Label("平均每周时长4被叫通话次数")
	private Double mean120350CalledCt = null;
	@Label("平均每周时长4通话次数")
	private Double mean120350Ct = null;
	@Label("主叫每周时区c通话次数")
	private Double mean1218CallCt = null;
	@Label("主叫每周时区c通话平均时长")
	private Double mean1218CallLen = null;
	@Label("被叫每周时区c通话次数")
	private Double mean1218CalledCt = null;
	@Label("被叫每周时区c通话平均时长")
	private Double mean1218CalledLen = null;
	@Label("平均每周时区c通话次数")
	private Double mean1218Ct = null;
	@Label("平均每周时区c通话平均时长")
	private Double mean1218Len = null;
	@Label("主叫每周时区d通话次数")
	private Double mean1822CallCt = null;
	@Label("主叫每周时区d通话平均时长")
	private Double mean1822CallLen = null;
	@Label("被叫每周时区d通话次数")
	private Double mean1822CalledCt = null;
	@Label("被叫每周时区d通话平均时长")
	private Double mean1822CalledLen = null;
	@Label("平均每周时区d通话次数")
	private Double mean1822Ct = null;
	@Label("平均每周时区d通话平均时长")
	private Double mean1822Len = null;
	@Label("主叫每周时区a通话次数")
	private Double mean2207CallCt = null;
	@Label("主叫每周时区a通话平均时长")
	private Double mean2207CallLen = null;
	@Label("被叫每周时区a通话次数")
	private Double mean2207CalledCt = null;
	@Label("被叫每周时区a通话平均时长")
	private Double mean2207CalledLen = null;
	@Label("平均每周时区a通话次数")
	private Double mean2207Ct = null;
	@Label("平均每周时区a通话平均时长")
	private Double mean2207Len = null;
	@Label("平均每周时长5主叫通话次数")
	private Double mean350CallCt = null;
	@Label("平均每周时长5被叫通话次数")
	private Double mean350CalledCt = null;
	@Label("平均每周时长5通话次数")
	private Double mean350Ct = null;
	@Label("平均每周时长3主叫通话次数")
	private Double mean40120CallCt = null;
	@Label("平均每周时长3被叫通话次数")
	private Double mean40120CalledCt = null;
	@Label("平均每周时长3通话次数")
	private Double mean40120Ct = null;
	@Label("平均每周不同地址数量")
	private Double meanAddrCt = null;
	@Label("平均每周主叫通话总时长")
	private Double meanAllCallLen = null;
	@Label("平均每周被叫通话总时长")
	private Double meanAllCalledLen = null;
	@Label("平均每周通话总时长")
	private Double meanAllLen = null;
	@Label("平均每周主叫不同地址数量")
	private Double meanCallAddrCt = null;
	@Label("平均每周主叫数量")
	private Double meanCallCt = null;
	@Label("平均每周主被叫比值")
	private Double meanCallPer = null;
	@Label("平均每周被叫不同地址数量")
	private Double meanCalledAddrCt = null;
	@Label("平均每周被叫数量")
	private Double meanCalledCt = null;
	@Label("平均")
	private Double meanTop1AddrPer = null;
	@Label("平均")
	private Double meanTop1CallAddrPer = null;
	@Label("平均")
	private Double meanTop1CalledAddrPer = null;
	@Label("平均")
	private Double meanTop2AddrPer = null;
	@Label("平均")
	private Double meanTop2CallAddrPer = null;
	@Label("平均")
	private Double meanTop2CalledAddrPer = null;
	@Label("借款单号")
	private Integer serialId = null;
	@Label("Default_user_id_Comment")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Double getD14210712CallCt()
	{
		return this.d14210712CallCt;
	}
	public void setD14210712CallCt(Double d14210712CallCt)
	{
		this.d14210712CallCt = d14210712CallCt;
	}
	public Double getD14210712CallLen()
	{
		return this.d14210712CallLen;
	}
	public void setD14210712CallLen(Double d14210712CallLen)
	{
		this.d14210712CallLen = d14210712CallLen;
	}
	public Double getD14210712CalledCt()
	{
		return this.d14210712CalledCt;
	}
	public void setD14210712CalledCt(Double d14210712CalledCt)
	{
		this.d14210712CalledCt = d14210712CalledCt;
	}
	public Double getD14210712CalledLen()
	{
		return this.d14210712CalledLen;
	}
	public void setD14210712CalledLen(Double d14210712CalledLen)
	{
		this.d14210712CalledLen = d14210712CalledLen;
	}
	public Double getD14210712Ct()
	{
		return this.d14210712Ct;
	}
	public void setD14210712Ct(Double d14210712Ct)
	{
		this.d14210712Ct = d14210712Ct;
	}
	public Double getD14210712Len()
	{
		return this.d14210712Len;
	}
	public void setD14210712Len(Double d14210712Len)
	{
		this.d14210712Len = d14210712Len;
	}
	public Double getD1421010CallCt()
	{
		return this.d1421010CallCt;
	}
	public void setD1421010CallCt(Double d1421010CallCt)
	{
		this.d1421010CallCt = d1421010CallCt;
	}
	public Double getD1421010CalledCt()
	{
		return this.d1421010CalledCt;
	}
	public void setD1421010CalledCt(Double d1421010CalledCt)
	{
		this.d1421010CalledCt = d1421010CalledCt;
	}
	public Double getD1421010Ct()
	{
		return this.d1421010Ct;
	}
	public void setD1421010Ct(Double d1421010Ct)
	{
		this.d1421010Ct = d1421010Ct;
	}
	public Double getD14211040CallCt()
	{
		return this.d14211040CallCt;
	}
	public void setD14211040CallCt(Double d14211040CallCt)
	{
		this.d14211040CallCt = d14211040CallCt;
	}
	public Double getD14211040CalledCt()
	{
		return this.d14211040CalledCt;
	}
	public void setD14211040CalledCt(Double d14211040CalledCt)
	{
		this.d14211040CalledCt = d14211040CalledCt;
	}
	public Double getD14211040Ct()
	{
		return this.d14211040Ct;
	}
	public void setD14211040Ct(Double d14211040Ct)
	{
		this.d14211040Ct = d14211040Ct;
	}
	public Double getD1421120350CallCt()
	{
		return this.d1421120350CallCt;
	}
	public void setD1421120350CallCt(Double d1421120350CallCt)
	{
		this.d1421120350CallCt = d1421120350CallCt;
	}
	public Double getD1421120350CalledCt()
	{
		return this.d1421120350CalledCt;
	}
	public void setD1421120350CalledCt(Double d1421120350CalledCt)
	{
		this.d1421120350CalledCt = d1421120350CalledCt;
	}
	public Double getD1421120350Ct()
	{
		return this.d1421120350Ct;
	}
	public void setD1421120350Ct(Double d1421120350Ct)
	{
		this.d1421120350Ct = d1421120350Ct;
	}
	public Double getD14211218CallCt()
	{
		return this.d14211218CallCt;
	}
	public void setD14211218CallCt(Double d14211218CallCt)
	{
		this.d14211218CallCt = d14211218CallCt;
	}
	public Double getD14211218CallLen()
	{
		return this.d14211218CallLen;
	}
	public void setD14211218CallLen(Double d14211218CallLen)
	{
		this.d14211218CallLen = d14211218CallLen;
	}
	public Double getD14211218CalledCt()
	{
		return this.d14211218CalledCt;
	}
	public void setD14211218CalledCt(Double d14211218CalledCt)
	{
		this.d14211218CalledCt = d14211218CalledCt;
	}
	public Double getD14211218CalledLen()
	{
		return this.d14211218CalledLen;
	}
	public void setD14211218CalledLen(Double d14211218CalledLen)
	{
		this.d14211218CalledLen = d14211218CalledLen;
	}
	public Double getD14211218Ct()
	{
		return this.d14211218Ct;
	}
	public void setD14211218Ct(Double d14211218Ct)
	{
		this.d14211218Ct = d14211218Ct;
	}
	public Double getD14211218Len()
	{
		return this.d14211218Len;
	}
	public void setD14211218Len(Double d14211218Len)
	{
		this.d14211218Len = d14211218Len;
	}
	public Double getD14211822CallCt()
	{
		return this.d14211822CallCt;
	}
	public void setD14211822CallCt(Double d14211822CallCt)
	{
		this.d14211822CallCt = d14211822CallCt;
	}
	public Double getD14211822CallLen()
	{
		return this.d14211822CallLen;
	}
	public void setD14211822CallLen(Double d14211822CallLen)
	{
		this.d14211822CallLen = d14211822CallLen;
	}
	public Double getD14211822CalledCt()
	{
		return this.d14211822CalledCt;
	}
	public void setD14211822CalledCt(Double d14211822CalledCt)
	{
		this.d14211822CalledCt = d14211822CalledCt;
	}
	public Double getD14211822CalledLen()
	{
		return this.d14211822CalledLen;
	}
	public void setD14211822CalledLen(Double d14211822CalledLen)
	{
		this.d14211822CalledLen = d14211822CalledLen;
	}
	public Double getD14211822Ct()
	{
		return this.d14211822Ct;
	}
	public void setD14211822Ct(Double d14211822Ct)
	{
		this.d14211822Ct = d14211822Ct;
	}
	public Double getD14211822Len()
	{
		return this.d14211822Len;
	}
	public void setD14211822Len(Double d14211822Len)
	{
		this.d14211822Len = d14211822Len;
	}
	public Double getD14212207CallCt()
	{
		return this.d14212207CallCt;
	}
	public void setD14212207CallCt(Double d14212207CallCt)
	{
		this.d14212207CallCt = d14212207CallCt;
	}
	public Double getD14212207CallLen()
	{
		return this.d14212207CallLen;
	}
	public void setD14212207CallLen(Double d14212207CallLen)
	{
		this.d14212207CallLen = d14212207CallLen;
	}
	public Double getD14212207CalledCt()
	{
		return this.d14212207CalledCt;
	}
	public void setD14212207CalledCt(Double d14212207CalledCt)
	{
		this.d14212207CalledCt = d14212207CalledCt;
	}
	public Double getD14212207CalledLen()
	{
		return this.d14212207CalledLen;
	}
	public void setD14212207CalledLen(Double d14212207CalledLen)
	{
		this.d14212207CalledLen = d14212207CalledLen;
	}
	public Double getD14212207Ct()
	{
		return this.d14212207Ct;
	}
	public void setD14212207Ct(Double d14212207Ct)
	{
		this.d14212207Ct = d14212207Ct;
	}
	public Double getD14212207Len()
	{
		return this.d14212207Len;
	}
	public void setD14212207Len(Double d14212207Len)
	{
		this.d14212207Len = d14212207Len;
	}
	public Double getD1421350CallCt()
	{
		return this.d1421350CallCt;
	}
	public void setD1421350CallCt(Double d1421350CallCt)
	{
		this.d1421350CallCt = d1421350CallCt;
	}
	public Double getD1421350CalledCt()
	{
		return this.d1421350CalledCt;
	}
	public void setD1421350CalledCt(Double d1421350CalledCt)
	{
		this.d1421350CalledCt = d1421350CalledCt;
	}
	public Double getD1421350Ct()
	{
		return this.d1421350Ct;
	}
	public void setD1421350Ct(Double d1421350Ct)
	{
		this.d1421350Ct = d1421350Ct;
	}
	public Double getD142140120CallCt()
	{
		return this.d142140120CallCt;
	}
	public void setD142140120CallCt(Double d142140120CallCt)
	{
		this.d142140120CallCt = d142140120CallCt;
	}
	public Double getD142140120CalledCt()
	{
		return this.d142140120CalledCt;
	}
	public void setD142140120CalledCt(Double d142140120CalledCt)
	{
		this.d142140120CalledCt = d142140120CalledCt;
	}
	public Double getD142140120Ct()
	{
		return this.d142140120Ct;
	}
	public void setD142140120Ct(Double d142140120Ct)
	{
		this.d142140120Ct = d142140120Ct;
	}
	public Double getD1421AddrCt()
	{
		return this.d1421AddrCt;
	}
	public void setD1421AddrCt(Double d1421AddrCt)
	{
		this.d1421AddrCt = d1421AddrCt;
	}
	public Double getD1421AllCallLen()
	{
		return this.d1421AllCallLen;
	}
	public void setD1421AllCallLen(Double d1421AllCallLen)
	{
		this.d1421AllCallLen = d1421AllCallLen;
	}
	public Double getD1421AllCalledLen()
	{
		return this.d1421AllCalledLen;
	}
	public void setD1421AllCalledLen(Double d1421AllCalledLen)
	{
		this.d1421AllCalledLen = d1421AllCalledLen;
	}
	public Double getD1421AllLen()
	{
		return this.d1421AllLen;
	}
	public void setD1421AllLen(Double d1421AllLen)
	{
		this.d1421AllLen = d1421AllLen;
	}
	public Double getD1421CallAddrCt()
	{
		return this.d1421CallAddrCt;
	}
	public void setD1421CallAddrCt(Double d1421CallAddrCt)
	{
		this.d1421CallAddrCt = d1421CallAddrCt;
	}
	public Double getD1421CallCt()
	{
		return this.d1421CallCt;
	}
	public void setD1421CallCt(Double d1421CallCt)
	{
		this.d1421CallCt = d1421CallCt;
	}
	public Double getD1421CallPer()
	{
		return this.d1421CallPer;
	}
	public void setD1421CallPer(Double d1421CallPer)
	{
		this.d1421CallPer = d1421CallPer;
	}
	public Double getD1421CalledAddrCt()
	{
		return this.d1421CalledAddrCt;
	}
	public void setD1421CalledAddrCt(Double d1421CalledAddrCt)
	{
		this.d1421CalledAddrCt = d1421CalledAddrCt;
	}
	public Double getD1421CalledCt()
	{
		return this.d1421CalledCt;
	}
	public void setD1421CalledCt(Double d1421CalledCt)
	{
		this.d1421CalledCt = d1421CalledCt;
	}
	public Double getD1421Ct()
	{
		return this.d1421Ct;
	}
	public void setD1421Ct(Double d1421Ct)
	{
		this.d1421Ct = d1421Ct;
	}
	public Double getD1421Top1AddrPer()
	{
		return this.d1421Top1AddrPer;
	}
	public void setD1421Top1AddrPer(Double d1421Top1AddrPer)
	{
		this.d1421Top1AddrPer = d1421Top1AddrPer;
	}
	public Double getD1421Top1CallAddrPer()
	{
		return this.d1421Top1CallAddrPer;
	}
	public void setD1421Top1CallAddrPer(Double d1421Top1CallAddrPer)
	{
		this.d1421Top1CallAddrPer = d1421Top1CallAddrPer;
	}
	public Double getD1421Top1CalledAddrPer()
	{
		return this.d1421Top1CalledAddrPer;
	}
	public void setD1421Top1CalledAddrPer(Double d1421Top1CalledAddrPer)
	{
		this.d1421Top1CalledAddrPer = d1421Top1CalledAddrPer;
	}
	public Double getD1421Top2AddrPer()
	{
		return this.d1421Top2AddrPer;
	}
	public void setD1421Top2AddrPer(Double d1421Top2AddrPer)
	{
		this.d1421Top2AddrPer = d1421Top2AddrPer;
	}
	public Double getD1421Top2CallAddrPer()
	{
		return this.d1421Top2CallAddrPer;
	}
	public void setD1421Top2CallAddrPer(Double d1421Top2CallAddrPer)
	{
		this.d1421Top2CallAddrPer = d1421Top2CallAddrPer;
	}
	public Double getD1421Top2CalledAddrPer()
	{
		return this.d1421Top2CalledAddrPer;
	}
	public void setD1421Top2CalledAddrPer(Double d1421Top2CalledAddrPer)
	{
		this.d1421Top2CalledAddrPer = d1421Top2CalledAddrPer;
	}
	public Double getD1300712CallCt()
	{
		return this.d1300712CallCt;
	}
	public void setD1300712CallCt(Double d1300712CallCt)
	{
		this.d1300712CallCt = d1300712CallCt;
	}
	public Double getD1300712CallLen()
	{
		return this.d1300712CallLen;
	}
	public void setD1300712CallLen(Double d1300712CallLen)
	{
		this.d1300712CallLen = d1300712CallLen;
	}
	public Double getD1300712CalledCt()
	{
		return this.d1300712CalledCt;
	}
	public void setD1300712CalledCt(Double d1300712CalledCt)
	{
		this.d1300712CalledCt = d1300712CalledCt;
	}
	public Double getD1300712CalledLen()
	{
		return this.d1300712CalledLen;
	}
	public void setD1300712CalledLen(Double d1300712CalledLen)
	{
		this.d1300712CalledLen = d1300712CalledLen;
	}
	public Double getD1300712Ct()
	{
		return this.d1300712Ct;
	}
	public void setD1300712Ct(Double d1300712Ct)
	{
		this.d1300712Ct = d1300712Ct;
	}
	public Double getD1300712Len()
	{
		return this.d1300712Len;
	}
	public void setD1300712Len(Double d1300712Len)
	{
		this.d1300712Len = d1300712Len;
	}
	public Double getD130010CallCt()
	{
		return this.d130010CallCt;
	}
	public void setD130010CallCt(Double d130010CallCt)
	{
		this.d130010CallCt = d130010CallCt;
	}
	public Double getD130010CalledCt()
	{
		return this.d130010CalledCt;
	}
	public void setD130010CalledCt(Double d130010CalledCt)
	{
		this.d130010CalledCt = d130010CalledCt;
	}
	public Double getD130010Ct()
	{
		return this.d130010Ct;
	}
	public void setD130010Ct(Double d130010Ct)
	{
		this.d130010Ct = d130010Ct;
	}
	public Double getD1301040CallCt()
	{
		return this.d1301040CallCt;
	}
	public void setD1301040CallCt(Double d1301040CallCt)
	{
		this.d1301040CallCt = d1301040CallCt;
	}
	public Double getD1301040CalledCt()
	{
		return this.d1301040CalledCt;
	}
	public void setD1301040CalledCt(Double d1301040CalledCt)
	{
		this.d1301040CalledCt = d1301040CalledCt;
	}
	public Double getD1301040Ct()
	{
		return this.d1301040Ct;
	}
	public void setD1301040Ct(Double d1301040Ct)
	{
		this.d1301040Ct = d1301040Ct;
	}
	public Double getD130120350CallCt()
	{
		return this.d130120350CallCt;
	}
	public void setD130120350CallCt(Double d130120350CallCt)
	{
		this.d130120350CallCt = d130120350CallCt;
	}
	public Double getD130120350CalledCt()
	{
		return this.d130120350CalledCt;
	}
	public void setD130120350CalledCt(Double d130120350CalledCt)
	{
		this.d130120350CalledCt = d130120350CalledCt;
	}
	public Double getD130120350Ct()
	{
		return this.d130120350Ct;
	}
	public void setD130120350Ct(Double d130120350Ct)
	{
		this.d130120350Ct = d130120350Ct;
	}
	public Double getD1301218CallCt()
	{
		return this.d1301218CallCt;
	}
	public void setD1301218CallCt(Double d1301218CallCt)
	{
		this.d1301218CallCt = d1301218CallCt;
	}
	public Double getD1301218CallLen()
	{
		return this.d1301218CallLen;
	}
	public void setD1301218CallLen(Double d1301218CallLen)
	{
		this.d1301218CallLen = d1301218CallLen;
	}
	public Double getD1301218CalledCt()
	{
		return this.d1301218CalledCt;
	}
	public void setD1301218CalledCt(Double d1301218CalledCt)
	{
		this.d1301218CalledCt = d1301218CalledCt;
	}
	public Double getD1301218CalledLen()
	{
		return this.d1301218CalledLen;
	}
	public void setD1301218CalledLen(Double d1301218CalledLen)
	{
		this.d1301218CalledLen = d1301218CalledLen;
	}
	public Double getD1301218Ct()
	{
		return this.d1301218Ct;
	}
	public void setD1301218Ct(Double d1301218Ct)
	{
		this.d1301218Ct = d1301218Ct;
	}
	public Double getD1301218Len()
	{
		return this.d1301218Len;
	}
	public void setD1301218Len(Double d1301218Len)
	{
		this.d1301218Len = d1301218Len;
	}
	public Double getD1301822CallCt()
	{
		return this.d1301822CallCt;
	}
	public void setD1301822CallCt(Double d1301822CallCt)
	{
		this.d1301822CallCt = d1301822CallCt;
	}
	public Double getD1301822CallLen()
	{
		return this.d1301822CallLen;
	}
	public void setD1301822CallLen(Double d1301822CallLen)
	{
		this.d1301822CallLen = d1301822CallLen;
	}
	public Double getD1301822CalledCt()
	{
		return this.d1301822CalledCt;
	}
	public void setD1301822CalledCt(Double d1301822CalledCt)
	{
		this.d1301822CalledCt = d1301822CalledCt;
	}
	public Double getD1301822CalledLen()
	{
		return this.d1301822CalledLen;
	}
	public void setD1301822CalledLen(Double d1301822CalledLen)
	{
		this.d1301822CalledLen = d1301822CalledLen;
	}
	public Double getD1301822Ct()
	{
		return this.d1301822Ct;
	}
	public void setD1301822Ct(Double d1301822Ct)
	{
		this.d1301822Ct = d1301822Ct;
	}
	public Double getD1301822Len()
	{
		return this.d1301822Len;
	}
	public void setD1301822Len(Double d1301822Len)
	{
		this.d1301822Len = d1301822Len;
	}
	public Double getD1302207CallCt()
	{
		return this.d1302207CallCt;
	}
	public void setD1302207CallCt(Double d1302207CallCt)
	{
		this.d1302207CallCt = d1302207CallCt;
	}
	public Double getD1302207CallLen()
	{
		return this.d1302207CallLen;
	}
	public void setD1302207CallLen(Double d1302207CallLen)
	{
		this.d1302207CallLen = d1302207CallLen;
	}
	public Double getD1302207CalledCt()
	{
		return this.d1302207CalledCt;
	}
	public void setD1302207CalledCt(Double d1302207CalledCt)
	{
		this.d1302207CalledCt = d1302207CalledCt;
	}
	public Double getD1302207CalledLen()
	{
		return this.d1302207CalledLen;
	}
	public void setD1302207CalledLen(Double d1302207CalledLen)
	{
		this.d1302207CalledLen = d1302207CalledLen;
	}
	public Double getD1302207Ct()
	{
		return this.d1302207Ct;
	}
	public void setD1302207Ct(Double d1302207Ct)
	{
		this.d1302207Ct = d1302207Ct;
	}
	public Double getD1302207Len()
	{
		return this.d1302207Len;
	}
	public void setD1302207Len(Double d1302207Len)
	{
		this.d1302207Len = d1302207Len;
	}
	public Double getD130350CallCt()
	{
		return this.d130350CallCt;
	}
	public void setD130350CallCt(Double d130350CallCt)
	{
		this.d130350CallCt = d130350CallCt;
	}
	public Double getD130350CalledCt()
	{
		return this.d130350CalledCt;
	}
	public void setD130350CalledCt(Double d130350CalledCt)
	{
		this.d130350CalledCt = d130350CalledCt;
	}
	public Double getD130350Ct()
	{
		return this.d130350Ct;
	}
	public void setD130350Ct(Double d130350Ct)
	{
		this.d130350Ct = d130350Ct;
	}
	public Double getD13040120CallCt()
	{
		return this.d13040120CallCt;
	}
	public void setD13040120CallCt(Double d13040120CallCt)
	{
		this.d13040120CallCt = d13040120CallCt;
	}
	public Double getD13040120CalledCt()
	{
		return this.d13040120CalledCt;
	}
	public void setD13040120CalledCt(Double d13040120CalledCt)
	{
		this.d13040120CalledCt = d13040120CalledCt;
	}
	public Double getD13040120Ct()
	{
		return this.d13040120Ct;
	}
	public void setD13040120Ct(Double d13040120Ct)
	{
		this.d13040120Ct = d13040120Ct;
	}
	public Double getD130AddrCt()
	{
		return this.d130AddrCt;
	}
	public void setD130AddrCt(Double d130AddrCt)
	{
		this.d130AddrCt = d130AddrCt;
	}
	public Double getD130AllCallLen()
	{
		return this.d130AllCallLen;
	}
	public void setD130AllCallLen(Double d130AllCallLen)
	{
		this.d130AllCallLen = d130AllCallLen;
	}
	public Double getD130AllCalledLen()
	{
		return this.d130AllCalledLen;
	}
	public void setD130AllCalledLen(Double d130AllCalledLen)
	{
		this.d130AllCalledLen = d130AllCalledLen;
	}
	public Double getD130AllLen()
	{
		return this.d130AllLen;
	}
	public void setD130AllLen(Double d130AllLen)
	{
		this.d130AllLen = d130AllLen;
	}
	public Double getD130CallAddrCt()
	{
		return this.d130CallAddrCt;
	}
	public void setD130CallAddrCt(Double d130CallAddrCt)
	{
		this.d130CallAddrCt = d130CallAddrCt;
	}
	public Double getD130CalledAddrCt()
	{
		return this.d130CalledAddrCt;
	}
	public void setD130CalledAddrCt(Double d130CalledAddrCt)
	{
		this.d130CalledAddrCt = d130CalledAddrCt;
	}
	public Double getD170712CallCt()
	{
		return this.d170712CallCt;
	}
	public void setD170712CallCt(Double d170712CallCt)
	{
		this.d170712CallCt = d170712CallCt;
	}
	public Double getD170712CallLen()
	{
		return this.d170712CallLen;
	}
	public void setD170712CallLen(Double d170712CallLen)
	{
		this.d170712CallLen = d170712CallLen;
	}
	public Double getD170712CalledCt()
	{
		return this.d170712CalledCt;
	}
	public void setD170712CalledCt(Double d170712CalledCt)
	{
		this.d170712CalledCt = d170712CalledCt;
	}
	public Double getD170712CalledLen()
	{
		return this.d170712CalledLen;
	}
	public void setD170712CalledLen(Double d170712CalledLen)
	{
		this.d170712CalledLen = d170712CalledLen;
	}
	public Double getD170712Ct()
	{
		return this.d170712Ct;
	}
	public void setD170712Ct(Double d170712Ct)
	{
		this.d170712Ct = d170712Ct;
	}
	public Double getD170712Len()
	{
		return this.d170712Len;
	}
	public void setD170712Len(Double d170712Len)
	{
		this.d170712Len = d170712Len;
	}
	public Double getD17010CallCt()
	{
		return this.d17010CallCt;
	}
	public void setD17010CallCt(Double d17010CallCt)
	{
		this.d17010CallCt = d17010CallCt;
	}
	public Double getD17010CalledCt()
	{
		return this.d17010CalledCt;
	}
	public void setD17010CalledCt(Double d17010CalledCt)
	{
		this.d17010CalledCt = d17010CalledCt;
	}
	public Double getD17010Ct()
	{
		return this.d17010Ct;
	}
	public void setD17010Ct(Double d17010Ct)
	{
		this.d17010Ct = d17010Ct;
	}
	public Double getD171040CallCt()
	{
		return this.d171040CallCt;
	}
	public void setD171040CallCt(Double d171040CallCt)
	{
		this.d171040CallCt = d171040CallCt;
	}
	public Double getD171040CalledCt()
	{
		return this.d171040CalledCt;
	}
	public void setD171040CalledCt(Double d171040CalledCt)
	{
		this.d171040CalledCt = d171040CalledCt;
	}
	public Double getD171040Ct()
	{
		return this.d171040Ct;
	}
	public void setD171040Ct(Double d171040Ct)
	{
		this.d171040Ct = d171040Ct;
	}
	public Double getD17120350CallCt()
	{
		return this.d17120350CallCt;
	}
	public void setD17120350CallCt(Double d17120350CallCt)
	{
		this.d17120350CallCt = d17120350CallCt;
	}
	public Double getD17120350CalledCt()
	{
		return this.d17120350CalledCt;
	}
	public void setD17120350CalledCt(Double d17120350CalledCt)
	{
		this.d17120350CalledCt = d17120350CalledCt;
	}
	public Double getD17120350Ct()
	{
		return this.d17120350Ct;
	}
	public void setD17120350Ct(Double d17120350Ct)
	{
		this.d17120350Ct = d17120350Ct;
	}
	public Double getD171218CallCt()
	{
		return this.d171218CallCt;
	}
	public void setD171218CallCt(Double d171218CallCt)
	{
		this.d171218CallCt = d171218CallCt;
	}
	public Double getD171218CallLen()
	{
		return this.d171218CallLen;
	}
	public void setD171218CallLen(Double d171218CallLen)
	{
		this.d171218CallLen = d171218CallLen;
	}
	public Double getD171218CalledCt()
	{
		return this.d171218CalledCt;
	}
	public void setD171218CalledCt(Double d171218CalledCt)
	{
		this.d171218CalledCt = d171218CalledCt;
	}
	public Double getD171218CalledLen()
	{
		return this.d171218CalledLen;
	}
	public void setD171218CalledLen(Double d171218CalledLen)
	{
		this.d171218CalledLen = d171218CalledLen;
	}
	public Double getD171218Ct()
	{
		return this.d171218Ct;
	}
	public void setD171218Ct(Double d171218Ct)
	{
		this.d171218Ct = d171218Ct;
	}
	public Double getD171218Len()
	{
		return this.d171218Len;
	}
	public void setD171218Len(Double d171218Len)
	{
		this.d171218Len = d171218Len;
	}
	public Double getD171822CallCt()
	{
		return this.d171822CallCt;
	}
	public void setD171822CallCt(Double d171822CallCt)
	{
		this.d171822CallCt = d171822CallCt;
	}
	public Double getD171822CallLen()
	{
		return this.d171822CallLen;
	}
	public void setD171822CallLen(Double d171822CallLen)
	{
		this.d171822CallLen = d171822CallLen;
	}
	public Double getD171822CalledCt()
	{
		return this.d171822CalledCt;
	}
	public void setD171822CalledCt(Double d171822CalledCt)
	{
		this.d171822CalledCt = d171822CalledCt;
	}
	public Double getD171822CalledLen()
	{
		return this.d171822CalledLen;
	}
	public void setD171822CalledLen(Double d171822CalledLen)
	{
		this.d171822CalledLen = d171822CalledLen;
	}
	public Double getD171822Ct()
	{
		return this.d171822Ct;
	}
	public void setD171822Ct(Double d171822Ct)
	{
		this.d171822Ct = d171822Ct;
	}
	public Double getD171822Len()
	{
		return this.d171822Len;
	}
	public void setD171822Len(Double d171822Len)
	{
		this.d171822Len = d171822Len;
	}
	public Double getD172207CallCt()
	{
		return this.d172207CallCt;
	}
	public void setD172207CallCt(Double d172207CallCt)
	{
		this.d172207CallCt = d172207CallCt;
	}
	public Double getD172207CallLen()
	{
		return this.d172207CallLen;
	}
	public void setD172207CallLen(Double d172207CallLen)
	{
		this.d172207CallLen = d172207CallLen;
	}
	public Double getD172207CalledCt()
	{
		return this.d172207CalledCt;
	}
	public void setD172207CalledCt(Double d172207CalledCt)
	{
		this.d172207CalledCt = d172207CalledCt;
	}
	public Double getD172207CalledLen()
	{
		return this.d172207CalledLen;
	}
	public void setD172207CalledLen(Double d172207CalledLen)
	{
		this.d172207CalledLen = d172207CalledLen;
	}
	public Double getD172207Ct()
	{
		return this.d172207Ct;
	}
	public void setD172207Ct(Double d172207Ct)
	{
		this.d172207Ct = d172207Ct;
	}
	public Double getD172207Len()
	{
		return this.d172207Len;
	}
	public void setD172207Len(Double d172207Len)
	{
		this.d172207Len = d172207Len;
	}
	public Double getD17350CallCt()
	{
		return this.d17350CallCt;
	}
	public void setD17350CallCt(Double d17350CallCt)
	{
		this.d17350CallCt = d17350CallCt;
	}
	public Double getD17350CalledCt()
	{
		return this.d17350CalledCt;
	}
	public void setD17350CalledCt(Double d17350CalledCt)
	{
		this.d17350CalledCt = d17350CalledCt;
	}
	public Double getD17350Ct()
	{
		return this.d17350Ct;
	}
	public void setD17350Ct(Double d17350Ct)
	{
		this.d17350Ct = d17350Ct;
	}
	public Double getD1740120CallCt()
	{
		return this.d1740120CallCt;
	}
	public void setD1740120CallCt(Double d1740120CallCt)
	{
		this.d1740120CallCt = d1740120CallCt;
	}
	public Double getD1740120CalledCt()
	{
		return this.d1740120CalledCt;
	}
	public void setD1740120CalledCt(Double d1740120CalledCt)
	{
		this.d1740120CalledCt = d1740120CalledCt;
	}
	public Double getD1740120Ct()
	{
		return this.d1740120Ct;
	}
	public void setD1740120Ct(Double d1740120Ct)
	{
		this.d1740120Ct = d1740120Ct;
	}
	public Double getD17AddrCt()
	{
		return this.d17AddrCt;
	}
	public void setD17AddrCt(Double d17AddrCt)
	{
		this.d17AddrCt = d17AddrCt;
	}
	public Double getD17AllCallLen()
	{
		return this.d17AllCallLen;
	}
	public void setD17AllCallLen(Double d17AllCallLen)
	{
		this.d17AllCallLen = d17AllCallLen;
	}
	public Double getD17AllCalledLen()
	{
		return this.d17AllCalledLen;
	}
	public void setD17AllCalledLen(Double d17AllCalledLen)
	{
		this.d17AllCalledLen = d17AllCalledLen;
	}
	public Double getD17AllLen()
	{
		return this.d17AllLen;
	}
	public void setD17AllLen(Double d17AllLen)
	{
		this.d17AllLen = d17AllLen;
	}
	public Double getD17CallAddrCt()
	{
		return this.d17CallAddrCt;
	}
	public void setD17CallAddrCt(Double d17CallAddrCt)
	{
		this.d17CallAddrCt = d17CallAddrCt;
	}
	public Double getD17CallCt()
	{
		return this.d17CallCt;
	}
	public void setD17CallCt(Double d17CallCt)
	{
		this.d17CallCt = d17CallCt;
	}
	public Double getD17CallPer()
	{
		return this.d17CallPer;
	}
	public void setD17CallPer(Double d17CallPer)
	{
		this.d17CallPer = d17CallPer;
	}
	public Double getD17CalledAddrCt()
	{
		return this.d17CalledAddrCt;
	}
	public void setD17CalledAddrCt(Double d17CalledAddrCt)
	{
		this.d17CalledAddrCt = d17CalledAddrCt;
	}
	public Double getD17CalledCt()
	{
		return this.d17CalledCt;
	}
	public void setD17CalledCt(Double d17CalledCt)
	{
		this.d17CalledCt = d17CalledCt;
	}
	public Double getD17Ct()
	{
		return this.d17Ct;
	}
	public void setD17Ct(Double d17Ct)
	{
		this.d17Ct = d17Ct;
	}
	public Double getD17Top1AddrPer()
	{
		return this.d17Top1AddrPer;
	}
	public void setD17Top1AddrPer(Double d17Top1AddrPer)
	{
		this.d17Top1AddrPer = d17Top1AddrPer;
	}
	public Double getD17Top1CallAddrPer()
	{
		return this.d17Top1CallAddrPer;
	}
	public void setD17Top1CallAddrPer(Double d17Top1CallAddrPer)
	{
		this.d17Top1CallAddrPer = d17Top1CallAddrPer;
	}
	public Double getD17Top1CalledAddrPer()
	{
		return this.d17Top1CalledAddrPer;
	}
	public void setD17Top1CalledAddrPer(Double d17Top1CalledAddrPer)
	{
		this.d17Top1CalledAddrPer = d17Top1CalledAddrPer;
	}
	public Double getD17Top2AddrPer()
	{
		return this.d17Top2AddrPer;
	}
	public void setD17Top2AddrPer(Double d17Top2AddrPer)
	{
		this.d17Top2AddrPer = d17Top2AddrPer;
	}
	public Double getD17Top2CallAddrPer()
	{
		return this.d17Top2CallAddrPer;
	}
	public void setD17Top2CallAddrPer(Double d17Top2CallAddrPer)
	{
		this.d17Top2CallAddrPer = d17Top2CallAddrPer;
	}
	public Double getD17Top2CalledAddrPer()
	{
		return this.d17Top2CalledAddrPer;
	}
	public void setD17Top2CalledAddrPer(Double d17Top2CalledAddrPer)
	{
		this.d17Top2CalledAddrPer = d17Top2CalledAddrPer;
	}
	public Double getD21280712CallCt()
	{
		return this.d21280712CallCt;
	}
	public void setD21280712CallCt(Double d21280712CallCt)
	{
		this.d21280712CallCt = d21280712CallCt;
	}
	public Double getD21280712CallLen()
	{
		return this.d21280712CallLen;
	}
	public void setD21280712CallLen(Double d21280712CallLen)
	{
		this.d21280712CallLen = d21280712CallLen;
	}
	public Double getD21280712CalledCt()
	{
		return this.d21280712CalledCt;
	}
	public void setD21280712CalledCt(Double d21280712CalledCt)
	{
		this.d21280712CalledCt = d21280712CalledCt;
	}
	public Double getD21280712CalledLen()
	{
		return this.d21280712CalledLen;
	}
	public void setD21280712CalledLen(Double d21280712CalledLen)
	{
		this.d21280712CalledLen = d21280712CalledLen;
	}
	public Double getD21280712Ct()
	{
		return this.d21280712Ct;
	}
	public void setD21280712Ct(Double d21280712Ct)
	{
		this.d21280712Ct = d21280712Ct;
	}
	public Double getD21280712Len()
	{
		return this.d21280712Len;
	}
	public void setD21280712Len(Double d21280712Len)
	{
		this.d21280712Len = d21280712Len;
	}
	public Double getD2128010CallCt()
	{
		return this.d2128010CallCt;
	}
	public void setD2128010CallCt(Double d2128010CallCt)
	{
		this.d2128010CallCt = d2128010CallCt;
	}
	public Double getD2128010CalledCt()
	{
		return this.d2128010CalledCt;
	}
	public void setD2128010CalledCt(Double d2128010CalledCt)
	{
		this.d2128010CalledCt = d2128010CalledCt;
	}
	public Double getD2128010Ct()
	{
		return this.d2128010Ct;
	}
	public void setD2128010Ct(Double d2128010Ct)
	{
		this.d2128010Ct = d2128010Ct;
	}
	public Double getD21281040CallCt()
	{
		return this.d21281040CallCt;
	}
	public void setD21281040CallCt(Double d21281040CallCt)
	{
		this.d21281040CallCt = d21281040CallCt;
	}
	public Double getD21281040CalledCt()
	{
		return this.d21281040CalledCt;
	}
	public void setD21281040CalledCt(Double d21281040CalledCt)
	{
		this.d21281040CalledCt = d21281040CalledCt;
	}
	public Double getD21281040Ct()
	{
		return this.d21281040Ct;
	}
	public void setD21281040Ct(Double d21281040Ct)
	{
		this.d21281040Ct = d21281040Ct;
	}
	public Double getD2128120350CallCt()
	{
		return this.d2128120350CallCt;
	}
	public void setD2128120350CallCt(Double d2128120350CallCt)
	{
		this.d2128120350CallCt = d2128120350CallCt;
	}
	public Double getD2128120350CalledCt()
	{
		return this.d2128120350CalledCt;
	}
	public void setD2128120350CalledCt(Double d2128120350CalledCt)
	{
		this.d2128120350CalledCt = d2128120350CalledCt;
	}
	public Double getD2128120350Ct()
	{
		return this.d2128120350Ct;
	}
	public void setD2128120350Ct(Double d2128120350Ct)
	{
		this.d2128120350Ct = d2128120350Ct;
	}
	public Double getD21281218CallCt()
	{
		return this.d21281218CallCt;
	}
	public void setD21281218CallCt(Double d21281218CallCt)
	{
		this.d21281218CallCt = d21281218CallCt;
	}
	public Double getD21281218CallLen()
	{
		return this.d21281218CallLen;
	}
	public void setD21281218CallLen(Double d21281218CallLen)
	{
		this.d21281218CallLen = d21281218CallLen;
	}
	public Double getD21281218CalledCt()
	{
		return this.d21281218CalledCt;
	}
	public void setD21281218CalledCt(Double d21281218CalledCt)
	{
		this.d21281218CalledCt = d21281218CalledCt;
	}
	public Double getD21281218CalledLen()
	{
		return this.d21281218CalledLen;
	}
	public void setD21281218CalledLen(Double d21281218CalledLen)
	{
		this.d21281218CalledLen = d21281218CalledLen;
	}
	public Double getD21281218Ct()
	{
		return this.d21281218Ct;
	}
	public void setD21281218Ct(Double d21281218Ct)
	{
		this.d21281218Ct = d21281218Ct;
	}
	public Double getD21281218Len()
	{
		return this.d21281218Len;
	}
	public void setD21281218Len(Double d21281218Len)
	{
		this.d21281218Len = d21281218Len;
	}
	public Double getD21281822CallCt()
	{
		return this.d21281822CallCt;
	}
	public void setD21281822CallCt(Double d21281822CallCt)
	{
		this.d21281822CallCt = d21281822CallCt;
	}
	public Double getD21281822CallLen()
	{
		return this.d21281822CallLen;
	}
	public void setD21281822CallLen(Double d21281822CallLen)
	{
		this.d21281822CallLen = d21281822CallLen;
	}
	public Double getD21281822CalledCt()
	{
		return this.d21281822CalledCt;
	}
	public void setD21281822CalledCt(Double d21281822CalledCt)
	{
		this.d21281822CalledCt = d21281822CalledCt;
	}
	public Double getD21281822CalledLen()
	{
		return this.d21281822CalledLen;
	}
	public void setD21281822CalledLen(Double d21281822CalledLen)
	{
		this.d21281822CalledLen = d21281822CalledLen;
	}
	public Double getD21281822Ct()
	{
		return this.d21281822Ct;
	}
	public void setD21281822Ct(Double d21281822Ct)
	{
		this.d21281822Ct = d21281822Ct;
	}
	public Double getD21281822Len()
	{
		return this.d21281822Len;
	}
	public void setD21281822Len(Double d21281822Len)
	{
		this.d21281822Len = d21281822Len;
	}
	public Double getD21282207CallCt()
	{
		return this.d21282207CallCt;
	}
	public void setD21282207CallCt(Double d21282207CallCt)
	{
		this.d21282207CallCt = d21282207CallCt;
	}
	public Double getD21282207CallLen()
	{
		return this.d21282207CallLen;
	}
	public void setD21282207CallLen(Double d21282207CallLen)
	{
		this.d21282207CallLen = d21282207CallLen;
	}
	public Double getD21282207CalledCt()
	{
		return this.d21282207CalledCt;
	}
	public void setD21282207CalledCt(Double d21282207CalledCt)
	{
		this.d21282207CalledCt = d21282207CalledCt;
	}
	public Double getD21282207CalledLen()
	{
		return this.d21282207CalledLen;
	}
	public void setD21282207CalledLen(Double d21282207CalledLen)
	{
		this.d21282207CalledLen = d21282207CalledLen;
	}
	public Double getD21282207Ct()
	{
		return this.d21282207Ct;
	}
	public void setD21282207Ct(Double d21282207Ct)
	{
		this.d21282207Ct = d21282207Ct;
	}
	public Double getD21282207Len()
	{
		return this.d21282207Len;
	}
	public void setD21282207Len(Double d21282207Len)
	{
		this.d21282207Len = d21282207Len;
	}
	public Double getD2128350CallCt()
	{
		return this.d2128350CallCt;
	}
	public void setD2128350CallCt(Double d2128350CallCt)
	{
		this.d2128350CallCt = d2128350CallCt;
	}
	public Double getD2128350CalledCt()
	{
		return this.d2128350CalledCt;
	}
	public void setD2128350CalledCt(Double d2128350CalledCt)
	{
		this.d2128350CalledCt = d2128350CalledCt;
	}
	public Double getD2128350Ct()
	{
		return this.d2128350Ct;
	}
	public void setD2128350Ct(Double d2128350Ct)
	{
		this.d2128350Ct = d2128350Ct;
	}
	public Double getD212840120CallCt()
	{
		return this.d212840120CallCt;
	}
	public void setD212840120CallCt(Double d212840120CallCt)
	{
		this.d212840120CallCt = d212840120CallCt;
	}
	public Double getD212840120CalledCt()
	{
		return this.d212840120CalledCt;
	}
	public void setD212840120CalledCt(Double d212840120CalledCt)
	{
		this.d212840120CalledCt = d212840120CalledCt;
	}
	public Double getD212840120Ct()
	{
		return this.d212840120Ct;
	}
	public void setD212840120Ct(Double d212840120Ct)
	{
		this.d212840120Ct = d212840120Ct;
	}
	public Double getD2128AddrCt()
	{
		return this.d2128AddrCt;
	}
	public void setD2128AddrCt(Double d2128AddrCt)
	{
		this.d2128AddrCt = d2128AddrCt;
	}
	public Double getD2128AllCallLen()
	{
		return this.d2128AllCallLen;
	}
	public void setD2128AllCallLen(Double d2128AllCallLen)
	{
		this.d2128AllCallLen = d2128AllCallLen;
	}
	public Double getD2128AllCalledLen()
	{
		return this.d2128AllCalledLen;
	}
	public void setD2128AllCalledLen(Double d2128AllCalledLen)
	{
		this.d2128AllCalledLen = d2128AllCalledLen;
	}
	public Double getD2128AllLen()
	{
		return this.d2128AllLen;
	}
	public void setD2128AllLen(Double d2128AllLen)
	{
		this.d2128AllLen = d2128AllLen;
	}
	public Double getD2128CallAddrCt()
	{
		return this.d2128CallAddrCt;
	}
	public void setD2128CallAddrCt(Double d2128CallAddrCt)
	{
		this.d2128CallAddrCt = d2128CallAddrCt;
	}
	public Double getD2128CallCt()
	{
		return this.d2128CallCt;
	}
	public void setD2128CallCt(Double d2128CallCt)
	{
		this.d2128CallCt = d2128CallCt;
	}
	public Double getD2128CallPer()
	{
		return this.d2128CallPer;
	}
	public void setD2128CallPer(Double d2128CallPer)
	{
		this.d2128CallPer = d2128CallPer;
	}
	public Double getD2128CalledAddrCt()
	{
		return this.d2128CalledAddrCt;
	}
	public void setD2128CalledAddrCt(Double d2128CalledAddrCt)
	{
		this.d2128CalledAddrCt = d2128CalledAddrCt;
	}
	public Double getD2128CalledCt()
	{
		return this.d2128CalledCt;
	}
	public void setD2128CalledCt(Double d2128CalledCt)
	{
		this.d2128CalledCt = d2128CalledCt;
	}
	public Double getD2128Ct()
	{
		return this.d2128Ct;
	}
	public void setD2128Ct(Double d2128Ct)
	{
		this.d2128Ct = d2128Ct;
	}
	public Double getD2128Top1AddrPer()
	{
		return this.d2128Top1AddrPer;
	}
	public void setD2128Top1AddrPer(Double d2128Top1AddrPer)
	{
		this.d2128Top1AddrPer = d2128Top1AddrPer;
	}
	public Double getD2128Top1CallAddrPer()
	{
		return this.d2128Top1CallAddrPer;
	}
	public void setD2128Top1CallAddrPer(Double d2128Top1CallAddrPer)
	{
		this.d2128Top1CallAddrPer = d2128Top1CallAddrPer;
	}
	public Double getD2128Top1CalledAddrPer()
	{
		return this.d2128Top1CalledAddrPer;
	}
	public void setD2128Top1CalledAddrPer(Double d2128Top1CalledAddrPer)
	{
		this.d2128Top1CalledAddrPer = d2128Top1CalledAddrPer;
	}
	public Double getD2128Top2AddrPer()
	{
		return this.d2128Top2AddrPer;
	}
	public void setD2128Top2AddrPer(Double d2128Top2AddrPer)
	{
		this.d2128Top2AddrPer = d2128Top2AddrPer;
	}
	public Double getD2128Top2CallAddrPer()
	{
		return this.d2128Top2CallAddrPer;
	}
	public void setD2128Top2CallAddrPer(Double d2128Top2CallAddrPer)
	{
		this.d2128Top2CallAddrPer = d2128Top2CallAddrPer;
	}
	public Double getD2128Top2CalledAddrPer()
	{
		return this.d2128Top2CalledAddrPer;
	}
	public void setD2128Top2CalledAddrPer(Double d2128Top2CalledAddrPer)
	{
		this.d2128Top2CalledAddrPer = d2128Top2CalledAddrPer;
	}
	public Double getD30600712CallCt()
	{
		return this.d30600712CallCt;
	}
	public void setD30600712CallCt(Double d30600712CallCt)
	{
		this.d30600712CallCt = d30600712CallCt;
	}
	public Double getD30600712CallLen()
	{
		return this.d30600712CallLen;
	}
	public void setD30600712CallLen(Double d30600712CallLen)
	{
		this.d30600712CallLen = d30600712CallLen;
	}
	public Double getD30600712CalledCt()
	{
		return this.d30600712CalledCt;
	}
	public void setD30600712CalledCt(Double d30600712CalledCt)
	{
		this.d30600712CalledCt = d30600712CalledCt;
	}
	public Double getD30600712CalledLen()
	{
		return this.d30600712CalledLen;
	}
	public void setD30600712CalledLen(Double d30600712CalledLen)
	{
		this.d30600712CalledLen = d30600712CalledLen;
	}
	public Double getD30600712Ct()
	{
		return this.d30600712Ct;
	}
	public void setD30600712Ct(Double d30600712Ct)
	{
		this.d30600712Ct = d30600712Ct;
	}
	public Double getD30600712Len()
	{
		return this.d30600712Len;
	}
	public void setD30600712Len(Double d30600712Len)
	{
		this.d30600712Len = d30600712Len;
	}
	public Double getD3060010CallCt()
	{
		return this.d3060010CallCt;
	}
	public void setD3060010CallCt(Double d3060010CallCt)
	{
		this.d3060010CallCt = d3060010CallCt;
	}
	public Double getD3060010CalledCt()
	{
		return this.d3060010CalledCt;
	}
	public void setD3060010CalledCt(Double d3060010CalledCt)
	{
		this.d3060010CalledCt = d3060010CalledCt;
	}
	public Double getD3060010Ct()
	{
		return this.d3060010Ct;
	}
	public void setD3060010Ct(Double d3060010Ct)
	{
		this.d3060010Ct = d3060010Ct;
	}
	public Double getD30601040CallCt()
	{
		return this.d30601040CallCt;
	}
	public void setD30601040CallCt(Double d30601040CallCt)
	{
		this.d30601040CallCt = d30601040CallCt;
	}
	public Double getD30601040CalledCt()
	{
		return this.d30601040CalledCt;
	}
	public void setD30601040CalledCt(Double d30601040CalledCt)
	{
		this.d30601040CalledCt = d30601040CalledCt;
	}
	public Double getD30601040Ct()
	{
		return this.d30601040Ct;
	}
	public void setD30601040Ct(Double d30601040Ct)
	{
		this.d30601040Ct = d30601040Ct;
	}
	public Double getD3060120350CallCt()
	{
		return this.d3060120350CallCt;
	}
	public void setD3060120350CallCt(Double d3060120350CallCt)
	{
		this.d3060120350CallCt = d3060120350CallCt;
	}
	public Double getD3060120350CalledCt()
	{
		return this.d3060120350CalledCt;
	}
	public void setD3060120350CalledCt(Double d3060120350CalledCt)
	{
		this.d3060120350CalledCt = d3060120350CalledCt;
	}
	public Double getD3060120350Ct()
	{
		return this.d3060120350Ct;
	}
	public void setD3060120350Ct(Double d3060120350Ct)
	{
		this.d3060120350Ct = d3060120350Ct;
	}
	public Double getD30601218CallCt()
	{
		return this.d30601218CallCt;
	}
	public void setD30601218CallCt(Double d30601218CallCt)
	{
		this.d30601218CallCt = d30601218CallCt;
	}
	public Double getD30601218CallLen()
	{
		return this.d30601218CallLen;
	}
	public void setD30601218CallLen(Double d30601218CallLen)
	{
		this.d30601218CallLen = d30601218CallLen;
	}
	public Double getD30601218CalledCt()
	{
		return this.d30601218CalledCt;
	}
	public void setD30601218CalledCt(Double d30601218CalledCt)
	{
		this.d30601218CalledCt = d30601218CalledCt;
	}
	public Double getD30601218CalledLen()
	{
		return this.d30601218CalledLen;
	}
	public void setD30601218CalledLen(Double d30601218CalledLen)
	{
		this.d30601218CalledLen = d30601218CalledLen;
	}
	public Double getD30601218Ct()
	{
		return this.d30601218Ct;
	}
	public void setD30601218Ct(Double d30601218Ct)
	{
		this.d30601218Ct = d30601218Ct;
	}
	public Double getD30601218Len()
	{
		return this.d30601218Len;
	}
	public void setD30601218Len(Double d30601218Len)
	{
		this.d30601218Len = d30601218Len;
	}
	public Double getD30601822CallCt()
	{
		return this.d30601822CallCt;
	}
	public void setD30601822CallCt(Double d30601822CallCt)
	{
		this.d30601822CallCt = d30601822CallCt;
	}
	public Double getD30601822CallLen()
	{
		return this.d30601822CallLen;
	}
	public void setD30601822CallLen(Double d30601822CallLen)
	{
		this.d30601822CallLen = d30601822CallLen;
	}
	public Double getD30601822CalledCt()
	{
		return this.d30601822CalledCt;
	}
	public void setD30601822CalledCt(Double d30601822CalledCt)
	{
		this.d30601822CalledCt = d30601822CalledCt;
	}
	public Double getD30601822CalledLen()
	{
		return this.d30601822CalledLen;
	}
	public void setD30601822CalledLen(Double d30601822CalledLen)
	{
		this.d30601822CalledLen = d30601822CalledLen;
	}
	public Double getD30601822Ct()
	{
		return this.d30601822Ct;
	}
	public void setD30601822Ct(Double d30601822Ct)
	{
		this.d30601822Ct = d30601822Ct;
	}
	public Double getD30601822Len()
	{
		return this.d30601822Len;
	}
	public void setD30601822Len(Double d30601822Len)
	{
		this.d30601822Len = d30601822Len;
	}
	public Double getD30602207CallCt()
	{
		return this.d30602207CallCt;
	}
	public void setD30602207CallCt(Double d30602207CallCt)
	{
		this.d30602207CallCt = d30602207CallCt;
	}
	public Double getD30602207CallLen()
	{
		return this.d30602207CallLen;
	}
	public void setD30602207CallLen(Double d30602207CallLen)
	{
		this.d30602207CallLen = d30602207CallLen;
	}
	public Double getD30602207CalledCt()
	{
		return this.d30602207CalledCt;
	}
	public void setD30602207CalledCt(Double d30602207CalledCt)
	{
		this.d30602207CalledCt = d30602207CalledCt;
	}
	public Double getD30602207CalledLen()
	{
		return this.d30602207CalledLen;
	}
	public void setD30602207CalledLen(Double d30602207CalledLen)
	{
		this.d30602207CalledLen = d30602207CalledLen;
	}
	public Double getD30602207Ct()
	{
		return this.d30602207Ct;
	}
	public void setD30602207Ct(Double d30602207Ct)
	{
		this.d30602207Ct = d30602207Ct;
	}
	public Double getD30602207Len()
	{
		return this.d30602207Len;
	}
	public void setD30602207Len(Double d30602207Len)
	{
		this.d30602207Len = d30602207Len;
	}
	public Double getD3060350CallCt()
	{
		return this.d3060350CallCt;
	}
	public void setD3060350CallCt(Double d3060350CallCt)
	{
		this.d3060350CallCt = d3060350CallCt;
	}
	public Double getD3060350CalledCt()
	{
		return this.d3060350CalledCt;
	}
	public void setD3060350CalledCt(Double d3060350CalledCt)
	{
		this.d3060350CalledCt = d3060350CalledCt;
	}
	public Double getD3060350Ct()
	{
		return this.d3060350Ct;
	}
	public void setD3060350Ct(Double d3060350Ct)
	{
		this.d3060350Ct = d3060350Ct;
	}
	public Double getD306040120CallCt()
	{
		return this.d306040120CallCt;
	}
	public void setD306040120CallCt(Double d306040120CallCt)
	{
		this.d306040120CallCt = d306040120CallCt;
	}
	public Double getD306040120CalledCt()
	{
		return this.d306040120CalledCt;
	}
	public void setD306040120CalledCt(Double d306040120CalledCt)
	{
		this.d306040120CalledCt = d306040120CalledCt;
	}
	public Double getD306040120Ct()
	{
		return this.d306040120Ct;
	}
	public void setD306040120Ct(Double d306040120Ct)
	{
		this.d306040120Ct = d306040120Ct;
	}
	public Double getD3060AddrCt()
	{
		return this.d3060AddrCt;
	}
	public void setD3060AddrCt(Double d3060AddrCt)
	{
		this.d3060AddrCt = d3060AddrCt;
	}
	public Double getD3060AllCallLen()
	{
		return this.d3060AllCallLen;
	}
	public void setD3060AllCallLen(Double d3060AllCallLen)
	{
		this.d3060AllCallLen = d3060AllCallLen;
	}
	public Double getD3060AllCalledLen()
	{
		return this.d3060AllCalledLen;
	}
	public void setD3060AllCalledLen(Double d3060AllCalledLen)
	{
		this.d3060AllCalledLen = d3060AllCalledLen;
	}
	public Double getD3060AllLen()
	{
		return this.d3060AllLen;
	}
	public void setD3060AllLen(Double d3060AllLen)
	{
		this.d3060AllLen = d3060AllLen;
	}
	public Double getD3060CallAddrCt()
	{
		return this.d3060CallAddrCt;
	}
	public void setD3060CallAddrCt(Double d3060CallAddrCt)
	{
		this.d3060CallAddrCt = d3060CallAddrCt;
	}
	public Double getD3060CalledAddrCt()
	{
		return this.d3060CalledAddrCt;
	}
	public void setD3060CalledAddrCt(Double d3060CalledAddrCt)
	{
		this.d3060CalledAddrCt = d3060CalledAddrCt;
	}
	public Double getD7140712CallCt()
	{
		return this.d7140712CallCt;
	}
	public void setD7140712CallCt(Double d7140712CallCt)
	{
		this.d7140712CallCt = d7140712CallCt;
	}
	public Double getD7140712CallLen()
	{
		return this.d7140712CallLen;
	}
	public void setD7140712CallLen(Double d7140712CallLen)
	{
		this.d7140712CallLen = d7140712CallLen;
	}
	public Double getD7140712CalledCt()
	{
		return this.d7140712CalledCt;
	}
	public void setD7140712CalledCt(Double d7140712CalledCt)
	{
		this.d7140712CalledCt = d7140712CalledCt;
	}
	public Double getD7140712CalledLen()
	{
		return this.d7140712CalledLen;
	}
	public void setD7140712CalledLen(Double d7140712CalledLen)
	{
		this.d7140712CalledLen = d7140712CalledLen;
	}
	public Double getD7140712Ct()
	{
		return this.d7140712Ct;
	}
	public void setD7140712Ct(Double d7140712Ct)
	{
		this.d7140712Ct = d7140712Ct;
	}
	public Double getD7140712Len()
	{
		return this.d7140712Len;
	}
	public void setD7140712Len(Double d7140712Len)
	{
		this.d7140712Len = d7140712Len;
	}
	public Double getD714010CallCt()
	{
		return this.d714010CallCt;
	}
	public void setD714010CallCt(Double d714010CallCt)
	{
		this.d714010CallCt = d714010CallCt;
	}
	public Double getD714010CalledCt()
	{
		return this.d714010CalledCt;
	}
	public void setD714010CalledCt(Double d714010CalledCt)
	{
		this.d714010CalledCt = d714010CalledCt;
	}
	public Double getD714010Ct()
	{
		return this.d714010Ct;
	}
	public void setD714010Ct(Double d714010Ct)
	{
		this.d714010Ct = d714010Ct;
	}
	public Double getD7141040CallCt()
	{
		return this.d7141040CallCt;
	}
	public void setD7141040CallCt(Double d7141040CallCt)
	{
		this.d7141040CallCt = d7141040CallCt;
	}
	public Double getD7141040CalledCt()
	{
		return this.d7141040CalledCt;
	}
	public void setD7141040CalledCt(Double d7141040CalledCt)
	{
		this.d7141040CalledCt = d7141040CalledCt;
	}
	public Double getD7141040Ct()
	{
		return this.d7141040Ct;
	}
	public void setD7141040Ct(Double d7141040Ct)
	{
		this.d7141040Ct = d7141040Ct;
	}
	public Double getD714120350CallCt()
	{
		return this.d714120350CallCt;
	}
	public void setD714120350CallCt(Double d714120350CallCt)
	{
		this.d714120350CallCt = d714120350CallCt;
	}
	public Double getD714120350CalledCt()
	{
		return this.d714120350CalledCt;
	}
	public void setD714120350CalledCt(Double d714120350CalledCt)
	{
		this.d714120350CalledCt = d714120350CalledCt;
	}
	public Double getD714120350Ct()
	{
		return this.d714120350Ct;
	}
	public void setD714120350Ct(Double d714120350Ct)
	{
		this.d714120350Ct = d714120350Ct;
	}
	public Double getD7141218CallCt()
	{
		return this.d7141218CallCt;
	}
	public void setD7141218CallCt(Double d7141218CallCt)
	{
		this.d7141218CallCt = d7141218CallCt;
	}
	public Double getD7141218CallLen()
	{
		return this.d7141218CallLen;
	}
	public void setD7141218CallLen(Double d7141218CallLen)
	{
		this.d7141218CallLen = d7141218CallLen;
	}
	public Double getD7141218CalledCt()
	{
		return this.d7141218CalledCt;
	}
	public void setD7141218CalledCt(Double d7141218CalledCt)
	{
		this.d7141218CalledCt = d7141218CalledCt;
	}
	public Double getD7141218CalledLen()
	{
		return this.d7141218CalledLen;
	}
	public void setD7141218CalledLen(Double d7141218CalledLen)
	{
		this.d7141218CalledLen = d7141218CalledLen;
	}
	public Double getD7141218Ct()
	{
		return this.d7141218Ct;
	}
	public void setD7141218Ct(Double d7141218Ct)
	{
		this.d7141218Ct = d7141218Ct;
	}
	public Double getD7141218Len()
	{
		return this.d7141218Len;
	}
	public void setD7141218Len(Double d7141218Len)
	{
		this.d7141218Len = d7141218Len;
	}
	public Double getD7141822CallCt()
	{
		return this.d7141822CallCt;
	}
	public void setD7141822CallCt(Double d7141822CallCt)
	{
		this.d7141822CallCt = d7141822CallCt;
	}
	public Double getD7141822CallLen()
	{
		return this.d7141822CallLen;
	}
	public void setD7141822CallLen(Double d7141822CallLen)
	{
		this.d7141822CallLen = d7141822CallLen;
	}
	public Double getD7141822CalledCt()
	{
		return this.d7141822CalledCt;
	}
	public void setD7141822CalledCt(Double d7141822CalledCt)
	{
		this.d7141822CalledCt = d7141822CalledCt;
	}
	public Double getD7141822CalledLen()
	{
		return this.d7141822CalledLen;
	}
	public void setD7141822CalledLen(Double d7141822CalledLen)
	{
		this.d7141822CalledLen = d7141822CalledLen;
	}
	public Double getD7141822Ct()
	{
		return this.d7141822Ct;
	}
	public void setD7141822Ct(Double d7141822Ct)
	{
		this.d7141822Ct = d7141822Ct;
	}
	public Double getD7141822Len()
	{
		return this.d7141822Len;
	}
	public void setD7141822Len(Double d7141822Len)
	{
		this.d7141822Len = d7141822Len;
	}
	public Double getD7142207CallCt()
	{
		return this.d7142207CallCt;
	}
	public void setD7142207CallCt(Double d7142207CallCt)
	{
		this.d7142207CallCt = d7142207CallCt;
	}
	public Double getD7142207CallLen()
	{
		return this.d7142207CallLen;
	}
	public void setD7142207CallLen(Double d7142207CallLen)
	{
		this.d7142207CallLen = d7142207CallLen;
	}
	public Double getD7142207CalledCt()
	{
		return this.d7142207CalledCt;
	}
	public void setD7142207CalledCt(Double d7142207CalledCt)
	{
		this.d7142207CalledCt = d7142207CalledCt;
	}
	public Double getD7142207CalledLen()
	{
		return this.d7142207CalledLen;
	}
	public void setD7142207CalledLen(Double d7142207CalledLen)
	{
		this.d7142207CalledLen = d7142207CalledLen;
	}
	public Double getD7142207Ct()
	{
		return this.d7142207Ct;
	}
	public void setD7142207Ct(Double d7142207Ct)
	{
		this.d7142207Ct = d7142207Ct;
	}
	public Double getD7142207Len()
	{
		return this.d7142207Len;
	}
	public void setD7142207Len(Double d7142207Len)
	{
		this.d7142207Len = d7142207Len;
	}
	public Double getD714350CallCt()
	{
		return this.d714350CallCt;
	}
	public void setD714350CallCt(Double d714350CallCt)
	{
		this.d714350CallCt = d714350CallCt;
	}
	public Double getD714350CalledCt()
	{
		return this.d714350CalledCt;
	}
	public void setD714350CalledCt(Double d714350CalledCt)
	{
		this.d714350CalledCt = d714350CalledCt;
	}
	public Double getD714350Ct()
	{
		return this.d714350Ct;
	}
	public void setD714350Ct(Double d714350Ct)
	{
		this.d714350Ct = d714350Ct;
	}
	public Double getD71440120CallCt()
	{
		return this.d71440120CallCt;
	}
	public void setD71440120CallCt(Double d71440120CallCt)
	{
		this.d71440120CallCt = d71440120CallCt;
	}
	public Double getD71440120CalledCt()
	{
		return this.d71440120CalledCt;
	}
	public void setD71440120CalledCt(Double d71440120CalledCt)
	{
		this.d71440120CalledCt = d71440120CalledCt;
	}
	public Double getD71440120Ct()
	{
		return this.d71440120Ct;
	}
	public void setD71440120Ct(Double d71440120Ct)
	{
		this.d71440120Ct = d71440120Ct;
	}
	public Double getD714AddrCt()
	{
		return this.d714AddrCt;
	}
	public void setD714AddrCt(Double d714AddrCt)
	{
		this.d714AddrCt = d714AddrCt;
	}
	public Double getD714AllCallLen()
	{
		return this.d714AllCallLen;
	}
	public void setD714AllCallLen(Double d714AllCallLen)
	{
		this.d714AllCallLen = d714AllCallLen;
	}
	public Double getD714AllCalledLen()
	{
		return this.d714AllCalledLen;
	}
	public void setD714AllCalledLen(Double d714AllCalledLen)
	{
		this.d714AllCalledLen = d714AllCalledLen;
	}
	public Double getD714AllLen()
	{
		return this.d714AllLen;
	}
	public void setD714AllLen(Double d714AllLen)
	{
		this.d714AllLen = d714AllLen;
	}
	public Double getD714CallAddrCt()
	{
		return this.d714CallAddrCt;
	}
	public void setD714CallAddrCt(Double d714CallAddrCt)
	{
		this.d714CallAddrCt = d714CallAddrCt;
	}
	public Double getD714CallCt()
	{
		return this.d714CallCt;
	}
	public void setD714CallCt(Double d714CallCt)
	{
		this.d714CallCt = d714CallCt;
	}
	public Double getD714CallPer()
	{
		return this.d714CallPer;
	}
	public void setD714CallPer(Double d714CallPer)
	{
		this.d714CallPer = d714CallPer;
	}
	public Double getD714CalledAddrCt()
	{
		return this.d714CalledAddrCt;
	}
	public void setD714CalledAddrCt(Double d714CalledAddrCt)
	{
		this.d714CalledAddrCt = d714CalledAddrCt;
	}
	public Double getD714CalledCt()
	{
		return this.d714CalledCt;
	}
	public void setD714CalledCt(Double d714CalledCt)
	{
		this.d714CalledCt = d714CalledCt;
	}
	public Double getD714Ct()
	{
		return this.d714Ct;
	}
	public void setD714Ct(Double d714Ct)
	{
		this.d714Ct = d714Ct;
	}
	public Double getD714Top1AddrPer()
	{
		return this.d714Top1AddrPer;
	}
	public void setD714Top1AddrPer(Double d714Top1AddrPer)
	{
		this.d714Top1AddrPer = d714Top1AddrPer;
	}
	public Double getD714Top1CallAddrPer()
	{
		return this.d714Top1CallAddrPer;
	}
	public void setD714Top1CallAddrPer(Double d714Top1CallAddrPer)
	{
		this.d714Top1CallAddrPer = d714Top1CallAddrPer;
	}
	public Double getD714Top1CalledAddrPer()
	{
		return this.d714Top1CalledAddrPer;
	}
	public void setD714Top1CalledAddrPer(Double d714Top1CalledAddrPer)
	{
		this.d714Top1CalledAddrPer = d714Top1CalledAddrPer;
	}
	public Double getD714Top2AddrPer()
	{
		return this.d714Top2AddrPer;
	}
	public void setD714Top2AddrPer(Double d714Top2AddrPer)
	{
		this.d714Top2AddrPer = d714Top2AddrPer;
	}
	public Double getD714Top2CallAddrPer()
	{
		return this.d714Top2CallAddrPer;
	}
	public void setD714Top2CallAddrPer(Double d714Top2CallAddrPer)
	{
		this.d714Top2CallAddrPer = d714Top2CallAddrPer;
	}
	public Double getD714Top2CalledAddrPer()
	{
		return this.d714Top2CalledAddrPer;
	}
	public void setD714Top2CalledAddrPer(Double d714Top2CalledAddrPer)
	{
		this.d714Top2CalledAddrPer = d714Top2CalledAddrPer;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Double getM1Combo()
	{
		return this.m1Combo;
	}
	public void setM1Combo(Double m1Combo)
	{
		this.m1Combo = m1Combo;
	}
	public Double getM1ComboDevideSum()
	{
		return this.m1ComboDevideSum;
	}
	public void setM1ComboDevideSum(Double m1ComboDevideSum)
	{
		this.m1ComboDevideSum = m1ComboDevideSum;
	}
	public Double getM1ComboMinusSum()
	{
		return this.m1ComboMinusSum;
	}
	public void setM1ComboMinusSum(Double m1ComboMinusSum)
	{
		this.m1ComboMinusSum = m1ComboMinusSum;
	}
	public Double getM1Sum()
	{
		return this.m1Sum;
	}
	public void setM1Sum(Double m1Sum)
	{
		this.m1Sum = m1Sum;
	}
	public Double getM2Combo()
	{
		return this.m2Combo;
	}
	public void setM2Combo(Double m2Combo)
	{
		this.m2Combo = m2Combo;
	}
	public Double getM2ComboDevideSum()
	{
		return this.m2ComboDevideSum;
	}
	public void setM2ComboDevideSum(Double m2ComboDevideSum)
	{
		this.m2ComboDevideSum = m2ComboDevideSum;
	}
	public Double getM2ComboMinusSum()
	{
		return this.m2ComboMinusSum;
	}
	public void setM2ComboMinusSum(Double m2ComboMinusSum)
	{
		this.m2ComboMinusSum = m2ComboMinusSum;
	}
	public Double getM2Sum()
	{
		return this.m2Sum;
	}
	public void setM2Sum(Double m2Sum)
	{
		this.m2Sum = m2Sum;
	}
	public Double getM3Combo()
	{
		return this.m3Combo;
	}
	public void setM3Combo(Double m3Combo)
	{
		this.m3Combo = m3Combo;
	}
	public Double getM3ComboDevideSum()
	{
		return this.m3ComboDevideSum;
	}
	public void setM3ComboDevideSum(Double m3ComboDevideSum)
	{
		this.m3ComboDevideSum = m3ComboDevideSum;
	}
	public Double getM3ComboMinusSum()
	{
		return this.m3ComboMinusSum;
	}
	public void setM3ComboMinusSum(Double m3ComboMinusSum)
	{
		this.m3ComboMinusSum = m3ComboMinusSum;
	}
	public Double getM3Sum()
	{
		return this.m3Sum;
	}
	public void setM3Sum(Double m3Sum)
	{
		this.m3Sum = m3Sum;
	}
	public Double getM4Combo()
	{
		return this.m4Combo;
	}
	public void setM4Combo(Double m4Combo)
	{
		this.m4Combo = m4Combo;
	}
	public Double getM4ComboDevideSum()
	{
		return this.m4ComboDevideSum;
	}
	public void setM4ComboDevideSum(Double m4ComboDevideSum)
	{
		this.m4ComboDevideSum = m4ComboDevideSum;
	}
	public Double getM4ComboMinusSum()
	{
		return this.m4ComboMinusSum;
	}
	public void setM4ComboMinusSum(Double m4ComboMinusSum)
	{
		this.m4ComboMinusSum = m4ComboMinusSum;
	}
	public Double getM4Sum()
	{
		return this.m4Sum;
	}
	public void setM4Sum(Double m4Sum)
	{
		this.m4Sum = m4Sum;
	}
	public Double getM5Combo()
	{
		return this.m5Combo;
	}
	public void setM5Combo(Double m5Combo)
	{
		this.m5Combo = m5Combo;
	}
	public Double getM5ComboDevideSum()
	{
		return this.m5ComboDevideSum;
	}
	public void setM5ComboDevideSum(Double m5ComboDevideSum)
	{
		this.m5ComboDevideSum = m5ComboDevideSum;
	}
	public Double getM5ComboMinusSum()
	{
		return this.m5ComboMinusSum;
	}
	public void setM5ComboMinusSum(Double m5ComboMinusSum)
	{
		this.m5ComboMinusSum = m5ComboMinusSum;
	}
	public Double getM5Sum()
	{
		return this.m5Sum;
	}
	public void setM5Sum(Double m5Sum)
	{
		this.m5Sum = m5Sum;
	}
	public Double getM6Combo()
	{
		return this.m6Combo;
	}
	public void setM6Combo(Double m6Combo)
	{
		this.m6Combo = m6Combo;
	}
	public Double getM6ComboDevideSum()
	{
		return this.m6ComboDevideSum;
	}
	public void setM6ComboDevideSum(Double m6ComboDevideSum)
	{
		this.m6ComboDevideSum = m6ComboDevideSum;
	}
	public Double getM6ComboMinusSum()
	{
		return this.m6ComboMinusSum;
	}
	public void setM6ComboMinusSum(Double m6ComboMinusSum)
	{
		this.m6ComboMinusSum = m6ComboMinusSum;
	}
	public Double getM6Sum()
	{
		return this.m6Sum;
	}
	public void setM6Sum(Double m6Sum)
	{
		this.m6Sum = m6Sum;
	}
	public Double getMean0712CallCt()
	{
		return this.mean0712CallCt;
	}
	public void setMean0712CallCt(Double mean0712CallCt)
	{
		this.mean0712CallCt = mean0712CallCt;
	}
	public Double getMean0712CallLen()
	{
		return this.mean0712CallLen;
	}
	public void setMean0712CallLen(Double mean0712CallLen)
	{
		this.mean0712CallLen = mean0712CallLen;
	}
	public Double getMean0712CalledCt()
	{
		return this.mean0712CalledCt;
	}
	public void setMean0712CalledCt(Double mean0712CalledCt)
	{
		this.mean0712CalledCt = mean0712CalledCt;
	}
	public Double getMean0712CalledLen()
	{
		return this.mean0712CalledLen;
	}
	public void setMean0712CalledLen(Double mean0712CalledLen)
	{
		this.mean0712CalledLen = mean0712CalledLen;
	}
	public Double getMean0712Ct()
	{
		return this.mean0712Ct;
	}
	public void setMean0712Ct(Double mean0712Ct)
	{
		this.mean0712Ct = mean0712Ct;
	}
	public Double getMean0712Len()
	{
		return this.mean0712Len;
	}
	public void setMean0712Len(Double mean0712Len)
	{
		this.mean0712Len = mean0712Len;
	}
	public Double getMean010CallCt()
	{
		return this.mean010CallCt;
	}
	public void setMean010CallCt(Double mean010CallCt)
	{
		this.mean010CallCt = mean010CallCt;
	}
	public Double getMean010CalledCt()
	{
		return this.mean010CalledCt;
	}
	public void setMean010CalledCt(Double mean010CalledCt)
	{
		this.mean010CalledCt = mean010CalledCt;
	}
	public Double getMean010Ct()
	{
		return this.mean010Ct;
	}
	public void setMean010Ct(Double mean010Ct)
	{
		this.mean010Ct = mean010Ct;
	}
	public Double getMean1040CallCt()
	{
		return this.mean1040CallCt;
	}
	public void setMean1040CallCt(Double mean1040CallCt)
	{
		this.mean1040CallCt = mean1040CallCt;
	}
	public Double getMean1040CalledCt()
	{
		return this.mean1040CalledCt;
	}
	public void setMean1040CalledCt(Double mean1040CalledCt)
	{
		this.mean1040CalledCt = mean1040CalledCt;
	}
	public Double getMean1040Ct()
	{
		return this.mean1040Ct;
	}
	public void setMean1040Ct(Double mean1040Ct)
	{
		this.mean1040Ct = mean1040Ct;
	}
	public Double getMean120350CallCt()
	{
		return this.mean120350CallCt;
	}
	public void setMean120350CallCt(Double mean120350CallCt)
	{
		this.mean120350CallCt = mean120350CallCt;
	}
	public Double getMean120350CalledCt()
	{
		return this.mean120350CalledCt;
	}
	public void setMean120350CalledCt(Double mean120350CalledCt)
	{
		this.mean120350CalledCt = mean120350CalledCt;
	}
	public Double getMean120350Ct()
	{
		return this.mean120350Ct;
	}
	public void setMean120350Ct(Double mean120350Ct)
	{
		this.mean120350Ct = mean120350Ct;
	}
	public Double getMean1218CallCt()
	{
		return this.mean1218CallCt;
	}
	public void setMean1218CallCt(Double mean1218CallCt)
	{
		this.mean1218CallCt = mean1218CallCt;
	}
	public Double getMean1218CallLen()
	{
		return this.mean1218CallLen;
	}
	public void setMean1218CallLen(Double mean1218CallLen)
	{
		this.mean1218CallLen = mean1218CallLen;
	}
	public Double getMean1218CalledCt()
	{
		return this.mean1218CalledCt;
	}
	public void setMean1218CalledCt(Double mean1218CalledCt)
	{
		this.mean1218CalledCt = mean1218CalledCt;
	}
	public Double getMean1218CalledLen()
	{
		return this.mean1218CalledLen;
	}
	public void setMean1218CalledLen(Double mean1218CalledLen)
	{
		this.mean1218CalledLen = mean1218CalledLen;
	}
	public Double getMean1218Ct()
	{
		return this.mean1218Ct;
	}
	public void setMean1218Ct(Double mean1218Ct)
	{
		this.mean1218Ct = mean1218Ct;
	}
	public Double getMean1218Len()
	{
		return this.mean1218Len;
	}
	public void setMean1218Len(Double mean1218Len)
	{
		this.mean1218Len = mean1218Len;
	}
	public Double getMean1822CallCt()
	{
		return this.mean1822CallCt;
	}
	public void setMean1822CallCt(Double mean1822CallCt)
	{
		this.mean1822CallCt = mean1822CallCt;
	}
	public Double getMean1822CallLen()
	{
		return this.mean1822CallLen;
	}
	public void setMean1822CallLen(Double mean1822CallLen)
	{
		this.mean1822CallLen = mean1822CallLen;
	}
	public Double getMean1822CalledCt()
	{
		return this.mean1822CalledCt;
	}
	public void setMean1822CalledCt(Double mean1822CalledCt)
	{
		this.mean1822CalledCt = mean1822CalledCt;
	}
	public Double getMean1822CalledLen()
	{
		return this.mean1822CalledLen;
	}
	public void setMean1822CalledLen(Double mean1822CalledLen)
	{
		this.mean1822CalledLen = mean1822CalledLen;
	}
	public Double getMean1822Ct()
	{
		return this.mean1822Ct;
	}
	public void setMean1822Ct(Double mean1822Ct)
	{
		this.mean1822Ct = mean1822Ct;
	}
	public Double getMean1822Len()
	{
		return this.mean1822Len;
	}
	public void setMean1822Len(Double mean1822Len)
	{
		this.mean1822Len = mean1822Len;
	}
	public Double getMean2207CallCt()
	{
		return this.mean2207CallCt;
	}
	public void setMean2207CallCt(Double mean2207CallCt)
	{
		this.mean2207CallCt = mean2207CallCt;
	}
	public Double getMean2207CallLen()
	{
		return this.mean2207CallLen;
	}
	public void setMean2207CallLen(Double mean2207CallLen)
	{
		this.mean2207CallLen = mean2207CallLen;
	}
	public Double getMean2207CalledCt()
	{
		return this.mean2207CalledCt;
	}
	public void setMean2207CalledCt(Double mean2207CalledCt)
	{
		this.mean2207CalledCt = mean2207CalledCt;
	}
	public Double getMean2207CalledLen()
	{
		return this.mean2207CalledLen;
	}
	public void setMean2207CalledLen(Double mean2207CalledLen)
	{
		this.mean2207CalledLen = mean2207CalledLen;
	}
	public Double getMean2207Ct()
	{
		return this.mean2207Ct;
	}
	public void setMean2207Ct(Double mean2207Ct)
	{
		this.mean2207Ct = mean2207Ct;
	}
	public Double getMean2207Len()
	{
		return this.mean2207Len;
	}
	public void setMean2207Len(Double mean2207Len)
	{
		this.mean2207Len = mean2207Len;
	}
	public Double getMean350CallCt()
	{
		return this.mean350CallCt;
	}
	public void setMean350CallCt(Double mean350CallCt)
	{
		this.mean350CallCt = mean350CallCt;
	}
	public Double getMean350CalledCt()
	{
		return this.mean350CalledCt;
	}
	public void setMean350CalledCt(Double mean350CalledCt)
	{
		this.mean350CalledCt = mean350CalledCt;
	}
	public Double getMean350Ct()
	{
		return this.mean350Ct;
	}
	public void setMean350Ct(Double mean350Ct)
	{
		this.mean350Ct = mean350Ct;
	}
	public Double getMean40120CallCt()
	{
		return this.mean40120CallCt;
	}
	public void setMean40120CallCt(Double mean40120CallCt)
	{
		this.mean40120CallCt = mean40120CallCt;
	}
	public Double getMean40120CalledCt()
	{
		return this.mean40120CalledCt;
	}
	public void setMean40120CalledCt(Double mean40120CalledCt)
	{
		this.mean40120CalledCt = mean40120CalledCt;
	}
	public Double getMean40120Ct()
	{
		return this.mean40120Ct;
	}
	public void setMean40120Ct(Double mean40120Ct)
	{
		this.mean40120Ct = mean40120Ct;
	}
	public Double getMeanAddrCt()
	{
		return this.meanAddrCt;
	}
	public void setMeanAddrCt(Double meanAddrCt)
	{
		this.meanAddrCt = meanAddrCt;
	}
	public Double getMeanAllCallLen()
	{
		return this.meanAllCallLen;
	}
	public void setMeanAllCallLen(Double meanAllCallLen)
	{
		this.meanAllCallLen = meanAllCallLen;
	}
	public Double getMeanAllCalledLen()
	{
		return this.meanAllCalledLen;
	}
	public void setMeanAllCalledLen(Double meanAllCalledLen)
	{
		this.meanAllCalledLen = meanAllCalledLen;
	}
	public Double getMeanAllLen()
	{
		return this.meanAllLen;
	}
	public void setMeanAllLen(Double meanAllLen)
	{
		this.meanAllLen = meanAllLen;
	}
	public Double getMeanCallAddrCt()
	{
		return this.meanCallAddrCt;
	}
	public void setMeanCallAddrCt(Double meanCallAddrCt)
	{
		this.meanCallAddrCt = meanCallAddrCt;
	}
	public Double getMeanCallCt()
	{
		return this.meanCallCt;
	}
	public void setMeanCallCt(Double meanCallCt)
	{
		this.meanCallCt = meanCallCt;
	}
	public Double getMeanCallPer()
	{
		return this.meanCallPer;
	}
	public void setMeanCallPer(Double meanCallPer)
	{
		this.meanCallPer = meanCallPer;
	}
	public Double getMeanCalledAddrCt()
	{
		return this.meanCalledAddrCt;
	}
	public void setMeanCalledAddrCt(Double meanCalledAddrCt)
	{
		this.meanCalledAddrCt = meanCalledAddrCt;
	}
	public Double getMeanCalledCt()
	{
		return this.meanCalledCt;
	}
	public void setMeanCalledCt(Double meanCalledCt)
	{
		this.meanCalledCt = meanCalledCt;
	}
	public Double getMeanTop1AddrPer()
	{
		return this.meanTop1AddrPer;
	}
	public void setMeanTop1AddrPer(Double meanTop1AddrPer)
	{
		this.meanTop1AddrPer = meanTop1AddrPer;
	}
	public Double getMeanTop1CallAddrPer()
	{
		return this.meanTop1CallAddrPer;
	}
	public void setMeanTop1CallAddrPer(Double meanTop1CallAddrPer)
	{
		this.meanTop1CallAddrPer = meanTop1CallAddrPer;
	}
	public Double getMeanTop1CalledAddrPer()
	{
		return this.meanTop1CalledAddrPer;
	}
	public void setMeanTop1CalledAddrPer(Double meanTop1CalledAddrPer)
	{
		this.meanTop1CalledAddrPer = meanTop1CalledAddrPer;
	}
	public Double getMeanTop2AddrPer()
	{
		return this.meanTop2AddrPer;
	}
	public void setMeanTop2AddrPer(Double meanTop2AddrPer)
	{
		this.meanTop2AddrPer = meanTop2AddrPer;
	}
	public Double getMeanTop2CallAddrPer()
	{
		return this.meanTop2CallAddrPer;
	}
	public void setMeanTop2CallAddrPer(Double meanTop2CallAddrPer)
	{
		this.meanTop2CallAddrPer = meanTop2CallAddrPer;
	}
	public Double getMeanTop2CalledAddrPer()
	{
		return this.meanTop2CalledAddrPer;
	}
	public void setMeanTop2CalledAddrPer(Double meanTop2CalledAddrPer)
	{
		this.meanTop2CalledAddrPer = meanTop2CalledAddrPer;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	
}
