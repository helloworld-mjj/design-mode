package simpleFactory;

/**
 * 产品实现
 */
public class WoodenDesk implements Desk{

    protected float width;
    protected float length;
    protected float height;

    public WoodenDesk(float width, float length, float height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }
}
