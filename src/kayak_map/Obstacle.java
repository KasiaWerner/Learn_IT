package kayak_map;

import java.awt.geom.Point2D;


public class Obstacle {

    private String obstacleName;
    private Point2D.Double obstaclePosition;
  
    public Obstacle (String name, double positionX, double positionY){
      
        obstacleName = name;
        obstaclePosition = new Point2D.Double(positionX, positionY);
      
    }
  
    public static void main(String[] args) {
      
        Obstacle rock = new Obstacle("Rock", 25, 45);
       
        rock.obstacleName.replaceAll("Rock", "Stone"); //testing replaceObstacleName method
        System.out.println(rock.obstacleName); //printed result: Rock
    }
   
    public String replaceObstacleName(String regex, String replacement){
        obstacleName.replaceAll(regex, replacement);
        return replacement;
    }
   

}