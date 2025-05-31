import java.util.Scanner;

public class calc {
    static public void main(String[] args){
        Scanner scan=new Scanner(System.in);

        numero n1=new numero();
        numero n2=new numero();
        numero res=new numero();
        String opc="S";

        while(opc.equalsIgnoreCase("S" )) {
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());
            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nA soma de %d + %d = %d", n1.getValor(), n2.getValor(), res.getValor());
            System.out.printf("%nDeseja continuar? (S/N): ");
            opc=scan.next();
        }
    }
}