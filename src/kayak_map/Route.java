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
      
      
     
     
    }

}