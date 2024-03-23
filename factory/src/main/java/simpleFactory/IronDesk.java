package simpleFactory;

/**
 * 产品实现
 */
public class IronDesk implements Desk{
    protected float width;
    protected float length;
    protected float height;

    public IronDesk(float width, float length, float height){
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
