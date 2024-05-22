package com.softserve.edu08_nest.inner;

class Entity {
	
	private static class Counter {
		private void addCount() {
			count = count + 1;
		}
	}
	
	//---------------------------------------------
	
	private static int count = 0;
	private static Counter counter;

	static {
		counter = new Counter();
		System.out.println("static block done");
	}

	public Entity() {
		// new Counter().setCount();
		counter.addCount();
		System.out.println("Entity() constructor done");
	}

	public int getCount() {
		return count;
	}

}
