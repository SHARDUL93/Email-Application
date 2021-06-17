package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("John", "Wick");
		
//		em1.setAlternateEmail("jw@gmail.com");
//		System.out.println("Your alternate email is :"+em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());

	}

}
