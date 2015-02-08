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
   
    
      //testing "add" and "remove" methods
      //kayak.addRoute("Route 3");
      //System.out.println(kayak.listOfRoutes);
      //System.out.println(kayak.numberOfRoutes);
    
      //kayak.listOfRoutes.add("Route 4");
      //System.out.println(kayak.listOfRoutes);
      //System.out.println(kayak.numberOfRoutes);
        }
      //kayak.deleteRoute(0);
      //System.out.println(kayak.listOfRoutes);   
      //System.out.println(kayak.numberOfRoutes);
     
    
       }
  
  
    public ArrayList<String> getAllRoutes(){
        return this.listOfRoutes;
    }
  
    public boolean addRoute(String e){
        listOfRoutes.add(e);
        numberOfRoutes = numberOfRoutes + 1;
        return true;
      
    }
  
    public void deleteRoute(int index){
        listOfRoutes.remove(index);
        numberOfRoutes = numberOfRoutes - 1;
    }
  
    public void showAllRoutes(){
        Kayak_map kayak = new Kayak_map();
        ArrayList<String> fullList = kayak.getAllRoutes();
       
        for (int i=0; i<listOfRoutes.size(); i++){

        System.out.println(fullList.get(i));
      
          
        }
    }
   
}