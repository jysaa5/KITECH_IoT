package com.park.tc;

import java.util.Scanner;

import com.park.tc.Menu;

public class Main {
 
 public static void main(String[] args) {
  Menu menu = new Menu();
  Scanner temp = new Scanner(System.in);
  
  menu.play(temp);
 }
}