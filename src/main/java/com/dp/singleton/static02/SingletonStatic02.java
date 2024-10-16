package com.dp.singleton.static02;

import com.dp.singleton.static02.Singleton;

public class SingletonStatic02 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("可用 執行緒安全 non-lazyLoading");
		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}

class Singleton {

	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
