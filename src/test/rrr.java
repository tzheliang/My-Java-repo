import java.util.*;
public class rrr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total, difference, product, quotient, remainder;
        System.out.print("Enter integer 1: ");
        int int1 = sc.nextInt();
        System.out.print("Enter integer 2: ");
        int int2 = sc.nextInt();
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("Press");
        System.out.println("+ for total");
        System.out.println("- for difference");
        System.out.println("* for product");
        System.out.println("/ for qoutient");
        System.out.println("% for remainder");
        System.out.println("M for larger integer");
        System.out.println("m for smaller integer");
        System.out.println("");
        System.out.print("Your choice? ");
        char choice = sc.next().charAt(0);
        switch (choice)
        {
            case '+':
                total = int1 + int2;
                System.out.println("Total: " + total);
                break;
            case '-':
                int1 = int2;
                difference = int1 - int2;
                System.out.println("Difference: " + difference);
                break;
            case '*':
                product = int1 * int2;
                System.out.println("Product: " + product);
                break;
            case '/':
                if(int2 != 0)
                {
                    quotient = int1 / int2;
                    System.out.println("Quotient: " + quotient);
                }
                else
                {
                    System.out.println("Integer 2 cannot be 0!");
                }
                break;
            case '%':
                if(int2 != 0)
                {
                    remainder = int1 / int2;
                    System.out.println("Remainder: " + remainder);
                }
                else
                {
                    System.out.println("Integer 2 cannot be 0!");
                }
                break;
            case 'M':
                if (int1 > int2)
                {
                    System.out.println("Larger: " + int1);
                }
                else if (int1 < int2)
                {
                    System.out.println("Larger: " + int2);
                }
                else
                {
                    System.out.println("Both integers cannot be compared which is larger");
                }
                break;
            case 'm':
                if (int1 < int2)
                {
                    System.out.println("Smaller: " + int1);
                }
                else if (int1 > int2)
                {
                    System.out.println("Smaller: " + int2);
                }
                else
                {
                    System.out.println("Both integers cannot be compared which is smaller");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                System.out.println("Integers entered: " + int1 + ", " + int2);
                break;
                
        }
    }
}