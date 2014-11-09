package kkonyshev.akka;

import org.checkerframework.checker.nullness.qual.NonNull;

import akka.actor.ActorRef;
import akka.actor.Actors;

/**
 * Hello world!
 *
 */
public class App 
{
	@NonNull
	Long k;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ActorRef testActor = Actors.actorOf(TestUntypedActor.class);
        testActor.start();
        for (int i=0;i<10;i++) {
        	if (i%2==0) {
        		new App().k.byteValue();
        	}
        	testActor.sendOneWay("eee");
        }
    }
}
