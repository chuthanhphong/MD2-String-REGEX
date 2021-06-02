package demolythuyet;

public class demo1 {
    public static void main(String[] args) {
        String x = "   CodeGym_Viet_Nam    ";
        x = x.trim();
        int index = x.indexOf("_");
        String y = x.substring(0, index);
        System.out.println(y);
    }





}
