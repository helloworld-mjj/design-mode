package abstractFactory;

/**
 * 工厂实现
 */
public class WoodenDeskFactory implements DeskFactory {
    public Desk getDesk() {
       return new WoodenDesk();
    }

    public DeskExpert getDeskExpert() {
        return new WoodenDeskExpert();
    }
}
