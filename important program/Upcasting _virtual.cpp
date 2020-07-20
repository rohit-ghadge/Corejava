#include<iostream>   ///cpp Upcasting
#include<stdio.h> // op Sub function Runtime polymorphism (virtual keyword)
using namespace std;

 class Super
{
    int x;
    public:
   virtual void funBase()
    {
       cout << "Super function"<<endl;
    }
};

class Sub:public Super
{
    int y;
	public :
    void funBase()
    {
    	cout<<" Sub function "<<endl;
    }
};

int main()
{
    Super* ptr; //U(pper class )P(ointer) Casting
    Sub obj;
    ptr = &obj;
    ptr->funBase();

}
-----------------------------------------------------------------------------------------------------------------------
java upcasting and downcasting 
-----------------------------------------------------------------------------------------------------------------------
class Animal
{
    void eat()
    {
        System.out.println("PARENT class eat methos");
    }
    void sleep()
    {
        System.out.println("Parent class sleep method");
    }
}  
  
class Tiger extends Animal
{
    @Override
     void eat() 
    {
        System.out.println("Tiger eat only NON-VEG");
    }  
    void king()
    {
        System.out.println("tiger is the king");
    }
}
class Elephant extends Animal
{
    @Override
     void eat() 
    {
        System.out.println("Elephant eat only VEG");
    }  
    void big()
    {
        System.out.println("elephant is big animal");
    }
}
class Dog extends Animal
{
    @Override
     void eat() 
    {
        System.out.println("Dogt eat both VEG and non-veg also");
    }  
    void humanfrien()
    {
        System.out.println("dog is human friend");
    }
}
public class Demo 
{
    public static void main(String args[])
    {  
        Animal a = new Tiger();  //upcasting(op:-tiger is the king)
        if(a instanceof Tiger)
        {
          Tiger t=(Tiger)a;  
          t.king();
        }
    }  
	public static void main(String args[])
    {  
        Animal a = new Tiger();  //upcasting (op:-Tiger eat only NON-VEG)
        a.eat();                  
    }
	public static void main(String args[])
    {  
        Animal a = new Tiger();  //error ref is upper class )
        a.king();                  
    }
}

-base class refrence is use to point to all the derived class object.
- if base class method is override in derived class.then we call derived class method direct on parent class   	  	referance.
-but if the method is not parent in base class but write in derived class(not override) then we have to do downcasting.
 
----------------------------------------------------------------------------------------------------------------------
