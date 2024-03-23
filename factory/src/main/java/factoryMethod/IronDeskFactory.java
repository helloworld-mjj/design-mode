package factoryMethod;

/**
 * 工厂实现
 */
public class IronDeskFactory extends DeskFactory {
    public Desk getDesk() {
        return new IronDesk();
    }
}
