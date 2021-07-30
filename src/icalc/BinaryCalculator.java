package icalc;
/**
 *
 * @author bushra
 */
public class BinaryCalculator extends Calculator 
{

    private int result;
    private String operatorType="=";
       
    public BinaryCalculator(int number)
    {
        this.result=number;
    }
    
    public void setResult(int res) 
    {
        result = res;
    }
 
    public int getResult() 
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
    
    public String Calculate(String number) 
    {
        String finalR=null;
        
        switch(getOperatorType())
        {
            case "+":
            {                
                result += Integer.parseInt(number, 2); //convert the binary as String to decimal and then add
                finalR=Integer.toBinaryString(result); //convert back to binary
                break;
            }
            case "-":
            {
                result -= Integer.parseInt(number, 2); //convert the binary as String to decimal and then subtract
                finalR=Integer.toBinaryString(result); //convert back to binary
                break;
            }
            case "X":
            {
                result *= Integer.parseInt(number, 2); //convert the binary as String to decimal and then multiply
                finalR=Integer.toBinaryString(result); //convert back to binary
                break;
            }
            case "=":
            {
                result = Integer.parseInt(number, 2); //convert the binary as String to decimal
                finalR=Integer.toBinaryString(result); //convert back to binary
                break;
            }
            
            
        }
            
        return finalR;    

    }
    
    public void ClearAll()
    {
        result = 0;
        operatorType="=";
    }
    
}
