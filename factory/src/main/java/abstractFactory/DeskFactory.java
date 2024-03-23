package abstractFactory;

/**
 * 工厂抽象
 */
public interface DeskFactory {

    public Desk getDesk();

    public DeskExpert getDeskExpert();

}
