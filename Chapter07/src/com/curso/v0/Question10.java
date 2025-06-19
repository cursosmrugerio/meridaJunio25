package com.curso.v0;

import java.util.ArrayList;
import java.util.List;
import javax.management.relation.RoleList;

interface Walk {
	private static List move() { // JAVA9
		return null;
	}
}

class Leopard implements Walk {
	public Integer move() { // X
		return null;
	}
}

interface Run extends Walk {
	public ArrayList move();
}

class Panther implements Run {
	public ArrayList  move() { // Z
		return null;
	} 
}

public class Question10 {

}
