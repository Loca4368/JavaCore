package com.generic;

import java.util.ArrayList;

public class Container<E, T> {

	private ArrayList<E> collectorA;
	private ArrayList<T> collectorB;

	public Container() {
		this.collectorA = new ArrayList<E>();
		this.collectorB = new ArrayList<T>();
	}

	public void add(E e1, T t1) {
		this.collectorA.add(e1);
		this.collectorB.add(t1);
	}

	public ArrayList<E> getCollectorA() {
		return collectorA;
	}

	public ArrayList<T> getCollectorB() {
		return collectorB;
	}

}
