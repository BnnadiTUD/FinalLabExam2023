package FinalOOSDLab;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class LoyaltyCardDriver here.
 *
 * Bryan Nnadi
 * C22469126
 */
public class LoyaltyCardDriver
{
    ArrayList<LoyaltyCard>list;

    public LoyaltyCardDriver()
    {
        list = new ArrayList<LoyaltyCard>();

        inputStudentAndPensioner();

        displayStudentAndPensioner();

        inputStandardCustomers();

        displayStandardCustomer();
        
        searchForVip();
    }

    public static void main (String[] args )
    {
        new LoyaltyCardDriver();
    }

    public void inputStudentAndPensioner()
    {
        int identificationNumber = 0;
        String customerName = " ";
        int totalNumberOfPoints = 0;
        boolean studentOrPensioner = true;
        String nameOfSchoolOrCollege = " ";

        LoyaltyCard customer1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input 3 students and 3 pensioners...");

        for (int count=1; count<=6; count++)
        {
            System.out.print("\nID number: ");
            identificationNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("\nCustmer Name: ");
            customerName = scan.nextLine();
            System.out.print("\nTotal Points: ");
            totalNumberOfPoints = scan.nextInt();
            scan.nextLine();
            while (true)
            { //this while loop makes sure that this detail is either true or false
                System.out.print("\nStudent or Pensioner: ");
                String type = scan.nextLine();
                if (type.equalsIgnoreCase("true")) 
                {
                    studentOrPensioner = true;
                    break;
                } else if (type.equalsIgnoreCase("false")) {
                    studentOrPensioner = false;
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input! Please enter either 'true' or 'false'");
                }
            }

            if(studentOrPensioner==true)
            {
                System.out.print("\nName of school/college: ");
                nameOfSchoolOrCollege = scan.nextLine();
            }
            else if (studentOrPensioner==false)
            {
                System.out.print("\nName of school/college: ");
                nameOfSchoolOrCollege = null;            
            }
            customer1 = new StudentAndPensionerLoyaltyCard (identificationNumber, customerName, totalNumberOfPoints, studentOrPensioner, nameOfSchoolOrCollege);
            list.add(customer1);
        }
    }

    public void displayStudentAndPensioner()
    {
        System.out.println("\n\nDisplay details for the students and pensioners");
        for (LoyaltyCard e : list)
        {
            System.out.println("\n" + e.toString());
        }
    }

    public void inputStandardCustomers()
    {
        System.out.println("\nAdding standard customers");

        StandardLoyalty s1 = new StandardLoyalty(10084, "Bryan Nnadi", 50, "12 Finglas Road", true);
        list.add(s1);

        StandardLoyalty s2 = new StandardLoyalty(10084, "Sean Gannon", 50, "13 Finglas Avenue", false);
        list.add(s2);
    }

    public void displayStandardCustomer()
    {
        System.out.println("\n\nDisplay details for the standard customers");
        for (LoyaltyCard s : list)
        {
            System.out.println("\n" + s.toString());
        }
    }

    public void searchForVip()
    {

        Scanner scan = new Scanner(System.in);

        boolean found;
        boolean vip = true;

        System.out.print("\nInput ID number for vip customer");

        int identificationNumber = scan.nextInt();

        StandardLoyalty s;
        for (LoyaltyCard v : list)
        {
            if (v instanceof StandardLoyalty)
            {
                s = (StandardLoyalty) v;
                if (identificationNumber==(v.getIdentificationNumber()))
                {
                    found = true;
                }
            }
        }
    }
}
 