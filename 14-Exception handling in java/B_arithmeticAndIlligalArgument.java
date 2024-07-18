public class B_arithmeticAndIlligalArgument {
    public static void main(String[] args) {
        try{
            int a=666/0;
            System.out.println(a);

        }

        catch(ArithmeticException e){
            System.out.println("HiHi");
        }

        catch(IllegalArgumentException e){
            System.out.println("HaHa");
        }
    }
}
