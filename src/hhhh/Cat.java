package hhhh;

public class Cat extends Animal{
    String kind;
    public Cat(String name,int age,String kind){
        super(name,age);
        this.kind=kind;
    }
    public String getKind(){
        return kind;
    }
    public void setKind(String kind){
        this.kind=kind;
    }
    @Override
    public void print(){

        System.out.println(this.toString);
    }
    @Override
    public String toString(){
        return "Dog[种类："+kind+",名字："+name+",年龄"+age+"]";
    }
}
