import java.util.Scanner;
public class calcAguaSalario {
     public static void main(String[] args) {
        int litAgua;
        double salario, result;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de litros de agua: ");
        litAgua= input.nextInt();
        
        System.out.println("Insira o valor do salário: ");
        salario= input.nextDouble();
        
        result= (litAgua/1000)*(salario*0.02);
        
        System.out.println("Valor sem desconto: "+result);
        System.out.println("Valor com 15% de desconto: "+(result*0.85));
     }
}