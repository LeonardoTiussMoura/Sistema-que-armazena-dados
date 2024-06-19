import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite seu primeiro nome:");
    String nome = sc.next();
    System.out.println(" ");
    System.out.println("Digite seu sobrenome:");
    String sobrenome = sc.next();
    System.out.println(" ");
    System.out.println("DIGITE APENAS NÚMEROS!");
    System.out.println("");
    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();
    System.out.println(" ");
    System.out.println("Digite sua altura em centímetros: (Ex: 172)");
    double altura = sc.nextInt();
    System.out.println(" ");
    System.out.println("Digite a massa que você tem (o valor que mostra em uma balança em KG)");
    int massa = sc.nextInt();
    System.out.println("");
    double alturametro = altura / 100;
    double alqua = alturametro * alturametro; 
    double pesodivi = massa / alqua;
      System.out.println("—————————————————————————————————————————————");
    System.out.print("                    FICHA                    ");
    System.out.println("—————————————————————————————————————————————");
    System.out.println(" ");
    System.out.print("Nome: ");
    System.out.println(nome+(" ")+sobrenome);
    System.out.print("Idade: ");
    System.out.println(idade+" anos");
    System.out.print("Altura: ");
    System.out.println(alturametro+" metros");
    System.out.print("Massa: ");
    System.out.println(massa+" KG");
    System.out.println(" ");          
    System.out.println("Considere apenas 2 casas depois do ponto.");
    System.out.println(" ");
    System.out.println("IMC: ");
    System.out.print(pesodivi);
  }
}