package workshop07;


public class Test05 {
    public static void main(String[] args) {
        String str = "   [Beyond Promise.]   ";
        String str2 = "";
        str = str.replace(" ", "_");
        System.out.println(str);
        str = str.replace("___", "");
        str = str.replace("_", " ");
        str2 = str;
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        str = str.replace("e", "a");

        str = str.substring(1);

        String[] a = str.split(" ");
        String ans = "[";
        for (String s : a) {
            ans += capitalize(s)+" ";
        }
//        System.out.println(str);
        System.out.println(ans);
        String[] b = str2.split(" ");
        System.out.println(b[1].substring(0,b[1].length()-2));
    }


    public static String capitalize(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }
}
