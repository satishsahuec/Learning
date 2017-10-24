import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeoutException;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	private final static String QUEUE_NAME = "tasks";

	public static void main(String[] args) throws IOException, TimeoutException {

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		
		Trade tradeData = new Trade(null, Side.BUY, 10, 100, new Date(), TradeStatus.OPEN, "Apple Inc", "AL",
				"bangalore");

		System.out.println(tradeData.toString());
		channel.basicPublish("", QUEUE_NAME, null, tradeData.toString().getBytes());
		System.out.println(" [x] Sent '" + tradeData + "'");
		channel.close();
		connection.close();
	}

}
