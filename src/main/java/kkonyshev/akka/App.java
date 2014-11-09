package kkonyshev.akka;

import akka.actor.ActorRef;
import akka.actor.Actors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ActorRef testActor = Actors.actorOf(TestUntypedActor.class);
        testActor.start();
        for (int i=0;i<10;i++) {
        	testActor.sendOneWay("eee");
        }
    }
}
