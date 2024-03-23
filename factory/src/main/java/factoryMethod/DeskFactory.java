package factoryMethod;

/**
 * 工厂抽象
 */
public abstract class DeskFactory {

    abstract public Desk getDesk();

    public void installDesk(){
        Desk desk = this.getDesk();
        System.out.println("开始装门"+desk.getClass());
    }
}
