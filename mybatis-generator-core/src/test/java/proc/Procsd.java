package proc;

public class Procsd {
	public static void main(String args[]){
		System.out.println("start");
		Generate test = new Generate();
		System.out.println("load");
		test.main1("generateConfiguration.xml");
	}
}
