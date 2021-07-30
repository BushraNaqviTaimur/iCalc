package icalc;
/**
 *
 * @author bushra
 */
public class BasicCalculator extends Calculator 
{

    private double result;
    private String operatorType="=";
       
    public BasicCalculator(double number)
    {
        this.result=number;
    }
    
    public void setResult(double res) 
    {
        result = res;
    }
 
    public double getResult() 
    {
        return result;
    }
    
    public void setOperatorType(String type) 
    {
        operatorType = type;
    }
 
    public String getOperatorType() 
    {
        return operatorType;
    }
    
    public void Calculate(double number) 
    {
        switch(getOperatorType())
        {
            case "+":
            {
                result += number;
                break;
            }
            case "-":
            {
                result -= number;
                break;
            }
            case "X":
            {
                result *= number;
                break;
            }
            case "/":
            {
                result /= number;
                break;
            }
            case "=":
            {
                result = number;
                break;
            }
        }
                

    }
    
    public void ClearAll()
    {
        result = 0;
        operatorType="=";
    }
    
}
