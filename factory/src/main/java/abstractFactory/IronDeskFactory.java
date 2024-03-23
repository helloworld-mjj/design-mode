package abstractFactory;

/**
 * 工厂实现
 */
public class IronDeskFactory implements DeskFactory {
    public Desk getDesk() {
        return new IronDesk();
    }

    public DeskExpert getDeskExpert() {
        return new IronDeskExpert();
    }
}
