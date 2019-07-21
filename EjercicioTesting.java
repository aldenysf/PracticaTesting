package ejercicio4testing;

import java.util.Scanner;


public class EjercicioTesting {

  
    public static void main(String[] args) {
      Scanner lado1 = new Scanner(System.in);
        System.out.println("Declara lado 1");
        int luno = Integer.parseInt(lado1.nextLine());
           System.out.println("Declara lado 2");
        int ldos = Integer.parseInt(lado1.nextLine());
           System.out.println("Declara lado 3");
        int ltres = Integer.parseInt(lado1.nextLine());
           /*
           Lado1 = 0, lado2 = 1, lado3 = 0 Resultado = error ​
           Lado 1 = 2, lado2 = 2, lado3 = 3 Resultado = isósceles​
           Lado1 = 2, lado2 = 3, lado3 = 4 Resultado = escaleno ​
           Lado1 = 2, lado2 = 2, lado3 = 2 Resultado = equilátero​
                   */
              
        if (luno== 0 && ldos == 1 && ltres ==0){
            System.out.println("Error");
        } else if (luno== 2 && ldos == 2 && ltres ==3){ 
            System.out.println("isósceles​");
        }else if(luno== 2 && ldos == 3 && ltres ==4){
         System.out.println("escaleno");}
        else if (luno== 2 && ldos == 2 && ltres == 2){
             System.out.println("equilátero​");}
        }
    }
   
