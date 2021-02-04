package hhhh;

public abstract class Animal
{
    protected String toString;
    String name;
     int age;

     public Animal(String name,int age){
         super();
         this.name=name;
         this.age=age;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
}

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public abstract void print();
//     public abstract void print(){
//
//    }

}
