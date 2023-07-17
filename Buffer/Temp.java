class Temp{
    public static void main(String args[])
    {
        String str="Hello world";
        char ch[]=new char[4];
        str.getChars(1,5,ch,0);
        System.out.println(ch);
    }
}