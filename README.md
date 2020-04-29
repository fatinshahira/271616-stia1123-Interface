# 271616-stia1123-Interface
# QUIZ

```java

public interface MyInterface {

    
   void sayHello();
        
    }
    
//METHOD 1

public class Method1 implements MyInterface{

    @Override
    public void sayHello() {
         System.out.println("Hello Method1");
    }
    
    public static void main(String[]args){
    Method1 method1 = new Method1();
    method1.sayHello();
    }
}

//METHOD 2

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

//METHOD 3

public class Method3 {
   
    public static void main (String [] args){
           
        MyInterface myInterface = () -> System.out.println("Hello Method3");
            myInterface.sayHello();
}
}
```



# OUTPUT

![ouput method 1](https://user-images.githubusercontent.com/55240830/80560281-ec7ed180-8a12-11ea-8075-c2cc0f935382.png)
![output method 2](https://user-images.githubusercontent.com/55240830/80560285-eee12b80-8a12-11ea-9f8d-a1984229869e.png)
![output method 3](https://user-images.githubusercontent.com/55240830/80560320-0f10ea80-8a13-11ea-8614-e12efcf34ecc.png)
