package bt5;

public class Main {
    public  static ValidateNumberPhone validateNumberPhone;
    public static String [] str = {"(84)-(0978489648)","(a8)-(22222222)"};

    public static void main(String[] args) {
        validateNumberPhone = new ValidateNumberPhone();
        for(String check : str){
            System.out.println("số điện thoại " + check + " " + validateNumberPhone.check(check));
        }
    }
}
