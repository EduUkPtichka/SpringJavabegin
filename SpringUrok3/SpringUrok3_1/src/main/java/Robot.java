import interface_Urok3_1.Golova;
import interface_Urok3_1.Noga;
import interface_Urok3_1.Ruka;

public class Robot {
    private Golova golova;
    private Noga noga;
    private Ruka ruka;

    public Robot(Golova golova, Noga noga, Ruka ruka) {
        super();
        this.golova = golova;
        this.noga = noga;
        this.ruka = ruka;
    }
    public void action(){
        golova.golovaGo();
        noga.nogaGo();
        ruka.rukaGo();
    }
}
