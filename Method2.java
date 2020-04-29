
public class Method2 {
    
    public static void main ( String[]args){
    
    MyInterface myInterface = new MyInterface(){
        @Override
        public void sayHello() {
            System.out.println("Hello Method2");
        }
         
    };
    myInterface.sayHello();
    }
}
