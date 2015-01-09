
package kayak_map;

import java.util.ArrayList;


public class Kayak_map {

    private ArrayList<String> listOfRoutes;
    private int numberOfRoutes;
    
    public Kayak_map(){
    numberOfRoutes = 2;
    listOfRoutes = new ArrayList<String>(); 
    listOfRoutes.add(0, "Route 1"); 
    listOfRoutes.add(1, "Route 2");
    }
    
    public static void main(String[] args) {
        Kayak_map kayak = new Kayak_map();
        
        ArrayList<String> list = kayak.getAllRoutes(); 
      
        for (int i=0; i<2; i++){ 

       System.out.println(list.get(i));
       }
    }
    
    public ArrayList<String> getAllRoutes(){
        return this.listOfRoutes;
    }
      
      
       
     
}



