import java.math.BigDecimal;

public class Adder
{
    public int add (int a, int b)
    {
        return a+b;
    }
    public BigDecimal add (BigDecimal a, BigDecimal b)
    {
       return a=a.add(b);
    }


}
