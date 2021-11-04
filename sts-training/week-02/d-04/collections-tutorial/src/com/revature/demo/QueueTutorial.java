package com.revature.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorial {
	public static void queueDemo() {
		/*
		 * Queue adheres to real-life line
		 * 1. follows FIFO (first-in-first-out)
		 * 2. first-come-first-served
		 */
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("1st");
		queue.add("2nd");
		queue.add("3rd");
		
		String element = queue.poll();
		System.out.println(element); 	 //1st
		
		System.out.println(queue.poll()); //2nd
		System.out.println(queue.poll()); //3rd
		System.out.println(queue.poll()); //null
	}
}
