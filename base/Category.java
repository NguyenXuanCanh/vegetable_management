package Base;

public class Category
{
    private int _CatagoryID;
    private String _Name;
    private String _Description;
    
    public int getCatagoryID()
    {
        return this._CatagoryID;
    }
    public void setCatagoryID(int value)
    {
        this._CatagoryID = value;
    }

    public String getName()
    {
        return this._Name;
    }
    public void setName(String value)
    {
        this._Name = value;
    }
    
    public String getDescription()
    {
        return this._Description;
    }
    public void setDescription(String value)
    {
        this._Description = value;
    }


    public Category(int CatagoryID_,String Name_,String Description_)
    {
        this._CatagoryID = CatagoryID_;
        this._Name = Name_;
        this._Description = Description_;
    }
}