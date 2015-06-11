package kayak_map;

import java.awt.geom.Point2D;
import java.util.ArrayList;


public class Route {
 
    private String routeName;
    private Point2D.Double startPoint;
    private Point2D.Double endPoint;
    private int numberOfObstacles;
    private ArrayList<Obstacle> listOfObstacles;


    public Route (String name, double startX, double startY, double endX, double endY){
     
        routeName = name;
        startPoint = new Point2D.Double(startX, startY);
        endPoint = new Point2D.Double (endX, endY);
        numberOfObstacles = 0;
        listOfObstacles = new ArrayList<Obstacle>();

        }
 
    public static void main(String[] args) {
     
        Route route = new Route("Route 1", 20, 20, 45, 45);
      
      //System.out.println(route.routeName);
     // route.moveStartPoint(30, 30);
     //System.out.println(route.getStartPoint()); 
     // route.moveEndPoint(50,  50);
     // System.out.println(route.getEndPoint());
     //route.changeRouteName("Missisipi");
     //System.out.println(route.getRouteName());
      
      route.addObstacle("Rock", 22, 24);
      route.addObstacle("Tree", 27.1, 25.3);
      System.out.println(route.numberOfObstacles);
      
      ArrayList<Obstacle> list = route.getAllObstacles();
      
      for (int i=0; i<2; i++){

     System.out.println(list.get(i));
    
      } 
      
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
    
    
    public void addObstacle(String name, double positionX, double positionY){
        listOfObstacles.add (new Obstacle (name, positionX, positionY));
        numberOfObstacles = numberOfObstacles + 1;
        
    }
    
   // public void deleteObstacle (String name, double positionX, double positionY){
    	//listOfObstacles.remove (name, positionX, positionY);
    	//numberOfObstacles = numberOfObstacles - 1; //how to remove specific element, when I don't want to use its index?
    //}
    
    public ArrayList<Obstacle> getAllObstacles(){
        return this.listOfObstacles;
        
    }
    
    @Override
    public String toString (){
    	return obstacleName + obstaclePostion;
    }
}
