import javax.xml.stream.util.StreamReaderDelegate;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decorateShape){
        super(decorateShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
    
}
