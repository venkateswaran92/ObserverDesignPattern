package com.venkat;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	public List<Subscriber> subscriberList = new ArrayList<>();
	private String title;

	@Override
	public void subscribe(Subscriber sub) {
		subscriberList.add(sub);
	};

	@Override
	public void unSubscribe(Observer sub) {
		subscriberList.remove(sub);
	}

	@Override
	public void notifySub() {
		subscriberList.forEach(subs -> subs.uplodaed());
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySub();
	}

}
