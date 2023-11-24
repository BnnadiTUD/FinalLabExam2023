package FinalOOSDLab;


/**
 * Write a description of class StudentAndPensionerLoyaltyCard here.
 *
 * Bryan Nnadi
 * C22469126
 */
public class StudentAndPensionerLoyaltyCard extends LoyaltyCard
{
    public boolean studentOrPensioner;
    public String nameOfSchoolOrCollege;
    
    public StudentAndPensionerLoyaltyCard()
    {
        super();
        this.studentOrPensioner = true;
        this.nameOfSchoolOrCollege = " ";
    }
    
    public StudentAndPensionerLoyaltyCard(int identificationNumber,  String customerName, int totalNumberOfPoints, boolean studentOrPensioner, String nameOfSchoolOrCollege)
    {
        super(identificationNumber, customerName, totalNumberOfPoints );
        this.studentOrPensioner = studentOrPensioner;
        this.nameOfSchoolOrCollege = nameOfSchoolOrCollege;
    }
    
    public boolean getStudentOrPensioner()
    {
        return this.studentOrPensioner;
    }
    
    public String getNameOfSchoolOrCollege()
    {
        return this.nameOfSchoolOrCollege;
    }
    
    public void setStudentOrPensioner(boolean studentOrPensioner)
    {
        this.studentOrPensioner = studentOrPensioner;
    }
    
    public void  getNameOfSchoolOrCollege(String nameOfSchoolOrCollege)
    {
        this.nameOfSchoolOrCollege = nameOfSchoolOrCollege;
    }
    
    public String toString()
    {
        String result = "";
        result = super.toString() +
        "\nStudent/Pensioner = " + this.studentOrPensioner
        + "\nSchool/College" + this.nameOfSchoolOrCollege;
        if (this.studentOrPensioner==true)
        {
            result = result + "\nStudent\n";
        }
        else if (this.studentOrPensioner==false)
        {
            result = result + "\nPensioner\n";
        }

        return result;
    }
    
    public boolean isAStudentorPensioner()
    {
        boolean studentOrPensioner;
        if (this.studentOrPensioner==true)
        {
            studentOrPensioner = true; 
        }
        else
        {
         studentOrPensioner = false;  
        }
        return studentOrPensioner;
    }
}
