package bt2;

public class main {
    public static AccountExample accountExample;
    public static String [] str = {"123abc_","_abc123","______","123456","abcdefg","1234_","abcde "};
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for(String account : str){
            boolean isAccount = accountExample.check(account);
            System.out.println("Account " + account + " " + isAccount );
        }

    }
}
