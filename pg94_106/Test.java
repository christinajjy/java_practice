class Test{
    public static void main(String[] args) {
        String[]  s1 ={"MSD","SSA"};
        Ademo.function1(s1);
        Ademo.main(s1);
    }
}
//when jvm calls the main method, it executes as a thread 
// when we call the main method it executes as a function