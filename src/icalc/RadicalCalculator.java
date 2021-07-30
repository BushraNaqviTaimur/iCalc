package icalc;

import java.text.DecimalFormat;

/**
 *
 * @author bushra
 */
public class RadicalCalculator extends BasicCalculator {

    private double myResult=0;
    private double operand;
    
    public RadicalCalculator(double number)
    {
      super(number);
      this.operand=number;
    }
    
    
    public void setMyResult(double res) 
    {
        myResult = res;
    }
 
    public double getMyResult() 
    {
        return myResult;
    }
    
    public void setOperand(double op) 
    {
        operand = op;
    }
 
    public double getOperand() 
    {
        return operand;
    }
    
    
    public double Sqrt()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.sqrt(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Cqrt()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.cbrt(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double X2()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.pow(operand, 2);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double X3()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.pow(operand, 3);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double PI()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.PI;
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    
    public void ClearAll()
    {
        myResult = 0;
        operand=0;
        setOperatorType("=");
        setResult(0);
    }
    
    
}
