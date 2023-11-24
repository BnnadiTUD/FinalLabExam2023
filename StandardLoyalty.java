package FinalOOSDLab;


/**
 * Write a description of class StandardLoyalty here.
 *
* Bryan Nnadi
 * C22469126
 */
public class StandardLoyalty extends LoyaltyCard
{
    public String addressOfCoffeeOutlet;
    public boolean vip;

    public StandardLoyalty()
    {
        super();
        this.addressOfCoffeeOutlet = " ";
        this.vip = true;
    }

    public StandardLoyalty(int identificationNumber,  String customerName, int totalNumberOfPoints, String addressOfCoffeeOutlet, boolean vip)
    {
        super(identificationNumber, customerName, totalNumberOfPoints );
        this.addressOfCoffeeOutlet = addressOfCoffeeOutlet ;
        this.vip = vip;
    }

    public String getAddressOfCoffeeOutlet()
    {
        return this.addressOfCoffeeOutlet;
    }

    public boolean getVip()
    {
        return this.vip;
    }

    public void setAddressOfCoffeeOutlet(String addressOfCoffeeOutlet)
    {
        this.addressOfCoffeeOutlet = addressOfCoffeeOutlet ;
    }

    public void setVip(boolean vip)
    {
        this.vip = vip;
    }
    
    public boolean isAVip()
    {
        boolean vip;
        if (this.vip==true)
        {
            vip = true; 
        }
        else
        {
         vip = false;  
        }
        return vip;
    }
    
    public String toString()
    {
        String result = "";
        result = super.toString() + 
        "\nAddress of Coffee Outlet: " + this.addressOfCoffeeOutlet +
        "\nVip/Not VIP: " + this.vip;
        if (this.vip==true)
        {
            result = result + "\nVip\n";
        }
        else if (this.vip==false)
        {
            result = result + "\nVip\n";
        }
        return result;
    }
}
