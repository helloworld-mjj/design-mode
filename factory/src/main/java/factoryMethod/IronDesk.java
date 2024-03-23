package factoryMethod;

/**
 * 产品实现
 */
public class IronDesk implements Desk{
    public void description() {
        System.out.println("桌子类型"+this.getClass());
    }
}
