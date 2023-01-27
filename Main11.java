package Week1;

public class Main11 {
    int width;
    int height;

    void display(String item){
        System.out.println(item+" Width "+ width +" Height "+ height);
    }

    public static void main(String[] args) {

    }
}
class Chair extends Main11{
   void foo(){
       width=10;
       height=20;
       display("Chair");

   }
}
class Table extends Main11{
    void foo(){
        width=10;
        height=20;
        display("Table");

    }
}
class Almira extends Main11{
    void foo(){
        width=10;
        height=20;
        display("Almira");

    }
}
