package Week1;

public class Main12 {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }

    void add(float num1, float num2){
        System.out.println(num1+num2);
    }

    void add(int num1, float num2){
        System.out.println(num1+num2);
    }

    void add(float num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {

        Main12 p = new Main12();
        p.add(12.2f,300);

        System.out.println(0);
    }
}
