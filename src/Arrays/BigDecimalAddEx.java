package Arrays;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalAddEx {
    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.ZERO;
        bd = bd.add(new BigDecimal(10.022323));
        bd = bd.add(new BigDecimal(10.023434));
        System.out.println(bd.setScale(4, RoundingMode.HALF_UP));
    }
}
