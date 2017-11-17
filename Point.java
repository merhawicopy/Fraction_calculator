/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 * @author Merhawi Gebre
 * Final Java Project
 * 07/26/2016
 */

/**
 * This class creates x and y using Fraction class. It will have the 
 * capability to move the coordinates or flip. 
 */
public class Point 
{  
    private Fraction x;
    private Fraction y;
/**
 * Default constructor of Point class initialize x (0/1)and y(0/1) 
 * using default constructor for Fraction class.
 */       
Point()
{
    x = new Fraction();
    y = new Fraction();
}
/**
 * Copy constructor.
 * @param c The Point object to be copied to another Point object.
 */    
Point(Point c)
{
    x = c.x;
    y = c.y;
}
/**
 * Convert constructor stores values in the Point fields.
 * @param v The value to store in x.
 * @param v1 The value to store in y.
 */        
Point(Fraction v, Fraction v1)
{
    x = new Fraction(v);
    y = new Fraction(v1);
}
/**
 * The setX method stores a value in the x field.
 * @param f The value to store in x.
 */     
public void setX(Fraction f) 
{
    x = f;
}
/**
 * The setY method stores a value in the y field.
 * @param f The value to store in y.
 */     
public void setY(Fraction f) 
{
    y = f;
}
/**
 * The getX method returns a Fraction type of Point x field.
 * @return The value in the x field.
 */
public Fraction getX() 
{
    return x;
}
/**
 * The getY method returns a Fraction type of Point y field.
 * @return The value in the y field.
 */
public Fraction getY() 
{
    return y;
}
/**
 * The moveByX method moves the x by the given value.
 * @param f The value to be added to x.
 */     
public void moveByX(Fraction f) 
{
    x = x.add(f);
}
/**
 * The moveByY method moves the y by the given value.
 * @param z The value to be added to y.
 */  
public void moveByY(Fraction z) 
{
    y = y.add(z);
}
/**
 * The moveBy method moves the x and y by the given value.
 * @param pX The value to be added to x.
 * @param pY The value to be added to y.
 */
public void moveBy(Fraction pX, Fraction pY) 
{
    x = x.add(pX);
    y = y.add(pY);
}
/**
 * The flipByX assigns y opposite sign. 
 */        
public void flipByX() 
{
    x = x;
    y = y.negative();
}
/**
 * The flipByY assigns x opposite sign. 
 */ 
public void flipByY() 
{
    x = x.negative();
    y = y;
}
/**
 * The flipThroughOrigin assigns x and y opposite signs. 
 */ 
public void flipThroughOrigin() 
{
    x = x.negative();
    y = y.negative();
}
/**
 * The show method displays x and y values.
 */    
public void show()
{
    System.out.println("\n    (" + x.getNum() +"/" + x.getDenom() + ", " + 
            y.getNum() + "/" + y.getDenom()+ ")" );      
} 
      
}
