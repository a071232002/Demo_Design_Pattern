package com.dp.singleton.static03;

import com.dp.singleton.static03.Singleton;

public class SingletonStatic03 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("static inner class, Initialization-on-Demand Holder Idiom");
		System.out.println("推薦使用 執行緒安全 lazyLoading");

		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}

class Singleton {

	private Singleton() {
	}
	
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}