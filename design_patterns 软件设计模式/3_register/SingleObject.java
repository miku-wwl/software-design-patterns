public class SingleObject{


    private static class SingleHolder{
        private static final SingleObject INSTANCE = new SingleObject();
    } 
    private SingleObject(){}  

    public static final SingleObject getInstance(){
        return SingleHolder.INSTANCE;
    }
   

    public void showMessage(){
        System.out.println("Hello World!");
    }

}