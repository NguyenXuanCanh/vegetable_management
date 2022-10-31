public class Order
{
	private int _OrderID;
  private int _CustomerID;
  private java.sql.Date _Date;
  private float _Total;
  private String _Note;

	public int getOrderID()
	{
		return this._OrderID;
	}
	public void setOrderID(int value)
	{
		this._OrderID = value;
	}

	public int getCustomerID()
	{
		return this._CustomerID;
	}
	public void setCustomerID(int value)
	{
		this._CustomerID = value;
	}

	public java.sql.Date getDate()
	{
		return this._Date;
	}
	public void setDate(java.sql.Date value)
	{
		this._Date = value;
	}

	public float getTotal()
	{
		return this._Total;
	}
	public void setTotal(float value)
	{
		this._Total = value;
	}

	public String getNote()
	{
		return this._Note;
	}
	public void setNote(String value)
	{
		this._Note = value;
	}

	public Order(int OrderID_,int CustomerID_,java.sql.Date Date_,float Total_,String Note_)
	{
		this._OrderID = OrderID_;
		this._CustomerID = CustomerID_;
		this._Date = Date_;
		this._Total = Total_;
		this._Note = Note_;
	}
}