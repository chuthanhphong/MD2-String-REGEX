package bt1;

public class main {
    public static EmailExample emailExample;
    public  static final  String [] str= {"a@gmail.com","@gmail.com"};
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String mail : str){
            boolean isvalidate = emailExample.validate(mail);
            System.out.println("mail :" + mail + " "  + isvalidate);
        }
    }
}
