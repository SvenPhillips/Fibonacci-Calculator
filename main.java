class Main {
    public static void main(String[] args) {
        int generatednumbers = 1000;
        long Fibonacci1 = 0L;
        long Fibonacci2 = 1L;
        while(generatednumbers > 0){
            generatednumbers = generatednumbers - 1; 
            System.out.println(Fibonacci2);
            Fibonacci1 = Fibonacci2 + Fibonacci1; 
            if(generatednumbers > 0){
                generatednumbers = generatednumbers - 1; 
                Fibonacci2 = Fibonacci1 + Fibonacci2;
                System.out.println(Fibonacci1);
            }
        }
    }
}
