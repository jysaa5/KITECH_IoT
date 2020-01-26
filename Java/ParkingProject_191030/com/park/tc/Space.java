package com.park.tc;
import java.util.Date;

public class Space {
 Date date = new Date();
 
 String num = "";
 String name = "";
 String carNumber = "";
 String in = "";
 String out = "";
 public long intime = System.currentTimeMillis ();
 public long outtime = System.currentTimeMillis ();
 int charge = 0;

 
 public String getNum() {
  return num;
 }
 public void setNum(String num) {
  this.num = num;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getcarNumber() {
  return carNumber;
 }
 public void setcarNumber(String carNumber) {
  this.carNumber = carNumber;
 }
 public String getIn() {
  return in;
 }
 public void setIn(String in) {
  this.in = in;
 }
 public String getOut() {
  return out;
 }
 public void setOut(String out) {
  this.out = out;
 }
 public int getCharge() {
  return charge;
 }
 public void setCharge(int charge) {
  this.charge = charge;
 }
}
