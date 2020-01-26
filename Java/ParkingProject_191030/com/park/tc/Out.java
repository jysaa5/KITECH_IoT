package com.park.tc;
import com.park.tc.State;
import java.util.Scanner;
import java.util.Date;

public class Out { 
 public Out(){
 }
 void out(State state, Scanner s){
  int num = 0;
     
  System.out.println("==============================================\n Select space number ");
     num = s.nextInt();
     
     try {
   if(state.box[num].getNum() == " ■ "){
    Date date = new Date();
    state.box[num].setOut(date.toString());
    state.box[num].outtime = System.currentTimeMillis ();
  
    
    state.clear();
    state.clear();
    System.out.println(" ("+num+") space park out");

    state.charge_inform(num);
    state.init(num);
   }
   else{
    System.out.println("Already parked out or Wrong number");
   }
  } catch (Exception e) {
   
  }
  state.print_state();
 }
}