package kayak_map;

import java.awt.geom.Point2D;

public class MyPoint2D extends Point2D.Double {



	MyPoint2D (double x, double y) {
		
		super(x, y);
		
		
	}
	
	public static void main(String[] args) {
	MyPoint2D point = new MyPoint2D (25.0, 30.0);
	
	System.out.println(point.getX());
	
}

   @Override
   public String toString (){
   return String.format ("(" + x + ", "+ y + ")");
}

}