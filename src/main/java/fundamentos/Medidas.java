package fundamentos;

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);;

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        String opcao;
        int area = 0; // receber o resultado dos cálculos de áreas


        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) Area do Quadrado");
        System.out.println("(2) Area do Retangulo");
        System.out.println("(3) Area do Triângulo");
        System.out.println("(4) Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao){
            case "1":
               area = calcularAreaDoQuadrado();
               break;
            case "2":
                // ToDo: calcular área do tetangulo
                break;
            default:
                System.out.println("Opção Inválido: " + opcao);
        }
        if (area > 0) {

            System.out.println("A área é de " + area + "m²");
        }
    }

     public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digita o tamanho do lado: "); //Frase que irá pedir os dados que só é possivel pegar ele por causa do Scanner
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a área do quadrado
        
    }
}