class Buffer6{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("This is java class");
        System.out.println(sb.capacity());
        
    }
}