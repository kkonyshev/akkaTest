package kkonyshev.akka;

import akka.actor.UntypedActor;

public class TestUntypedActor extends UntypedActor {

	public void onReceive(Object message) throws Exception {
		if (message instanceof Long) {
			System.out.println("We've got super message - " + message);
		} else if (message instanceof String) {
			System.out.println("Process string - " + message);
		}
	}
}