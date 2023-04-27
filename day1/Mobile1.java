package week1.day1;

public class Mobile1 {
	
	public void makeCall() {
		String mobileModel = "Oppo";
		float mobileWeight = 6.2f;
		System.out.println("Mobile Specifications");
		System.out.println("Model : "+mobileModel);
        System.out.println("Weigh : "+mobileWeight);
	}
	
	void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 15000;
		System.out.println("Mobile Details");
		System.out.println("Is mobile full charged? "+isFullCharged);
		System.out.println("Price of the mobile "+mobileCost);
	}

	public static void main(String[] args) {
         Mobile1 obj = new Mobile1();
         System.out.println("This is my mobile and below are the details.");
         obj.makeCall();
         obj.sendMsg();
	}

}