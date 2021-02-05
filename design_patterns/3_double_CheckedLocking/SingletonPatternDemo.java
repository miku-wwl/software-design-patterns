public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getSingleoObject();
        object.showMessage();
    }
}
