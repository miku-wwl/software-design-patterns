public class ColorFactory extends AbstractFactory{
    @Override 
    public Shape getShape(String shapeType){
        return null;
    }
    @Override
    public Color getColor(String colorType){
        if (colorType == null){
            return null;
        }else if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
    
}
