package factoryMethod;

/**
 * 工厂方法
 */
public class Main {

    public static void main(String[] args){
        WoodenDeskFactory woodenDeskFactory = new WoodenDeskFactory();
        woodenDeskFactory.installDesk();
        IronDeskFactory ironDeskFactory = new IronDeskFactory();
        ironDeskFactory.installDesk();
    }
}
