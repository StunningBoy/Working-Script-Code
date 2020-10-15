package org.example;

import java.math.BigDecimal;

/**
 * @author catt
 * @version 1.0
 * @Description
 * @Date 2020/8/26
 */
public class Tesss {

    public static void main(String[] args) {
        double min = 60 ;
        double s = 3600 ;
        BigDecimal value = new BigDecimal(360);
        double vv = new BigDecimal(min).divide(new BigDecimal(s), 16, BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(value.multiply(new BigDecimal(vv)).setScale(15, BigDecimal.ROUND_HALF_UP));


        System.out.println(value.multiply(new BigDecimal(min)).divide(new BigDecimal(s), 8, BigDecimal.ROUND_HALF_UP));

    }

}
