package com.dp.singleton.lazy02;

import com.dp.singleton.lazy02.Singleton;

public class SingletonLazy02 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Lazy Loading, getInstance加入同步 執行緒安全 但效率太差");
		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}


class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}