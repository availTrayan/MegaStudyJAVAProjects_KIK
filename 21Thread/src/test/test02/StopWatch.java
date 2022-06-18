package test.test02;

public class StopWatch extends Thread {
	
	private boolean stop; // stop flag
	
    public void work(String command) {
    	
    	System.out.println("스탑와치 시작!!");
  
    	while(command.equals("시작")) {
    		
	    	this.run();
	    	
    	if(command.equals("그만")) {
    		
		    this.setStop(true);
		    }
    	}	
    }
    
    
	public void run(boolean stop) {
		
      	int timeCount = 0;
  	
        while (!stop) {
            // 무한 실행
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				timeCount++;
			}
        }
        System.out.println(timeCount);
    }
    

    public void setStop(boolean stop) {
    	
        this.stop = stop;
    }
	
	

}
