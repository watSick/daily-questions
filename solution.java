public class solution{
    public static void main(String[] args) {
        // System.out.println("hello");
        String[] strArr={"flower","fkow","flowers"};
        int small=strArr[0].length();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i]=strArr[i].toLowerCase();
            if (small>strArr[i].length()) {
                small=strArr[i].length();
            }
        }
        System.out.println(small);
        String ans="";
        boolean check=true;
        char[] arr=new char[strArr.length];
        for (int i = 0; i < small; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=strArr[j].charAt(i);
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1]!=arr[j]) {
                    check=false;
                }
            }
            if (check==true) {
                 ans+=arr[0];
            }
        }
        System.out.println(ans);
    }
}