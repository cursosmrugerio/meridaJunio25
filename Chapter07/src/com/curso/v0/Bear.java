package com.curso.v0;

public class Bear {
	
	enum FOOD { 
		BERRIES{ 
			@Override
			public boolean isHealthy() { 
				return true; 
			}
		}, 
		INSECTS{ 
			@Override
			public boolean isHealthy() { 
				return false; 
			}
		}, 
		FISH{ 
			@Override
			public boolean isHealthy() { 
				return true; 
			}
		}, 
		ROOTS{ 
			@Override
			public boolean isHealthy() { 
				return false; 
			}
		}, 
		COOKIES{ 
			@Override
			public boolean isHealthy() { 
				return false; 
			}
		}, 
		HONEY{ 
			@Override
			public boolean isHealthy() { 
				return true; 
			}
		};
		
		public abstract boolean isHealthy();
	}

}
