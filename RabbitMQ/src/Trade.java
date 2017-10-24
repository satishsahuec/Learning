
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Trade {

	private String tradeId;

	private Side side;

	public Trade(String tradeId, Side side, int quantity, double price, Date tradeDate, TradeStatus status,
			String counterParty, String commodity, String location) {
		super();
		this.tradeId = tradeId;
		this.side = side;
		this.quantity = quantity;
		this.price = price;
		this.tradeDate = tradeDate;
		this.status = status;
		this.counterParty = counterParty;
		this.commodity = commodity;
		this.location = location;
	}

	private int quantity;
	private double price;
	private Date tradeDate;
	private TradeStatus status;

	private String counterParty;
	private String commodity;
	private String location;

	public String getCounterParty() {
		return counterParty;
	}

	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public TradeStatus getStatus() {
		return status;
	}

	public void setStatus(TradeStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", side=" + side + ", quantity=" + quantity + ", price=" + price
				+ ", tradeDate=" + tradeDate + ", status=" + status + ", counterParty=" + counterParty + ", commodity="
				+ commodity + ", location=" + location + "]";
	}



}
