package com.capgemini;
import java.security.spec.RSAOtherPrimeInfo;
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

    public void trocaValores(){
        double a = 0.0;
        double b= 0.0;
        double c = 0.0;

        System.out.println("Informe o valor de A:");
        a = entrada.nextDouble();
        System.out.println("Informe o valor de B:");
        b= entrada.nextDouble();
        System.out.println("A: "+a+" B: "+b);
        c = a;
        a = b;
        b = c;

        System.out.println("Os valores foram trocados");
        System.out.println("A: "+a+" B: "+b);
    }

    public void convertCelsiusParaFahrenheit(){
        double f = 0.0;
        int c = 0;
        System.out.println("Informe a temperatura em Celsius: ");
        c = entrada.nextInt();
        f = (9*c+190)/5 ;
        System.out.println("Fahrenheit: "+f);
    }

    public void convertDolar(){
        double dolarCotacao =0.0;
        double real = 0.0;
        double dolar= 0.0;

        System.out.println("Olá informe o valor da cotação do dólar: ");
        dolarCotacao= entrada.nextDouble();
        System.out.println("Informe a quantidade de dólar para conversão: ");
        dolar = entrada.nextDouble();
        real = dolarCotacao * dolar;
        System.out.println("O montante convertido em real é de "+real);
    }

    public void rendimentoPoupanca(){
        double deposit = 0.0;
        double redimento = 0.0;
        double juros = 0.007;
        int meses= 1;

        System.out.println("Informe o valor do deposito");
        deposit = entrada.nextDouble();
        redimento = (deposit * juros) *meses;

        System.out.println("O valor do rendimento em "+meses+ " mês é: "+redimento);

    }

    public void calcularPrestacao(){
        int qtdPrestacoes= 5;
        double valorPrestacao = 0.0;
        double valorCompra = 0.0;

        System.out.println("Informe o valor da compra");
        valorCompra = entrada.nextDouble();
        valorPrestacao = valorCompra / qtdPrestacoes;

        System.out.println("Total: "+valorCompra);
        System.out.println(qtdPrestacoes+" vezes de "+valorPrestacao);
    }

    public void definirLucroProduto(){
        double precoCustoProduto = 0.0;
        double lucroProduto = 0.0;
        double valorVenda = 0.0;

        System.out.println("Informe o valor de custo do produto: ");
        precoCustoProduto = entrada.nextDouble();

        System.out.println("Informe o percentual de lucro em porcentagem: ");
        lucroProduto = entrada.nextDouble();
        lucroProduto = lucroProduto/100;
        valorVenda = (precoCustoProduto * valorVenda) + precoCustoProduto;

        System.out.println("O valor da venda é de "+valorVenda);
    }

    public void custoCarro(){
        double custoFabrica = 0.0;
        double impostos = 1.45;
        double custoFabricaEImpostos = 0.0;
        double percentualDistribuidor = 1.28;
        double custoFinal = 0.0;

        System.out.println("Informe o custo da fabrica para produzir o carro: ");
        custoFabrica = entrada.nextDouble();
        custoFabricaEImpostos = custoFabrica * impostos;
        custoFinal = custoFabricaEImpostos * percentualDistribuidor;

        System.out.println("O valor final deste veiculo para o consumidor é de: "+custoFinal);
    }

}
