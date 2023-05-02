package day2;


	 class Vehicle {
		
		public void run() {
			System.out.println("Vehicle is running");
		}
		}


		 class Bike extends Vehicle{
			public void runing(){
				System.out.println("Bike is running safely");
				}  
			

		}

		public class MethodOverRiding {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Bike obj = new Bike();//creating object  
				  obj.runing();//calling method 
				  obj.run();
			}

		}
 