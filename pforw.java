/*
 * @author Emanuelle Thesbita 
 * @version 1.0
 * Projeto de conversão de variável primitiva em Wrapper. Nesse projeto, para exercitar,
 * resolvi utilizar a tabela ASCII, digitando uma letra e transformando-a em um número hexadecimal.
 */

import java.util.Scanner;

// Segundo a tabela ASCII, letras maiúsculas e minúsculas apresentam números diferentes. 
//@link https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm

public class pforw{

    public static void main (String args[]){
    Scanner letra = new Scanner (System.in);
    char letter;

    System.out.println("Digite uma letra:");
    letter = letra.next().charAt(0);
    Character characterWrapper = Character.valueOf(letter);

    String hexaVal = Integer.toHexString((int) characterWrapper);
    //System.out.println("Caracter: " + letter);
    System.out.println("Valor Hexadecimal: " + hexaVal);       
    }


}

