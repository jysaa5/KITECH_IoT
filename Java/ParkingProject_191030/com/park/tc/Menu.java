package com.park.tc;
import java.util.Scanner;
import com.park.tc.State;;

public class Menu {
 State state = new State();
 In in = new In();
 Out out = new Out();


 public Menu(){
 }
 
 public void play(Scanner s){
  state.clear();
  state.clear();
  System.out.println("  Menu  ");
  state.print_state();
  select(state, s);
 }
 
 public void select(State state, Scanner s){
    int l = 1;
    
    try {
     while(l != 4)
     { 
      System.out.println(" [1]in [2]out [3]Exit");
      l = s.nextInt();
      
      if(l==1){
       state.clear();
       state.clear();
       System.out.println("==============================================\n *  Park in  * ");
     state.print_state();
     in.in(state, s);
      }  
      else if(l==2){
       state.clear();
       state.clear();
       System.out.println("==============================================\n * Park out * ");
     state.print_state();
     out.out(state, s);
      }
      else if(l==3){
       state.clear();
       state.clear();
       System.out.println("==============================================\n *  Exit * ");
     break;
      }
      else{
       state.clear();
       System.out.println("==============================================\n * Selet number (1, 2, 3) * ");
      }
   }
    }
    catch (Exception e) {
     
    }
 }
}