class NumberFormatexception {
    public static void main(String args[]) {
        String s = "abc";
        int i = Integer.parseInt(s); //NumberFormatException
        System.out.println(i);
        System.out.println("rest of the code...");
    }
}
