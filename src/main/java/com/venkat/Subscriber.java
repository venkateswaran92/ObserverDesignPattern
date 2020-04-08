package com.venkat;

public class Subscriber implements Observer {

	private String name;
	private Subject channel = new Channel();

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void uplodaed() {
		System.out.println("hey " + name + ":" + "uploaded...");
	}

	@Override
	public void subscribeChannel(Subject channel) {
		this.channel = channel;

	}

}
