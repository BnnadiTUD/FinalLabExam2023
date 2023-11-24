package FinalOOSDLab;


/**
 * Write a description of class LoyaltyCard here.
 *
* Bryan Nnadi
 * C22469126
 */
public class LoyaltyCard
{
    public int identificationNumber;
    public String customerName;
    public int totalNumberOfPoints;
    
    public LoyaltyCard()
    {
        this.identificationNumber = 0;
        this.customerName = " ";
        this.totalNumberOfPoints = 0;
    }
    
    public LoyaltyCard(int identificationNumber,  String customerName, int totalNumberOfPoints)
    {
        this.identificationNumber = identificationNumber;
        this.customerName = customerName;
        this.totalNumberOfPoints = totalNumberOfPoints;
    }
    
    public int getIdentificationNumber()
    {
        return this.identificationNumber;
    }
    
    public String getCustomerName()
    {
        return this.customerName;
    }
    
    public int getTotalNumberOfPoints()
    {
        return this.totalNumberOfPoints;
    }
    
    public void setIdentificationNumber(int identificationNumber)
    {
        this.identificationNumber = identificationNumber;
    }
    
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    
    public void setTotalNumberOfPoints(int totalNumberOfPoints)
    {
        this.totalNumberOfPoints = totalNumberOfPoints;
    }
    
    public String toString()
    {
        return "\nID Number: " + this.identificationNumber
        + "\nCustomer Name: " + this.customerName
        + "\nTotal Number Of Points: " + this.totalNumberOfPoints;
    }
}
