import java.util.Scanner;

public class calc {
    static public void main(String[] args){
       try (Scanner scan=new Scanner(System.in)) {

        numero n1=new numero();
        numero n2=new numero();
        numero res=new numero();
        String opc="S";

        while(opc.equalsIgnoreCase("S" )) {
            System.out.printf("%nEscolha a operação (+, -, *, /): ");
            String operacao = scan.next();
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());

        switch (operacao) {
                    case "+":
                        res.setValor(n1.getValor() + n2.getValor());
                        System.out.printf("%nA soma de %d + %d = %d", n1.getValor(), n2.getValor(), res.getValor());
                        break;
                    case "-":
                        res.setValor(n1.getValor() - n2.getValor());
                        System.out.printf("%nA subtração de %d - %d = %d", n1.getValor(), n2.getValor(), res.getValor());
                        break;
                    case "*":
                        res.setValor(n1.getValor() * n2.getValor());
                        System.out.printf("%nA multiplicação de %d * %d = %d", n1.getValor(), n2.getValor(), res.getValor());
                        break;
                    case "/":
                        if (n2.getValor() != 0) {
                            res.setValor(n1.getValor() / n2.getValor());
                            System.out.printf("%nA divisão de %d / %d = %d", n1.getValor(), n2.getValor(), res.getValor());
                        } else {
                            System.out.println("%nNão é possível dividir por zero!");
                        }
                        break;
                    default:
                        System.out.println("%nOperação inválida!");
                    }
                System.out.printf("%nDeseja continuar? (S/N): ");
                opc = scan.next();
            }
        }
    }
}