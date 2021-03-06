package kayak_map;

//import java.awt.geom.Point2D;
import java.util.ArrayList;


public class Route {
 
    private String routeName;
    private MyPoint2D startPoint;
    private MyPoint2D endPoint;
    private int numberOfObstacles;
    private ArrayList<Obstacle> listOfObstacles;


    public Route (String name, double startX, double startY, double endX, double endY){
     
        routeName = name;
        startPoint = new MyPoint2D(startX, startY);
        endPoint = new MyPoint2D (endX, endY);
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
      
      //route.deleteObstacle("Rock", 22, 24);
      
      ArrayList<Obstacle> list = route.getAllObstacles();
      
      for (int i=0; i<2; i++){

     System.out.println(list.get(i));
     
    
      } 
      
    }

    public void moveStartPoint (double newStartX, double newStartY){
    	this.startPoint = new MyPoint2D (newStartX, newStartY);
    }
    
    public MyPoint2D getStartPoint(){
    	return this.startPoint;
    }
    
    public void moveEndPoint (double newEndX, double newEndY){
    	this.endPoint = new MyPoint2D (newEndX, newEndY);
    }
    
    public MyPoint2D getEndPoint(){
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
    
    
   public boolean deleteObstacle (String name, double positionX, double positionY){
    listOfObstacles.remove (Obstacle );
    return true;
    
    	numberOfObstacles = numberOfObstacles - 1; 
    }
    

	public ArrayList<Obstacle> getAllObstacles(){
        return this.listOfObstacles;
        
    }
    

}
