public class OrderDetail
{
	private int _OrderID;
  private int _VegetableID;
  private byte _Quantity;
  private float _Price;

	public int getOrderID()
	{
		return this._OrderID;
	}
	public void setOrderID(int value)
	{
		this._OrderID = value;
	}

	
	public int getVegetableID()
	{
		return this._VegetableID;
	}
	public void setVegetableID(int value)
	{
		this._VegetableID = value;
	}

	
	public byte getQuantity()
	{
		return this._Quantity;
	}
	public void setQuantity(byte value)
	{
		this._Quantity = value;
	}

	
	public float getPrice()
	{
		return this._Price;
	}
	public void setPrice(float value)
	{
		this._Price = value;
	}


	public OrderDetail(int OrderID_,int VegetableID_,byte Quantity_,float Price_)
	{
		this._OrderID = OrderID_;
		this._VegetableID = VegetableID_;
		this._Quantity = Quantity_;
		this._Price = Price_;
	}
}