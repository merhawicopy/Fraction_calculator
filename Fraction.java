/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;

/**
 * @author Merhawi Gebre
 * Final Java Project
 * 07/26/2016
 */

/**
 * This class creates a program that add, subtract, 
 * multiply, and divide fraction. 
 */
public class Fraction 
{  
    private int num;
    private int denom;
    
/**
 * Default constructor intialize the Fraction class fields 
 * num = 0 and denom = 1. 
 */
Fraction()
{
    num = 0;
    denom = 1;
}
/**
 * Copy constructor. 
 * @param c The Fraction object to be copied to another Fraction object.
 */    
Fraction(Fraction c)
{
    num = c.num; 
    denom = c.denom;
}
/**
 * Convert constructor stores values in the Fraction fields.
 * @param nd The value to store in num and denom.
 */
Fraction(int nd)
{
    num = nd;
    denom = nd;
}
/**
 * Convert constructor reduces fraction values and stores them in 
 * num and denom.
 * @param n The value to store in num.
 * @param d The value to store in denom.
 */    
Fraction(int n, int d)
{
    int gcd;
        
    if( d == 0)
    {
        while(d == 0)
        {
            System.out.print("Enter NON-ZERO number for denominator: ");
            Scanner key = new Scanner(System.in);
            d = key.nextInt();
            denom = d;
        }
    }
        
    if (d < 0) 
    {
        n = -n;
	d = -d;
    } 
	gcd = gcd(n, d);
	num = n / gcd;
	denom = d / gcd;
}
/**
 * The setNum method stores a value in the
 * num field.
 * @param n The value to store in num.
 */    
public void setNum(int n)
{
    num = n;
}
/**
 * The setDenom method stores a value in the
 * denom field.
 * @param d The value to store in denom.
 */     
public void setDenom(int d)
{
    if(d < 0)
    {
       num = -num;
       denom = -d;
    }
    else
    {
       denom = d;
    }
   
}
/**
 * The getNum method returns a Fraction Object's num.
 * @return The value in the num field.
 */
public int getNum()
{
    return num;
}
/**
 * The getDenom method returns a Fraction Object's denom.
 * @return The value in the denom field.
 */
public int getDenom()
{
    return denom;
}
/**
 * Gcd returns greater common divisor of num and denom. 
 * @param num The num value of Fraction class.
 * @param denom The denom value of Fraction class.
 * @return The greater common divisor of num and denom.
 */        
public int gcd(int num, int denom) 
{
    int gcd = 1;

    if (num < 0)
	num = -num;
    
    if (denom < 0)
	denom = -denom;
	
	for (int i = 1; i <= num || i <= denom; i++) 
        {
            if (num % i == 0 && denom % i == 0) 
            {
		gcd = i;
            }
        }
    return gcd;
}
/**
 * Negative returns opposite sign of Fraction class.
 * @return The opposite sign of calling Fraction object.
 */     
Fraction negative() 
{	
    Fraction neg = new Fraction(-num, denom);
    
    return neg;
}
/**
 * Equals compares two Fraction objects.
 * @param r Fraction object to be compared.
 * @return True if Fraction objects are equal else false.
 */        
public boolean equals(Fraction r)
{
    if(num == (r.num) && denom == (r.denom))   
    {
        return true;
    }
    else
    {
        return false;
    }
}
/**
 * Add method adds two Fraction objects.
 * @param add Object to be added.
 * @return Sum of two Fraction objects.
 */    
public Fraction add(Fraction add)
{
    int n;
    int d;
    
    n = (num * add.denom) + (denom * add.num);
    d = denom * add.denom;
    
    Fraction sum = new Fraction(n, d); 
        
    return sum;
}
/**
 * Subtract method subtracts two Fraction objects.
 * @param sub Object to be subtracted.
 * @return Difference of two Fraction objects.
 */        
public Fraction subtract(Fraction sub)
{
    int n;
    int d;
    
    n = (num * sub.denom) - (denom * sub.num);
    d = denom * sub.denom;
    
    Fraction sum = new Fraction(n, d); 
        
    return sum;
}
/**
 * Multiply method multiplies two Fraction objects.
 * @param mul Object to be multiplied.
 * @return Product of two Fraction objects.
 */    
public Fraction multiply(Fraction mul)
{
    int n;
    int d;
    
    n = (num * mul.num);
    d = denom * mul.denom;
    
    Fraction sum = new Fraction(n, d); 
        
    return sum;
}
/**
 * Divide method divides two Fraction objects.
 * @param div Object to be divided.
 * @return Quotient of two Fraction objects.
 */        
public Fraction divide(Fraction div)
{
    int n;
    int d;
    
    n = num * div.denom;
    d = denom * div.num;
    
    Fraction sum = new Fraction(n, d); 
        
    return sum;
}
/**
 * GreaterThan compares two Fraction objects.
 * @param r Fraction object to be compared.
 * @return True if one Fraction object is greater than the other Fraction 
 * object else false.
 */                
public boolean greaterThan(Fraction r) 
{
    return ((num * r.denom) > (denom * r.num));
}
/**
 * LessThan compares two Fraction objects.
 * @param r Fraction object to be compared.
 * @return True if one Fraction object is less than the other Fraction 
 * object else false.
 */ 
public boolean lessThan(Fraction r) 
{
    return ((num * r.denom) < (denom * r.num));
}
/**
 * GreaterOrEquals compares two Fraction objects.
 * @param r Fraction object to be compared.
 * @return True if one Fraction object is greater or equals the other Fraction 
 * object else false.
 */ 
public boolean greaterOrEquals(Fraction r)
{
   return num * r.denom >= denom * r.num;
}
/**
 * Show displays Fraction values num and denom.
 */
public void show()
{
    System.out.printf("\n    %d/%d ", num, denom);
}
        
}
