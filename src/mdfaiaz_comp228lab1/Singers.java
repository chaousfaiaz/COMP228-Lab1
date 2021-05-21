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
import java.util.*;
public class Singers {
    
//Instance Variables
        int Singer_id;
	String Singer_name;
	String Singer_address;
	int Dateofbirth;
          int Albumspublished;
                
                //Various Constructors that can be used to Build Singer Class
        public Singers(){}
                
    public Singers(int singer_id, int dateofbirth, String singer_name, String singer_address, int albumpublished){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
       Singer_name = singer_name;
       Singer_address = singer_address;
       Albumspublished = albumpublished;
        
    }            
       public Singers(int singer_id, int dateofbirth, String singer_name, String singer_address){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
       Singer_name = singer_name;
       Singer_address = singer_address;
      
        
    } 
       public Singers(int singer_id, int dateofbirth, String singer_name,  int albumpublished){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
       Singer_name = singer_name;
       
       Albumspublished = albumpublished;
        
    }     
       public Singers(int singer_id, String singer_address, int dateofbirth, int albumpublished){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
      
       Singer_address = singer_address;
       Albumspublished = albumpublished;
        
    }  
       public Singers(int singer_id,  int dateofbirth, int albumpublished){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
      
       Albumspublished = albumpublished;
        
    }  
        public Singers( String singer_name, String singer_address){
      
       Singer_name = singer_name;
       Singer_address = singer_address;
     
        
    }    
      
        
        public Singers(int singer_id, int dateofbirth, String singer_name){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
       Singer_name = singer_name;
        }
      public Singers(int singer_id, int dateofbirth){
       Singer_id = singer_id;
       Dateofbirth = dateofbirth;
      
        }
       public Singers(int singer_id){
       Singer_id = singer_id;
      
        }
      
       
        public Singers(String singer_name){
     
       Singer_name = singer_name;
        }
        
    // Getter for singers id
  public int getSingerid() {
    return Singer_id;
  }
  
  // Setter for singers id
  public void setSingerid(int value) {
   Singer_id = value;
  }

// Getter for singers name
  public String getSingerName() {
    return Singer_name;
  }
  
  // Setter of singers name
  public void setSingerName(String value) {
   Singer_name = value;
  }
    // Getter for date of birth
  public int getDateOfBirth() {
    return Dateofbirth;
  }
  
  // Setter for date of birth
  public void setDateofbirth(int value) {
   Dateofbirth = value;
  }

// Getter for singer address
  public String getSingerAdress() {
    return Singer_address;
  }
  
  // Setter for singer address
  public void setSingerAddress(String value) {
   Singer_address = value;
  }
  // Getter for date of birth
  public int getSingerAlbum() {
    return Albumspublished;
  }
  
  // Setter for date of birth
  public void setAlbumPublished(int value) {
   Albumspublished = value;
  }
  
  
  
}
      
        
       

