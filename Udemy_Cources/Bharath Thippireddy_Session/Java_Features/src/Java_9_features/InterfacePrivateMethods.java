package Java_9_features;

public interface InterfacePrivateMethods {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
	
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notifications");
	}

	private static void establishConnection() {
        System.out.println("Establishing a connection");		
	}
}
