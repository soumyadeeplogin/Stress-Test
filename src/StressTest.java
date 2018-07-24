import java.util.Calendar;

public class StressTest {
	
	static boolean terminate = false;
	
	public static void main(String[] args) {
		System.out.println("Started");
		String time = args[0];
		
		int count = Runtime.getRuntime().availableProcessors();
		for (int i = 0; i < count; i++) {
			Calendar terminateDate = Calendar.getInstance();
			terminateDate.add(Calendar.SECOND, Integer.parseInt(time));
			new Thread(new Runnable() {
                public void run() {
                    while (Calendar.getInstance().getTime().before(terminateDate.getTime())){
                    }
                    System.out.println("terminated ");
                }
            }).start();
        }
		
		
	}

}
