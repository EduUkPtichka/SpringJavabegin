package StartV1;

import interface_Urok5.Hand;
import interface_Urok5.Head;
import interface_Urok5.Leg;
import interface_Urok5.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000(){
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    @Override
    public void fire() {
        hand.handGo();
        head.headGo();
        leg.legGo();

    }

    @Override
    public void dance() {
        System.out.println("Танцы танцы, робот танцует!");

    }
}
