

/**
 * Calculates and prints the distance between two points.
 * @author
 * @version
 * @date
 *
 */
public class DistanceFormula {
	/*
	 * SPECIFICATIONS:
	 * Distance Formula: d=square root((x1-x2)^2+(y1-y2)^2 ), where (x1,y1 )  and (x2,y2 ) are 
	 * the two ordered pairs. 
	 * Find the distance between (6, 7) and (-3, -2) using the distance formula. 
	 * For extra credit, round the distance to the nearest hundredth using java. 
	 * Print an additional statement to report the rounded distance.
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {
		double x1 = 6;
		double x2 = -3;
		double y1 = 7;
		double y2 = -2;
		double distance = 0.0;
		distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		String distanceString = String.format("The distance between the two points is: %.2f", distance);
		System.out.println(distanceString);
	}

}
