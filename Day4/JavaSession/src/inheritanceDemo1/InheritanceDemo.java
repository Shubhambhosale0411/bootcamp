package inheritanceDemo1;

class parent{
    void mothertongue()
    {
        System.out.println("speak marathi");
    }
}
class child extends parent{
    void education()
    {
        System.out.println("education in BE");
    }
    void mothertongue()
    {
        super.mothertongue();
        System.out.println("speak english");
    }
}

public class InheritanceDemo {
    public static void main(String[] args){
    child obj=new child();
    obj.mothertongue();


    }
}
