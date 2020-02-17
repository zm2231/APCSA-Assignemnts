//**********************************************
// BandBooster.java
// Zain Merchant
// 12/5/2019
//**********************************************

public class BandBooster
{
    private String name;
    private int boxesSold;
    
    public BandBooster(String booster)
    {
        name = booster;
        boxesSold = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void updateSales(int boxes)
    {
        boxesSold += boxes;
    }
    
    public String toString()
    {
        return name + ":\t" + boxesSold + " boxes"; 
    }
}
