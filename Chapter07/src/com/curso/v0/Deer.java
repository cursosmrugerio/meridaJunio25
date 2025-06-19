package com.curso.v0;

public class Deer {
	//static
	enum Food {
		APPLES, BERRIES, GRASS
	}

	protected class Diet {
		private Food getFavorite() {
			return Food.BERRIES;
		}
	}

	public static void main(String[] seasons) {
		System.out.print(switch (new Deer().new Diet().getFavorite()) {
		case APPLES -> "a";
		case BERRIES -> "b";
		//case GRASS -> "c"; 
		default -> "c";
		});
	}
}