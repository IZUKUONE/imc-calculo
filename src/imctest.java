import java.util.Scanner;

public class imctest {
    public static void main(String[] args) {
        double peso;
        double altura;

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o seu peso! " + "Ex: 68");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura! " + "Ex: 1,70");
        altura = leia.nextDouble();

        double imc;
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está com excesso de peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Você está com obesidade de Gau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Você está com obesidade de Gau II (severa)");
        } else {
            System.out.println("Você está com obesidade de Gau III (mórbida)");
        }
    }
}