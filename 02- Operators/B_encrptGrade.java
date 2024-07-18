public class B_encrptGrade {
    public static void main(String[] args) {
        char grade= 'A';
        System.out.println("Original grade is "+grade);
        grade=(char)(grade+8);
        System.out.println("Encrpted grade is "+grade);
        grade=(char)(grade-8);
        System.out.println("Grade dereption: Now You can see the original grade "+grade);
    }
}
