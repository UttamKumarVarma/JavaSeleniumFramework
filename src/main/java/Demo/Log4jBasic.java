package Demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jBasic {
	
	static Logger logger= LogManager.getLogger(Log4jBasic.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		
		System.out.println("Completed");

	}

}
