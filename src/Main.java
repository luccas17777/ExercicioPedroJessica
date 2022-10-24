import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //MediaAluno();
        //AcessoSenha();
        //PositivoNegativo();


    }

    public static void MediaAluno(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome Aluno: ");
        String nome = in.next();
        double soma = 0;
        for (int i = 1; i<=4; i++){
            System.out.print("Digite a "+ i +"ª"+" nota do aluno: ");
            double nota = in.nextDouble();
            soma += nota;
        }
        double media = soma/4;
        System.out.print("Aluno: "+nome+" - Média: "+ media);
    }
    public static void AcessoSenha(){
        Scanner in = new Scanner(System.in);
        /* //String senhaCorreta = "123ABC";
        System.out.print("Digite a senha: ");
        String senha = in.next();
        while(senha != "123ABC"){
            System.out.println("Acesso negado! Tente novamente");
            System.out.print("Digite a senha novamente: ");
            senha = in.next();
        }
        System.out.print("Acesso Permitido");*/

        System.out.print("Digite a senha: ");
        String senha = in.next();
        switch (senha){
            case "123ABC":
                System.out.print("Acesso Perimitido");
                break;
            default:
                System.out.println("Acesso negado! Tente novamente:");
                AcessoSenha();
        }
    }

    public static void PositivoNegativo(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();
        if(num < 0)
            System.out.println("Número negativo");
        else
            System.out.println("Número positivo");

    }
}