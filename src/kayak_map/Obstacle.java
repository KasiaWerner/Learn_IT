package kayak_map;

//import java.awt.geom.Point2D;


public class Obstacle {
    private String obstacleName;
    private MyPoint2D obstaclePosition;
   
    public Obstacle (String name, double positionX, double positionY){
        obstacleName = name;
        obstaclePosition = new MyPoint2D(positionX, positionY);
    }

    public static void main(String[] args) {
        Obstacle rock = new Obstacle("Rock", 25, 45);
        
        rock.changeName("Stone");
       
        System.out.println(rock.getName());
       
        rock.setLocation(32.0, 78.0);
       
        System.out.println(rock.getPosition());
        
    }
    public void changeName(String newName) {
        this.obstacleName = newName;
    }

    public String getName(){
        return this.obstacleName;
    }
   
    public void setLocation(double newPositionX, double newPositionY){
        this.obstaclePosition = new MyPoint2D (newPositionX, newPositionY);
    }
   
    public MyPoint2D getPosition(){  
        return this.obstaclePosition;
    }
    
	@Override
    public String toString (){
    	return String.format (obstacleName +" " + obstaclePosition);
    	
	}	
}