package kayak_map;

import java.awt.geom.Point2D;

public class MyPoint2D extends Point2D.Double {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyPoint2D (double x, double y) {
		
		super(x, y);
	}
	
	public static void main(String[] args) {
	MyPoint2D point = new MyPoint2D (25.0, 30.0);
	
	System.out.println(point.getX());
	
}

}

