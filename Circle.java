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
 * This class creates center and radius using Point class and Fraction class.
 * It will have the capability to find the area, compare areas, and check
 * if one circle is inside another circle. 
 */
public class Circle
{
    private Point center;
    private Fraction radius;
/**
 * Default constructor of Circle class initialize center (0/1, 0/1) 
 * using default constructor for Point class and radius 0/1 using
 * default constructor Fraction class.
 */       
Circle()
{
    center = new Point();
    radius = new Fraction();
}
/**
 * Copy constructor. 
 * @param c The Circle object to be copied to another Circle object.
 */    
Circle(Circle c)
{
    center = c.center;
    radius = c.radius;
}
/**
 * Convert constructor stores values to Circle class field.
 * @param p The value to store in center.
 */
Circle (Point p) 
{
    center = new Point(p);
}
/**
 * Convert constructor stores values to Circle class fields.
 * @param c The value to store in center.
 * @param f The value to store in radius.
 */
Circle(Point c, Fraction f)
{
    center = new Point(c);
    radius = new Fraction(f);
}
/**
 * Convert constructor stores values to Circle class field.
 * @param r The value to store in radius.
 */
Circle (Fraction r) 
{
    radius = new Fraction(r);
}
/**
 * The setCenter method stores a value in the center field.
 * @param c The value to store in center.
 */    
public void setCenter(Point c) 
{
    center = c;
}
/**
 * The setRadius method stores a value in the radius field.
 * @param r The value to store in radius.
 */     
public void setRadius(Fraction r)
{
    radius = r;
}
/**
 * The getCenter method returns a Point type of Circle center field.
 * @return The value in the center field.
 */    
public Point getCenter()
{
    return center;
}
/**
 * The getRadius method returns a Fraction type of Circle radius field.
 * @return The value in the radius field.
 */
Fraction getRadius()
{
    return radius;
}
/**
 * The circleArea method returns a Circle
 * object's area.
 * @return The product of radius times radius times Pi.
 */
public Fraction circleArea() 
{
    Fraction pi = new Fraction(157, 50);
    Fraction radi = new Fraction(radius.multiply(radius));
    Fraction result = new Fraction(radi.multiply(pi));
    return result;
}
/**
 * The isContained method check if one circle is contained into another circle.
 * @param r The Circle class object to be compared.
 * @return True if one circle is contained into another circle else false.
 */
public boolean isContained(Circle r)
{
    Fraction distance = new Fraction();
    
    distance = (  (r.center.getX().subtract(center.getX())).multiply(
            (r.center.getX().subtract(center.getX()).add(
            (r.center.getY().subtract(center.getY()).multiply(
            (r.center.getY().subtract(center.getY()))))))) );
    
    if((radius.multiply(radius)).greaterOrEquals(
       (r.radius.multiply(r.radius)).add(distance)) || (r.radius.multiply
        (r.radius)).greaterOrEquals(((radius.multiply(radius)).add(distance))))
    {
        return true;
    }
    else
    {
        return false;
    }  
}
/**
 * The showCircle method displays center and radius values.
 */  
public void showCircle()
{
    System.out.println("\n    Center Point: (" + center.getX().getNum() +
            "/" + center.getX().getDenom() + ", " + center.getY().getNum() +
            "/" + center.getY().getDenom() + ")");
    
    System.out.println("\n    Radius: " + radius.getNum() + "/" 
            + radius.getDenom());
}
   
}
