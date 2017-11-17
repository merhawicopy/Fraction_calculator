/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;

/**
 *@author Merhawi Gebre
 * Final Java Project
 * 07/26/2016
 */

/**
 * The main class includes the sub menus methods for add, subtract, multiply, 
 * divide, point, and circle. 
 */
public class Main 
{
/**
 * The main method is the program's starting point.
 * @param args the command line arguments.
 */
public static void main(String[] args) 
{  
    menu();
}
/**
 * The menu method calls all the sub menus. 
 */
public static void menu()
{
        int option, option0;
        Fraction compare = new Fraction(0);
        Fraction holderAry[] = new Fraction[2];
        Fraction result = new Fraction();

        Scanner key = new Scanner(System.in);
   
	do 
        {
            System.out.printf("\n*********************"+
		        "\n*        MENU       *"+
			"\n*                   *"+
			"\n*  1. Initializing  *"+
			"\n*  2. Adding        *"+
			"\n*  3. Subtracting   *"+
			"\n*  4. Multiplying   *"+
			"\n*  5. Dividing      *"+
                        "\n*  6. Printing      *"+
			"\n*  7. Point Menu    *"+
                        "\n*  8. Circle Menu   *"+
			"\n*  9. Quit          *"+
			"\n*********************"+
			"\nSelect an option (use integer value only): ");
            
            while (!key.hasNextInt()) 
            {
            System.out.print("\nWRONG OPTION ...\n");
            
            System.out.printf("\n*********************"+
		        "\n*        MENU       *"+
			"\n*                   *"+
			"\n*  1. Initializing  *"+
			"\n*  2. Adding        *"+
			"\n*  3. Subtracting   *"+
			"\n*  4. Multiplying   *"+
			"\n*  5. Dividing      *"+
                        "\n*  6. Printing      *"+
			"\n*  7. Point Menu    *"+
                        "\n*  8. Circle Menu   *"+
			"\n*  9. Quit          *"+
			"\n*********************"+
			"\nSelect an option (use integer value only): ");
            key.next(); 
            }
		option = key.nextInt();

		switch (option) 
                {
		case 1:
                    
                   System.out.println("\n  Initializing Option --");

          do {
		System.out.printf("\n    ********************************"+
				"\n    *       INITIALIZING MENU      *"+
				"\n    *                              *"+
				"\n    *  1. Building                 *"+
				"\n    *  2. Updating                 *"+
				"\n    *  3. Return to Previous MENU  *"+
				"\n    ********************************"+
				"\n    Select an option (1, 2, or 3): ");
                
                while (!key.hasNextInt()) 
                {
            System.out.print("\n      WRONG OPTION ...\n");
            
            System.out.printf("\n    ********************************"+
				"\n    *       INITIALIZING MENU      *"+
				"\n    *                              *"+
				"\n    *  1. Building                 *"+
				"\n    *  2. Updating                 *"+
				"\n    *  3. Return to Previous MENU  *"+
				"\n    ********************************"+
				"\n    Select an option (1, 2, or 3): ");
            key.next(); 
                }
			option0 = key.nextInt();

			switch (option0) 
                        {
			case 1:
						
			if (holderAry[0] == null || holderAry[1] == null) 
                        {
                            
			System.out.println("\n      Calling building option -");
                        init(holderAry);
                        
			}
                        else 
                        {
			System.out.println("\n      You have already built");
                        }
						
			break;
			case 2:

			if (holderAry[0] == null || holderAry[1] == null ) {
			
                        System.out.println( "\n      Build first to update");
			} 
                        else
                        {
                          init(holderAry);
                        }		
			break;
			default:
				if (option0 <= 0 || option0 > 3) 
                                {
                                System.out.println("\n      WRONG OPTION ...");
				}
			}
			} while (option0 != 3);

		break;
		case 2:
                    if (holderAry[0] == null || holderAry[1] == null) {
                        System.out.println("\n  Adding Option --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
			} 
                    else 
                    {
                    addMenu(holderAry[0], holderAry[1]);
                    }
                  
		break;
		case 3:
                    if (holderAry[0] == null || holderAry[1] == null) {
                        System.out.println("\n  Subtracting Option --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
			} 
                    else 
                    {
                    subtractMenu(holderAry[0], holderAry[1]);
                    }
			
		break;
		case 4:
                    if (holderAry[0] == null || holderAry[1] == null) {
                        System.out.println("\n  Multiplying Option --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
			} 
                    else 
                    {
                    multiplyMenu(holderAry[0], holderAry[1]);
                    }
			
		break;
		case 5:
                    if (holderAry[0] == null || holderAry[1] == null) 
                    {
                        System.out.println("\n  Dividing Option --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
                    } 
                    else 
                    {
                        if(holderAry[1].getNum() == 0)
                        {
                            System.out.println("\n  A ZERO denominator is "
                                    + "undefined update right Fraction");
                            init(holderAry);
                        }
                        else
                        {
                            divideMenu(holderAry[0], holderAry[1]);
                        }
                    }

		break;
		case 6:
                    if (holderAry[0] == null || holderAry[1] == null) {
                        System.out.println("\n  Printing Option --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
			} 
                    else 
                    {
                        System.out.print("\n  Fraction 1: ");
                        holderAry[0].show();
                        System.out.print("\n  Fraction 2: ");
                        holderAry[1].show(); 
                    }
                  
                break;
                case 7:
                    if (holderAry[0] == null || holderAry[1] == null) 
                    {
                        System.out.println("\n  Point Menu --\n"+ 
		"\n    Not a proper call as no Fraction are available!");
                    } 
                    else 
                    {
                    pointMenu(holderAry[0], holderAry[1]);
                    }
                    
                break;
                case 8:
                        
                    circleMenu();
                    
                break;
                case 9:
                    System.out.println("\nGood Bye ...!");

		break;
		default:
                    if (option <= 0 || option > 9) 
                    {
                    System.out.println("\nWRONG OPTION ...");
                    }
                }
			
	} while (option != 9);
}
/**
 * The init method receives an address of an array and initialize it.
 * @param returnAry Fraction values to be stored.
 */    
public static void init(Fraction returnAry[]) 
{
	int n;
	int d;
	int choice;
        int option0;
        Fraction compare = new Fraction(0);
        
        Scanner key = new Scanner(System.in);

	if (returnAry[0] == null && returnAry[0] == null) 
        {
		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

		returnAry[0] = new Fraction(n, d);
		
		System.out.println("\n          Fraction1: " + 
                        returnAry[0].getNum() + "/" + returnAry[0].getDenom());

		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

		returnAry[1] = new Fraction(n, d);
		
		System.out.println("\n          Fraction1: " +
                        returnAry[1].getNum() 
			+ "/" + returnAry[1].getDenom());
            } 
            else if (returnAry[0].equals(compare) == false || 
                    returnAry[1].equals(compare) == false) 
            {		
		System.out.println("\n      Calling updating option -");
		System.out.printf("\n        Enter 1 to update letf,"+
			          "\n        Enter 2 to update right,"+
			          "\n        Enter 3 to update both: ");
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter 1 to update letf,"+
			          "\n        Enter 2 to update right,"+
			          "\n        Enter 3 to update both: ");
                key.next(); 
                }
		choice = key.nextInt();

		if (choice == 1) 
                {
		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

		returnAry[0] = new Fraction(n, d);
		
		System.out.println("\n          Fraction1: " + 
                        returnAry[0].getNum() + "/" + returnAry[0].getDenom());
               
		} 
                else if (choice == 2) 
                {
		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

		returnAry[1] = new Fraction(n, d);
		
		System.out.println("\n          Fraction1: " + 
                        returnAry[1].getNum() 
			+ "/" + returnAry[1].getDenom());
		} 
                else 
                {
		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

		returnAry[0] = new Fraction(n, d);
		
		System.out.println("\n          Fraction1: " + 
                    returnAry[0].getNum() + "/" + returnAry[0].getDenom());

		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();
		
                returnAry[1] = new Fraction(n, d);
                
		System.out.println("\n          Fraction1: " + 
                        returnAry[1].getNum() + "/" + returnAry[1].getDenom());
		}
	}	 
}
/**
 * The addMenu adds two Fraction values.
 * @param l The left Fraction to be added.
 * @param r The right Fraction to be added.
 */    
public static void addMenu(Fraction l, Fraction r)
{
        int option1;
        Fraction result = new Fraction(0);
    
        Scanner key = new Scanner(System.in);
        
	System.out.println("\n  ADDING Option -");
	do 
        {
	System.out.printf("\n    ********************************"+
		"\n    *          ADDING MENU         *"+
		"\n    *                              *"+
                "\n    *  1. add() - Member           *"+
		"\n    *  2. add() - Print            *"+
                "\n    *  3. Return to Previous MENU  *"+
		"\n    ********************************"+
		"\n    Select an option (1, 2, or 3): ");
                
            while (!key.hasNextInt()) 
            {
            System.out.print("\n      WRONG OPTION ...\n");
            
            System.out.printf("\n    ********************************"+
		              "\n    *          ADDING MENU         *"+
		              "\n    *                              *"+
                              "\n    *  1. add() - Member           *"+
		              "\n    *  2. add() - Print            *"+
                              "\n    *  3. Return to Previous MENU  *"+
		              "\n    ********************************"+
		              "\n    Select an option (1, 2, or 3): ");
            key.next(); 
            }
                option1 = key.nextInt();

		switch (option1) 
                {
                    case 1:
			System.out.println("\n      Calling member - add()");

			result = l.add(r);
				
                    break;
                    case 2:
                        if(result.getDenom() == 0)
                        {
                            System.out.println("\n      Add first to print");
                        }
                        else
                        {
                            System.out.println("\n      Calling print - add()");

				
                           System.out.print("\n      ");
                            l.show();
                           System.out.print("\n     +");
                            r.show();
                           System.out.print("\n     =");
                            result.show();
                        }
                    break;
                    default:
			if (option1 <= 0 || option1 > 3) 
                        {
                            System.out.println("\n      WRONG OPTION ..." );
			}
			}
	} while (option1 != 3);
}
/**
 * The subtractMenu subtracts two Fraction values.
 * @param l The left Fraction to be subtracted.
 * @param r The right Fraction to be subtracted.
 */
public static void subtractMenu(Fraction l, Fraction r)
{
        int option1;
        Fraction result = new Fraction(0);
        
        Scanner key = new Scanner(System.in);
    
	System.out.println("\n  SUBTRACTING Option -");
	do 
        {
	System.out.printf("\n    ********************************"+
                          "\n    *       SUBTRACTING MENU       *"+
                          "\n    *                              *"+
                          "\n    *  1. subtract() - Member      *"+
                          "\n    *  2. subtract() - Print       *"+
                          "\n    *  3. Return to Previous MENU  *"+
                          "\n    ********************************"+
                          "\n    Select an option (1, 2, or 3): ");

         while (!key.hasNextInt()) 
            {
            System.out.print("\n      WRONG OPTION ...\n");
            
            System.out.printf("\n    ********************************"+
                              "\n    *       SUBTRACTING MENU       *"+
                              "\n    *                              *"+
                              "\n    *  1. subtract() - Member      *"+
                              "\n    *  2. subtract() - Print       *"+
                              "\n    *  3. Return to Previous MENU  *"+
                              "\n    ********************************"+
                              "\n    Select an option (1, 2, or 3): ");
            key.next(); 
            }
                option1 = key.nextInt();

			switch (option1) {
			case 1:
                            System.out.println("\n      Calling member "
                                        + "- subtract()");
                            result = l.subtract(r);
		
			break;
			case 2:
                            if(result.getDenom() == 0)
                            {
                            System.out.println("\n      Subtract first "
                                    + "to print");
                            }
                            else
                            {
                            System.out.println("\n      Calling print - "
                                    + "subtract()");

				
                           System.out.print("\n      ");
                            l.show();
                           System.out.print("\n     -");
                            r.show();
                           System.out.print("\n     =");
                            result.show();
                            }
			break;
			default:
				if (option1 <= 0 || option1 > 3) {
				System.out.println("\n      WRONG OPTION ..." );
				}
				}
            } while (option1 != 3);
}
/**
 * The multiplyMenu multiplies two Fraction values.
 * @param l The left Fraction to be multiplied.
 * @param r The right Fraction to be multiplied.
 */        
public static void multiplyMenu(Fraction l, Fraction r)
{
        int option1;
        Fraction result = new Fraction(0);
        
        Scanner key = new Scanner(System.in);
    
	System.out.println("\n  MULTIPLYING Option -");
	do 
        {
	System.out.printf("\n    ********************************"+
                          "\n    *       MULTIPLYING MENU       *"+
                          "\n    *                              *"+
                          "\n    *  1. multiply() - Member      *"+
                          "\n    *  2. multiply() - Print       *"+
                          "\n    *  3. Return to Previous MENU  *"+
                          "\n    ********************************"+
                          "\n    Select an option (1, 2, or 3): ");

                while (!key.hasNextInt()) 
            {
            System.out.print("\n      WRONG OPTION ...\n");
            
            System.out.printf("\n    ********************************"+
                              "\n    *       MULTIPLYING MENU       *"+
                              "\n    *                              *"+
                              "\n    *  1. multiply() - Member      *"+
                              "\n    *  2. multiply() - Print       *"+
                              "\n    *  3. Return to Previous MENU  *"+
                              "\n    ********************************"+
                              "\n    Select an option (1, 2, or 3): ");
            key.next(); 
            }
                option1 = key.nextInt();

		switch (option1) {
                    case 1:
                      System.out.println("\n      Calling member - multiply()");
                      result = l.multiply(r);
				
                    break;
                    case 2:
                        if(result.getDenom() == 0)
                        {
                          System.out.println("\n      Multiply first to print");
                        }
                        else
                        {
                       System.out.println("\n      Calling print - multiply()");
	
                          System.out.print("\n      ");
                          l.show();
                          System.out.print("\n     x");
                          r.show();
                          System.out.print("\n     =");
                          result.show();
                        }
                    break;
                    default:
                        if (option1 <= 0 || option1 > 3) 
                        {
                            System.out.println("\n      WRONG OPTION ..." );
                        }
                        }
                } while (option1 != 3);
}    
/**
 * The divideMenu divides two Fraction values.
 * @param l The left Fraction to be divided.
 * @param r The right Fraction to be divided.
 */
public static void divideMenu(Fraction l, Fraction r)
{
        int option1;
        Fraction result = new Fraction(0);
        
        Scanner key = new Scanner(System.in);
    
	System.out.println("\n  DIVIDING Option -");
	do 
        {
	System.out.printf("\n    ********************************"+
                          "\n    *        DIVIDING MENU         *"+
		          "\n    *                              *"+
                          "\n    *  1. divide() - Member        *"+
		          "\n    *  2. divide() - Print         *"+
                          "\n    *  3. Return to Previous MENU  *"+
		          "\n    ********************************"+
		          "\n    Select an option (1, 2, or 3): ");
                
                while (!key.hasNextInt()) 
            {
            System.out.print("\n      WRONG OPTION ...\n");
            
           System.out.printf("\n    ********************************"+
		             "\n    *        DIVIDING MENU         *"+
		             "\n    *                              *"+
                             "\n    *  1. divide() - Member        *"+
		             "\n    *  2. divide() - Print         *"+
                             "\n    *  3. Return to Previous MENU  *"+
		             "\n    ********************************"+
		             "\n    Select an option (1, 2, or 3): ");
            key.next(); 
            }
                option1 = key.nextInt();

			switch (option1) {
			case 1:
				System.out.println("\n      Calling member - d"
                                        + "ivide()");
				result = l.divide(r);	
			break;
			case 2:
                            if(result.getDenom() == 0)
                            {
                            System.out.println("\n      Divide first to print");
                            }
                            else
                            {
                            System.out.println("\n      Calling print - "
                                    + "Divide()");
                           System.out.print("\n      ");
                            l.show();
                           System.out.print("\n     /");
                            r.show();
                           System.out.print("\n     =");
                            result.show();
                            }
			break;
			default:
				if (option1 <= 0 || option1 > 3) {
				System.out.println("\n      WRONG OPTION ..." );
				}
				}
		} while (option1 != 3);
}   
/**
 * The pointMenu creates a point using two Fraction values.
 * @param p1 The left Fraction is the x of the point.
 * @param p2 The right Fraction is the y of the point.
 */
public static void pointMenu(Fraction p1, Fraction p2)
{
    int option;
    Point access = new Point(p1, p2);
    
    Scanner key = new Scanner(System.in);
    
    do {

	System.out.print( "\n    ****************************"+
			  "\n    *        MENU Point        *"+
			  "\n    *  1. Moving By (frX, frY) *"+
                          "\n    *  2. Moving By X          *"+
                          "\n    *  3. Moving By Y          *"+
			  "\n    *  4. Flipping By Origin   *"+
                          "\n    *  5. Flipping By X        *"+
                          "\n    *  6. Flipping By Y        *"+
			  "\n    *  7. Exit Point Menu      *"+
			  "\n    ****************************"+
			  "\nSelect an option (use integer value only): ");
        
                     while (!key.hasNextInt()) 
            {
            System.out.print("\nWRONG OPTION ...\n");
            
           System.out.print( "\n    ****************************"+
			     "\n    *        MENU Point        *"+
			     "\n    *  1. Moving By (frX, frY) *"+
                             "\n    *  2. Moving By X          *"+
                             "\n    *  3. Moving By Y          *"+
			     "\n    *  4. Flipping By Origin   *"+
                             "\n    *  5. Flipping By X        *"+
                             "\n    *  6. Flipping By Y        *"+
			     "\n    *  7. Exit Point Menu      *"+
			     "\n    ****************************"+
			     "\nSelect an option (use integer value only): ");
            key.next(); 
            }
		 option = key.nextInt();

		switch (option) {
		case 1:
                        System.out.println("\n  Original Point: ");
                        access.show();
                        access.moveBy(access.getX(), access.getY());
                        System.out.println("\n  After Point has moved "
                                + "by X and Y: ");
                        access.show();
		break;
		case 2:
                        System.out.println("\n  Original Point: ");
                        access.show();
                        access.moveByX(access.getX());
                        System.out.println("\n  After Point has moved by X: ");
                        access.show();
		break;
		case 3:
                        System.out.println("\n  Original Point: ");
                        access.show();
			access.moveByY(access.getY());
                        System.out.println("\n  After Point has moved by Y: ");
                        access.show();
		break;
		case 4:
                        System.out.println("\n  Original Point: ");
                        access.show();
                        access.flipThroughOrigin();
                        System.out.println("\n  After Point Flipped "
                                + "by origin: ");
                        access.show();
		break;
		case 5: 
                        System.out.println("\n  Original Point: ");
                        access.show();
                        access.flipByX();
                        System.out.println("\n  After Point Flipped by X: ");
                        access.show();
                break;
		case 6:
                        System.out.println("\n  Original Point: ");
                        access.show();
                        access.flipByY();
                        System.out.println("\n  After Point Flipped by Y: ");
                        access.show();
                break;
		default:
                    if (option <= 0 || option > 7) 
                    {
			System.out.println("\nWRONG OPTION ...");
                    }
		}

	} while (option != 7);
}
/**
 * The circleMenu creates two circle objects, finds their areas, 
 * compares theirs area, and checks if one circle is inside another circle.
 */ 
public static void circleMenu()
{
    final int SIX = 6;
    int n;
    int d;
    int option;
    //holds all fraction values for circle
    Fraction circleAry[] = new Fraction[SIX]; 
    Fraction areaHolderF = new Fraction();
    Fraction areaHolderS = new Fraction();
    Circle all = new Circle(); //create cirlce object 
    Circle all2 = new Circle(); //create circle object
    
    Scanner key = new Scanner(System.in);
   
    do {

	System.out.print( "\n    **********************************"+
			  "\n    *           CIRCLE MENU          *"+
			  "\n    *  1. Create Two Circle Objects  *"+
                          "\n    *  2. Compare By Area            *"+
                          "\n    *  3. Check Circle Containment   *"+
			  "\n    *  4. Exit Circle Menu           *"+
			  "\n    **********************************"+
			  "\n    Select an option (use integer value only): ");
        
            while (!key.hasNextInt()) 
            {
            System.out.print("\n      WRONG OPTION ...\n");
            
            System.out.print( "\n    **********************************"+
			      "\n    *           CIRCLE MENU          *"+
			      "\n    *  1. Create Two Circle Objects  *"+
                              "\n    *  2. Compare By Area            *"+
                              "\n    *  3. Check Circle Containment   *"+
			      "\n    *  4. Exit Circle Menu           *"+
			      "\n    **********************************"+
			      "\n    Select an option (use integer value only):"
                              + " ");
          
            key.next(); 
            }
		 option = key.nextInt();

		switch (option) {
		case 1:

		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

                circleAry[0] = new Fraction(n, d);
                
		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();
                
                circleAry[1] = new Fraction(n, d);
                
                System.out.printf("\n        Enter Radius Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Radius Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Radius Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Radius Denominator: ");
                key.next(); 
                }
		d = key.nextInt();
                
                circleAry[2] = new Fraction(n, d);
                //creates a point using Point class  
                Point po = new Point(circleAry[0],circleAry[1]);
                //creates a fraction using Fraction class  
                Fraction radi1 = new Fraction(circleAry[2]);
                //creates first object using circle object  
                all = new Circle(po, radi1);
                  
                all.showCircle();
                System.out.print("\n    Area: "); 
                all.circleArea().show();
                //holds the area of first object 
                areaHolderF = (all.circleArea());
                  
                //starting point for creating second object
   
                System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();

                circleAry[3] = new Fraction(n, d);

		System.out.printf("\n        Enter Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Denominator: ");
                key.next(); 
                }
		d = key.nextInt();
                
                circleAry[4] = new Fraction(n, d);
                
                System.out.printf("\n        Enter Radius Numberator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Radius Numberator: ");
                key.next(); 
                }
		n = key.nextInt();

		System.out.printf("\n        Enter Radius Denominator: ");
                
                while (!key.hasNextInt()) 
                {
                System.out.print("\n        WRONG OPTION ...\n");
                System.out.printf("\n        Enter Radius Denominator: ");
                key.next(); 
                }
		d = key.nextInt();
                
                circleAry[5] = new Fraction(n, d);
                //creates a point using Point class    
                Point p = new Point(circleAry[3],circleAry[4]);
                //creates a fraction using Fraction class    
                Fraction radi3 = new Fraction(circleAry[5]);
                //creates second object using circle object  
                all2 = new Circle(p, radi3);
                  
                all2.showCircle();
                   
                System.out.print("\n    Area: "); 
                all2.circleArea().show();
                //holds the area of second object 
                areaHolderS = (all2.circleArea());
              
		break;
		case 2:
                       
		if (circleAry[0] == null) 
                {
		 System.out.print("\n    Create first to compare --\n");
		} 
                else 
                {
		 System.out.print("\n    Comparing by area --\n");
                    
                    if (areaHolderF.lessThan(areaHolderS)) 
                    {

                    System.out.print("\n      First Circle area is less"+
                    " than second Circle area: \n");
                    areaHolderF.show();
                    System.out.print("\n       < ");
                    areaHolderS.show();

                    } 
                    else if (areaHolderF.greaterThan(areaHolderS)) 
                    {

                    System.out.print("\n      First Circle area is greater"+
                    " than second Circle area: \n");
                    areaHolderF.show();
                    System.out.print("\n       > ");
                    areaHolderS.show();
                    } 
                    else 
                    {

                    System.out.print("\n      Both Circle's areas are"+
                     " equal: \n");
                    areaHolderF.show();
                    System.out.print("\n       = ");
                    areaHolderS.show();
                    }
		}	
		break;
		case 3:
		
                if (circleAry[0] == null) 
                {
		 System.out.print("\n    Create first to Check Circle "
                         + "Containment --\n");
		} 
                else 
                {
		System.out.print("\n    Comparing by area --\n");
                    
                if (all.isContained(all2) == true) 
                {

		System.out.print("\n      One Circle is Contained inside "
                        + "another Circle\n");
                } 
                else 
                {
		System.out.print("\n      NONE of the Circles is inside "
                        + "another Circle\n");
		}
		}	
		break;
		default:
                    if (option <= 0 || option > 4) 
                    {
			System.out.println("\n      WRONG OPTION ...");
                    }
		}
	} while (option != 4);
}

} 
    
    