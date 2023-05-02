package day4;
class One 
{ 
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
   } 
 } 
 class Two extends One 
{ 
  void m2() 
  { 
     System.out.println("m2 method in class Two"); 
   } 
 } 
public class UpcastingAndDowncasting 
{ 
  public static void main(String[] args) 
  { 
     One o = (One)new Two(); //upcasting
       o.m1(); 
   Two t=(Two)o;//downcasting
   t.m2();
   } 
 }


