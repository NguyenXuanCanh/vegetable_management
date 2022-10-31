public class Vegetable
{
	private int _VegetableID;
	private int _CatagoryID;
	private String _VegetableName;
	private String _Unit;
	private int _Amount;
	private String _Image;
	private float _Price;
  
	public int getVegetableID()
	{
		return this._VegetableID;
	}
	public void setVegetableID(int value)
	{
		this._VegetableID = value;
	}

	public int getCatagoryID()
	{
		return this._CatagoryID;
	}
	public void setCatagoryID(int value)
	{
		this._CatagoryID = value;
	}

	public String getVegetableName()
	{
		return this._VegetableName;
	}
	public void setVegetableName(String value)
	{
		this._VegetableName = value;
	}

	public String getUnit()
	{
		return this._Unit;
	}
	public void setUnit(String value)
	{
		this._Unit = value;
	}

	public int getAmount()
	{
		return this._Amount;
	}
	public void setAmount(int value)
	{
		this._Amount = value;
	}

	public String getImage()
	{
		return this._Image;
	}
	public void setImage(String value)
	{
		this._Image = value;
	}

	public float getPrice()
	{
		return this._Price;
	}
	public void setPrice(float value)
	{
		this._Price = value;
	}


	public Vegetable(int VegetableID_,int CatagoryID_,String VegetableName_,String Unit_,int Amount_,String Image_,float Price_)
	{
		this._VegetableID = VegetableID_;
		this._CatagoryID = CatagoryID_;
		this._VegetableName = VegetableName_;
		this._Unit = Unit_;
		this._Amount = Amount_;
		this._Image = Image_;
		this._Price = Price_;
	}
}