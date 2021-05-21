/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdfaiaz_comp228lab1;

/**
 *
 * @author faiaz
 */

public class MDFaiaz_COMP228Lab1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Singers singer1 = new Singers();//created new singer1 object
        
        System.out.println("Default Values of Singer1 is " + singer1);
         System.out.println("Default Values of Singer1 name is " + singer1.Singer_name);
          System.out.println("Default Values of Singer1 address is " + singer1.Singer_address);
           System.out.println("Default Values of Singer1 singer id is " + singer1.Singer_id);
            System.out.println("Default Values of Singer1's Date of birth is " + singer1.Dateofbirth);
             System.out.println("Default Values of Singer1's album published is " + singer1.Albumspublished);
         //using setters to set values in Singer1
         singer1.setSingerName("Marina Gerges");
         singer1.setAlbumPublished(50);
        singer1.setDateofbirth(19941102);
        singer1.setSingerAddress("North York");
        singer1.setSingerid(500884458);
        System.out.println(" Values of Singer1 is " + singer1);
         System.out.println(" Values of Singer1 name is " + singer1.getSingerName());
          System.out.println(" Values of Singer1 address is " + singer1.getSingerAlbum());
           System.out.println(" Values of Singer1 singer id is " + singer1.getSingerAdress());
            System.out.println(" Values of Singer1's Date of birth is " + singer1.getSingerid());
             System.out.println(" Values of Singer1's album published is " + singer1.getSingerAlbum());
    }
    
}
