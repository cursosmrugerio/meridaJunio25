package com.curso.v0;

public class Question7 {

	public static void main(String[] args) {
		int[] weather = { 1, 2, 3, 4, 5 };
		print(weather);
	}

	static private void print(int[] weather) {
		for (int i=0; i++<10 && i<weather.length;) {
			System.out.println(weather[--i]);
		}
	}
	
//	static private void print(int[] weather) {
//		for (int i=0, j=3; i<weather.length; ++i) {
//			System.out.println(weather[i]);
//		}
//	}
	
	
//	static private void print(int[] weather) { 
//	for(int i=weather.length-1; i>=0; i--){ 
//		System.out.println(weather[i]); 
//	} 
	

//	static private void print(int[] weather) { 
//		for(int w : weather ){ 
//			System.out.println(w);
//		} 
//	}

//	static private void print(int[] weather) { 
//		for(int i=0; i<=weather.length-1; ++i ){ 
//			System.out.println(weather[i]); 
//		} 
//	}

//	static private void print(int[] weather) { 
//		for(int i=weather.length; i>0; i-- ){ 
//			System.out.println(weather[i]); //ArrayIndexOutOfBoundsException
//		} 
//	}

}
