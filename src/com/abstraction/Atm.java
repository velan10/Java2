package com.abstraction;    // class  6

	public class Atm extends Bank {
		
		@Override
		public void pin() {
			
			System.out.println("pin num is:1234");
			// TODO Auto-generated method stub
			
		}
		public static void main(String[] args) {
			
			Atm a = new Atm();
			a.accnum(1234567889);
			a.branch("porur");
			a.pin();
		
			
		}

	}


