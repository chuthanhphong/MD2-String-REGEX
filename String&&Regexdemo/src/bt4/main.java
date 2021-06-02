package bt4;

public class main {
    public  static  NameofClass nameofClass;
    public static String[] str = {"C0318G","M0318G","P0323A"};

    public static void main(String[] args) {
        nameofClass = new NameofClass();
        for(String isvali: str){
            System.out.println( " Mã Lớp  " + isvali + " " + nameofClass.validate(isvali) );
        }
    }
}
