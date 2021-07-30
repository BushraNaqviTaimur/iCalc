package icalc;

import java.text.DecimalFormat;

/**
 *
 * @author bushra
 */
public class TrigonometryCalculator extends BasicCalculator {

    private double myResult=0;
    private double operand;
    
    public TrigonometryCalculator(double number)
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
    
    
    public double Sin0()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.sin(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Cos0()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.cos(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Tan0()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.tan(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Sinh()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.sinh(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Cosh()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.cosh(operand);
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
