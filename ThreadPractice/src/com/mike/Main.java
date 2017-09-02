package com.mike;

public class Main {

	
	/*
	 * thread is the smallest unit of execution that can be scheduled by the operating system.
	 * single-thread process - contains exactly one thread
	 * multi-threaded process - contains one or more threads
	 * shared environment - threads in the same process share the same memory space and communicate
	 * 						with one another
	 * 
	 * threads contain a task - smallest unit of work performed by a thread.
	 * 
	 * jvm creates system threads that run behind the scenes
	 * 		e.g. garbage collection
	 * 
	 * main method is a user defined thread
	 * 
	 * concurrency - executing multiple threads and processes at the same time.
	 */
	public static void main(String[] args) {

		RunnableDemo r1 = new RunnableDemo("Thread1");
		RunnableDemo r2 = new RunnableDemo("Thread2");
		r1.start();
		r2.start();
	}

}
