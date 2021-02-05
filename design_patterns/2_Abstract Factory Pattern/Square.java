import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
