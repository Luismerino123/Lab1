import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******BIENVENIDO A CALCULADORA*******");
        System.out.println("Ingrese numero 1 ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese numero 2 ");
        double num2 = sc.nextDouble();
        boolean flag=true;
        while(flag){
            System.out.println("*******Eliga el calculo deseado*******");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    double suma=Suma(num1,num2);
                    System.out.println(("Resultado de la suma: ")+suma);
                    break;
                case 2:
                    double resta=Resta(num1,num2);
                    System.out.println(("Resultado de la resta: ")+resta);
                    break;
                case 3:
                    double multi=Multi(num1,num2);
                    System.out.println(("Resultado de la multiplicacion: ")+multi);
                    break;
                case 4:
                    double divi=Divi(num1,num2);
                    if (num2==0){
                        System.out.println("Ningun numero es divisble entre 0");
                    }else {
                    System.out.println(("Resultado de la multiplicacion: ")+divi);}
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR LA CALCULADORA");
                    flag=false;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        }

        }
    public static double Suma(double num1 ,double num2){
        return num1+num2;
    }
    public static double Resta(double num1 ,double num2){
        return num1-num2;
    }
    public static double Multi(double num1 ,double num2){
        return num1*num2;
    }
    public static double Divi(double num1 ,double num2){
        return num1/num2;
    }
}