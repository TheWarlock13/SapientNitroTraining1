package mainpack;
import java.util.logging.Logger;

class Area {
	  public static void main(String args[]) {
	    double pie, radius, area; 
	    
	    Logger Log = Logger.getLogger(Area.class.getName());

	    radius = 10.8; // radius of circle
	    pie = 3.1416; // pi, approximately
	    area = pie * radius * radius; // compute area

	    Log.("Area of circle is " + area);
	  }
	}