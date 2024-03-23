package factoryMethod;

/**
 * 工厂实现
 */
public class WoodenDeskFactory extends DeskFactory{
    public Desk getDesk() {
       return new WoodenDesk();
    }
}
