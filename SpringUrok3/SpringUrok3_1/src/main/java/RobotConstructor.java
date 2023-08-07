import Sony.SonyHand;
import Sony.SonyHead;
import Sony.SonyLeg;
import interface_Urok3_1.Golova;

public class RobotConstructor {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand();
        SonyHead sonyHead = new SonyHead();
        SonyLeg sonyLeg = new SonyLeg();

        Robot robot = new Robot(sonyHead, sonyHand,sonyLeg);
        robot.action();
    }
}
