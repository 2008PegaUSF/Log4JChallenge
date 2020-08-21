import org.apache.log4j.PropertyConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger; 

public class HelloWorld {
	private static final Logger logger= LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Hello World");
		logger.info("we are in logger info mode");
	}
	

}


