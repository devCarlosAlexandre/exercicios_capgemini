package com.capgemini;
import java.util.Scanner;
public class ListaEx01 {
    Scanner  entrada = new Scanner(System.in);
    public void somar(){
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Informe o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("A soma de "+numero1+" mais "+numero2+" é igual a "+(numero1+numero2));
    }

    public void realizarOperacoesBasicas(){
        int numero1 = 0;
        int numero2 = 0;
        int resultSoma = 0;
        int resultMult = 0;
        int resultDivi = 0;
        int resultSub = 0;

        System.out.println("Informe o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = entrada.nextInt();

        resultSoma = numero1 + numero2;
        resultMult = numero1 * numero2;
        resultDivi= numero1 / numero2;
        resultSub = numero1 - numero2;

        System.out.println(numero1+ " + "+numero2+" = " +resultSoma);
        System.out.println(numero1+ " - "+numero2+" = " +resultSub);
        System.out.println(numero1+ " * "+numero2+" = " +resultMult);
        System.out.println(numero1+ " / "+numero2+" = " +resultDivi);
    }

    public void cossumoVeiculo(){
        double distanciaPercorrida;
        double combustivelGasto;
        double result=0.0;

        System.out.println("Informe a distancia percorrida em km: ");
        distanciaPercorrida= entrada.nextDouble();
        System.out.println("Informe o total de combustivel gasto em litros: ");
        combustivelGasto = entrada.nextDouble();

        result = distanciaPercorrida / combustivelGasto;

        System.out.println("O conssumo médio de combustivel por km deste veiculo é de: "+result);
    }

    public void estratoFuncionario(){
        double salario = 0.0;
        String nome = "";
        double totalVendas=0.0;
        double comissao = 0.0;
        double totalSalario = 0.0;

        System.out.println("Informe o nome do vendedor: ");
        nome = entrada.next();
        System.out.println("Informe o salario do vendedor: ");
        salario = entrada.nextDouble();
        System.out.println("Informe o total de vendas em R$: ");
        totalVendas = entrada.nextDouble();

        comissao = totalVendas * 0.15;

        totalSalario = comissao + salario;

        System.out.println("O vendedor"+nome+" vendeu "+ totalVendas +" e realizou um total de "+comissao +" em comissão. seu salario " +
                "este mês  é de: "+totalSalario);
    }

    public void mediaSemestreAluno(){
        String nome ="";
        double media = 0.0;
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;

        System.out.print("Iforme o nome do aluno: ");
        nome = entrada.next();
        System.out.println("Informe a primeira nota de "+nome+":");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segund nota de "+nome+":");
        nota2 = entrada.nextDouble();
        System.out.println("Informe a terceira nota de "+nome+":");
        nota3 = entrada.nextDouble();

        media = (nota1+nota2+nota3) / 3;

        System.out.println("A media de"+nome+" é de"+media);


    }
}
