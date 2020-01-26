package com.park.tc;
import com.park.tc.State;
import java.util.Scanner;
import java.util.Date;

public class In {
 Date date = new Date(); 
 
 public In(){
 }
 void in(State state, Scanner s){
  int num = 0;
  String name = "";
  String carnumber = "";
     
  System.out.println("==============================================\n Select parking space number.");
     num = s.nextInt();
     if(num>=State.MAX) {
  	   System.out.println("No parking area");
     }
  if(state.box[num].getNum() != " ■ "){
   System.out.print("Name : ");
   name = s.next();
   
   System.out.print("Car number : ");
   carnumber = s.next();
  // for(int i=0; i<8; i++) {
//	   carnumber = equal.()
  // }
  
   
   state.box[num].setName(name);
   state.box[num].setcarNumber(carnumber);
   state.box[num].setNum(" ■ ");
   state.box[num].setIn(date.toString());
   state.box[num].intime = System.currentTimeMillis ();
   state.box[num].outtime = System.currentTimeMillis ();
   
   state.clear();
   state.clear();
   System.out.println(" ("+num+")set parking.");
 
  }//if 
  else{
   System.out.println("No parking area or Wrong Car number.");
   
  }//else
  state.print_state();
 }
}//class