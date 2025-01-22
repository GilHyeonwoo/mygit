package src;

public class calculator {

    int add(int i, int j){
        return i +j;
    }

    int sub(int i, int j){
        return i -j;
    }
    int multiply(int i, int j){
        return i *j;
    }
    int divide(int i, int j){
        return i /j;
    }

    public static void main(String[] args) {
        calculator cal =new calculator();
        System.out.println(cal.add(3,2));
        System.out.println(cal.sub(3,2));
        System.out.println(cal.multiply(3,2));
        System.out.println(cal.divide(3,2));
    }
}
