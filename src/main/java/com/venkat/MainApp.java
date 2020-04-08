package com.venkat;

public class MainApp {

	public static void main(String[] args) {

		Subject channel = new Channel();

		Subscriber sub1 = new Subscriber("venkat");
		Subscriber sub2 = new Subscriber("raj");
		Subscriber sub3 = new Subscriber("kumar");

	
		channel.subscribe(sub1);
		channel.subscribe(sub2);
		channel.subscribe(sub3);

		//channel.unSubscribe(sub3);
		
		sub1.subscribeChannel(channel);
		sub2.subscribeChannel(channel);
		sub3.subscribeChannel(channel);

		channel.upload("javafun");

	}

}
