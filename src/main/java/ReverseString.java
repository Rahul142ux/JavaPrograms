import  java.lang.String;
public class ReverseString {

    public static void main(String[] args) {
        ReverseString rs=new ReverseString();
                 String name="RaskarRahul";
        System.out.println(rs.reverseString(name));
    }
    public String reverseString(String name)
    {
        int len=name.length();
        char ch;
        String rev="";
        System.out.println(len);
        for(int i=0;i<len;i++)
        {
            ch=name.charAt(i);
            rev=ch+rev;
        }
        return rev;
    }

}
