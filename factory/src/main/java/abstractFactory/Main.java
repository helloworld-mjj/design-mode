package abstractFactory;

import abstractFactory.*;

/**
 * 抽象工厂
 */
public class Main {

    public static void main(String[] args){
        DeskFactory woodenDeskFactory = new WoodenDeskFactory();
        woodenDeskFactory.getDesk().description();
        woodenDeskFactory.getDeskExpert().description();
        IronDeskFactory ironDeskFactory = new IronDeskFactory();
        ironDeskFactory.getDesk().description();
        ironDeskFactory.getDeskExpert().description();
    }
}
