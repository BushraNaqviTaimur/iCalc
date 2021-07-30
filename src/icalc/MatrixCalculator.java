package icalc;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author bushra
 */
public class MatrixCalculator extends Calculator

{

    private int[][] result;
    
    private int[][] matrixA;
    private int[][] matrixB;
       
    public MatrixCalculator(int[][] matrixA, int[][] matrixB)
    {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }
    
    public void setResult(int[][] res) 
    {
        result = res;
    }
 
    public int[][] getResult() 
    {
        return result;
    }
    
    public void setMatrixA(int[][] a) 
    {
        matrixA = a;
    }
 
    public int[][] getMatrixA() 
    {
        return matrixA;
    }
    
    public void setMatrixB(int[][] b) 
    {
        matrixB = b;
    }
 
    public int[][] getMatrixB() 
    {
        return matrixB;
    }
    
    
    public void Calculate(String operator) 
    {
        
        {     
        switch(operator)
        {
            case "+":
            {
                result = new int[matrixA.length][matrixB[0].length];
                
                //now adding first matrix to second
                
                for(int i=0;i<matrixA.length;i++)
                {
                    for (int j=0;j<matrixA[i].length;j++)
                    {

                       result[i][j] = matrixA[i][j] + matrixB[i][j];                      

                        
                    }
   
                }
                break;
            }
            case "-":
            {
                result = new int[matrixA.length][matrixB[0].length];
                
                //now subtracting first matrix from second
                
                for(int i=0;i<matrixA.length;i++)
                {
                    for (int j=0;j<matrixA[i].length;j++)
                    {

                       result[i][j] = matrixA[i][j] - matrixB[i][j];                      

                        
                    }
   
                }
                break;
            }
            case "X":
            {
                result = new int[matrixA.length][matrixB[0].length];
                
                //now multiplying first matrix with second
                
                for(int i=0;i<matrixA.length;i++)
                {
                    for (int j=0;j<matrixB[0].length;j++)
                    {
                        for (int k=0;k<matrixA[0].length;k++)
                        {
                            result[i][j] += matrixA[i][k] * matrixB[k][j];                      
                        }
                        
                    }
   
                }

                break;
            }

        }
                
        }
        
    }
    
    public void ClearAll()
    {
        result = null;
        matrixA=null;
        matrixB=null;
    }
    
}
