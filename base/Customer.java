public class Customers
{
	private int _CustomerID;
  private String _Password;
  private String _Fullname;
  private String _Address;
	private String _City;

	public int getCustomerID()
	{
		return this._CustomerID;
	}
	public void setCustomerID(int value)
	{
		this._CustomerID = value;
	}

	
	public String getPassword()
	{
		return this._Password;
	}
	public void setPassword(String value)
	{
		this._Password = value;
	}


	public String getFullname()
	{
		return this._Fullname;
	}
	public void setFullname(String value)
	{
		this._Fullname = value;
	}

	public String getAddress()
	{
		return this._Address;
	}
	public void setAddress(String value)
	{
		this._Address = value;
	}

	public String getCity()
	{
		return this._City;
	}
	public void setCity(String value)
	{
		this._City = value;
	}


	public Customers(int CustomerID_,String Password_,String Fullname_,String Address_,String City_)
	{
		this._CustomerID = CustomerID_;
		this._Password = Password_;
		this._Fullname = Fullname_;
		this._Address = Address_;
		this._City = City_;
	}
}