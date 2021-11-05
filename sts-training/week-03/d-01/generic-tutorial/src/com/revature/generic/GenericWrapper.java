package com.revature.generic;

import java.util.List;

/*
 * <T> defines generic parameter
 */
public class GenericWrapper<T> {
	
	//generics provides a parameterized type
	private T value; //value here means any object
	
	//private T arr[]; //this is how to declare array
	
	private List<String> t;
	
	//parameterized constructor
	public GenericWrapper(T value) {
		this.value = value;
	}
	
	//default constructor
	public GenericWrapper() {}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@SuppressWarnings("unchecked")
	public T getValue() {
		//if( this.value.equals(null) ) { //failed
		if( this.value == null) {
			return (T)this.getValues();
		}
		return this.value;
	}
	
	public String toString(){
		return "[GenericWrapper] T = "+this.value;
	}

	public void setValue(List<String> t) {
		this.t = t;
	}
	
	public List<String> getValues() {
		return this.t;
	}
	
}
