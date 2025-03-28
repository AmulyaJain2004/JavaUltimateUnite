class Nullptrexception {
    public static void main(String args[]) {
        String s = null;
        System.out.println(s.length());
        System.out.println("rest of the code...");
        // Exception in thread "main" java.lang.NullPointerException
        // at testexception.main(testexception.java:5)
    }
}
