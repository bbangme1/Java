package com.gg.object;

public class TvUser {

	public static void main(String[] args) {
		Tv tv = new Tv();
		RemoteController remote = new RemoteController(tv);

		remote.powerOnOf();
		remote.setChannel(14);
		remote.channelDown();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeUp();
		remote.powerOnOf();

	}

}
