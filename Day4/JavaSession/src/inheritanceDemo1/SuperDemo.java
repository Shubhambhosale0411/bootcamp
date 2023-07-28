package inheritanceDemo1;

class bank{
    int amount=1;
}
class Axis extends bank{
    int amount=2;//global veriable
    void test(){
        int amount=3;  //local variable

        System.out.println(super.amount);  //parent one
        System.out.println(this.amount);   //global one
        System.out.println(amount);       //local one
    }
}
public class SuperDemo {
    public static void main(String[] args){
        Axis axis=new Axis();
        axis.test();
    }
}
