public class Robot {
    private SonyHand hand = new SonyHand(); //Рука
    private SonyLeg leg = new SonyLeg(); //Нога
    private SonyHead head = new SonyHead(); //Голова

    public void action(){
        hand.ruka();
        leg.nogi();
        head.golova();
    }
}
