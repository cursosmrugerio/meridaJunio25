package com.curso.v0;

public class Question05 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(); 
		
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		
		//01234
		//abbaccca
		
		System.out.println(sb);
		
		
	}

}
