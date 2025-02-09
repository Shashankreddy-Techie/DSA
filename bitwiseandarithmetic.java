class ArithmeticOperations {
public int add(int a, int b) {
return a+b;
}
public int subtract(int a, int b) {
return a-b;
}
public int multiply(int a, int b) {
return a*b;
}
public int divide(int a, int b) {
return a/b;
}
}
class BitwiseOperations {
public int bitwiseAnd(int a, int b) {
return a&b;
}
public int bitwiseOr(int a, int b) {
return a|b;
}
public int bitwiseXor(int a, int b) {
return a ^ b;
}
public int bitwiseComplement(int a) {
return ~a;
}
}
 class Operations {
public static void main(String[]Args) {
ArithmeticOperations arithmetic=new ArithmeticOperations();
BitwiseOperations bitwise= new BitwiseOperations();
int num1=10;
int num2=5;
System.out.println("Arith metic operations :");
System.out.println("Addition :"+arithmetic.add(num1,num2));
System.out.println("Subtraction:"+arithmetic.subtract(num1,num2));
System.out.println("Multiplication:"+arithmetic.multiply(num1,num2));
System.out.println("Division:"+arithmetic.divide(num1,num2));
System.out.println("Bitwise Operation :");
System.out.println("Bitwise And:"+bitwise.bitwiseAnd(num1,num2));
System.out.println("Bitwise or:"+bitwise.bitwiseOr(num1,num2));
System.out.println("Bitwise Xor:"+bitwise.bitwiseXor(num1,num2));
System.out.println("Bitwise complement:"+bitwise.bitwiseComplement(num1));
}
}