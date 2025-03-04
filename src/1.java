public class MathHomework {
    public static void main(String[] args) {
        System.out.println("Welcome to your math homework page!");
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        String operation = "+-*/".charAt((int)(Math.random()*3));
        System.out.println("What is " + num1 + " " + operation + " " + num2 + "?");
    }
}