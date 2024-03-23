package abstractFactory;

/**
 * 产品实现
 */
public class WoodenDesk implements Desk {
    public void description() {
        System.out.println("桌子类型"+this.getClass());
    }
}
