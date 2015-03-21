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
       
        //Then, in the main method:
           
        rock.changeName("Stone");

        System.out.println(rock.getName()); 
      
    }
  
    public void changeName(String newName) {
        this.obstacleName = newName;
}
    
    public String getName(){
    	return this.obstacleName;
    }
    }