package kayak_map;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


public class Route {
 
    private String routeName;
    private Point2D.Double startPoint;
    private Point2D.Double endPoint;
    private int numberOfObstacles;
    private List<Obstacle> listOfObstacles;


    public Route (String name, double startX, double startY, double endX, double endY){
     
        routeName = name;
        startPoint = new Point2D.Double(startX, startY);
        endPoint = new Point2D.Double (endX, endY);
        numberOfObstacles = 2;
        listOfObstacles = new ArrayList<Obstacle>();
        //listOfObstacles.add(0, 25, 45);

        }
 
    public static void main(String[] args) {
     
        Route route = new Route("Route 1", 20, 20, 45, 45);
      
      System.out.println(route.routeName);
     // route.moveStartPoint(30, 30);
     //System.out.println(route.getStartPoint()); 
     // route.moveEndPoint(50,  50);
     // System.out.println(route.getEndPoint());
     // route.changeRouteName("Missisipi");
     // System.out.println(route.getRouteName());
    }

    public void moveStartPoint (double newStartX, double newStartY){
    	this.startPoint = new Point2D.Double (newStartX, newStartY);
    }
    
    public Point2D.Double getStartPoint(){
    	return this.startPoint;
    }
    
    public void moveEndPoint (double newEndX, double newEndY){
    	this.endPoint = new Point2D.Double (newEndX, newEndY);
    }
    
    public Point2D.Double getEndPoint(){
    	return this.endPoint;
    }
    
    public void changeRouteName (String newRouteName){
    	this.routeName = newRouteName;
    }
    
    public String getRouteName(){
    	return this.routeName;
    }
}
