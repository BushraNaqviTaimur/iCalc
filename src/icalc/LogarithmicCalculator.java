package icalc;

import java.text.DecimalFormat;

/**
 *
 * @author bushra
 */
public class LogarithmicCalculator extends BasicCalculator
{

    private double myResult=0;
    private double operand;
    
    public LogarithmicCalculator(double number)
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
    
    
    public double Log()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.log(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Log10()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.log10(operand);
        return myResult=Double.parseDouble(value.format(myResult));
    }
    
    public double Log1p()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.log1p(operand);
        return myResult=Double.parseDouble(value.format(myResult));
        
    }
    
    public double Rand()
    {
        DecimalFormat value = new DecimalFormat("#.########");
        myResult= Math.random();
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
