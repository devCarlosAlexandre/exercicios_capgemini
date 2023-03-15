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

    public void maiorQueDez(){
        int numero = 0;
        System.out.println("Informe um numero inteiro: ");
        numero = entrada.nextInt();
        if(numero > 10){
            System.out.println(numero+" é maior que dez!");
        }else{
            System.out.println(numero+" é menor que dez!");
        }
    }

    public void maior(){
       int numero1=0;
       int numero2=0;

        System.out.println("Informe o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Informe o segundo número:");
        numero2 = entrada.nextInt();

        if(numero1 > numero2){
            System.out.println(numero1+" é maior que "+numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2+" é maior que "+numero1);
        }else{
            System.out.println(numero1+" é igual a "+numero2);
        }

    }

    public void intervalo(){
        int intervaloInicio = 100;
        int intervaloFinal = 200;
        double numero = 0.0;

        System.out.println("Informe um número");
        numero = entrada.nextDouble();
        if (numero >= 100 && numero >= 200){
            System.out.println("O numero informado está entre 100 e 200");
        }else{
            System.out.println("O numero informado não está entre 100 e 200. informe outro número!");
        }
    }

    public void mediaAluno(){
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double media = 0.0;
        String nome = "";

        System.out.println("Iforme o nome do aluno: ");
        nome= entrada.next();
        System.out.println("Informe a primeira nota de"+nome+": ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segund nota de"+nome+": ");
        nota2 = entrada.nextDouble();
        System.out.println("Informe a terceira nota de"+nome+": ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2+ nota3)/3;

        if(media >= 7){
            System.out.println(nome+" está aprovado com sucesso! sua nota final é "+media);
        } else if (media >= 5.1 || media <=6.9) {
            System.out.println(nome+" está de recuperação! sua nota final foi"+media+" deve se esforçar mais e preparar para prova final de recuperação! boa sorte.");
        }else {
            System.out.println("Infelizmente "+nome+" está reprovado, tente novamente e se esforce mais. ");
        }
    }

    public void intervaloDezECentoECinquenta(){
        int[] numeros =  new  int [80];
        for(int i =0; i < numeros.length; i++){
            int index = 1;
            System.out.println("Informe o numero: "+index+"/"+numeros.length);
            numeros[i] = entrada.nextInt();
            index++;
        }

        for(int i =0; i > numeros.length; i++){
            if(numeros[i] > 11 && numeros[i] < 151){
                System.out.println(numeros[i]+" está entre 10 e 150");
            }
        }
    }

    public void idade75Pessoas(){
        int flag = 1;
        int [] idades = new int[75];

        for(int i =0; i < idades.length; i++){
            System.out.println("Informe a idade");
            idades[i] = entrada.nextInt();
            System.out.println("deseja continuar? se sim digite 1 se não digite qualquer outro caractere ");
            flag = entrada.nextInt();
            if(flag == 0 ){
                break;
            }
        }

        for(int i =0; i < idades.length; i++){
            if(idades[i] >= 18){
                System.out.println("Maior de idade");
            }else {
                System.out.println("Menor de idade");
            }
        }
    }
    /*
    Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
    mulher. No final informe total de homens e de mulheres;
     */

    public void cadastroPessoas(){

        Pessoa[] pessoas = new Pessoa[56];
        System.out.print("Você pode cadastrar até 56 pessoas: ");
        int count =0;
        for(int i=0; i < pessoas.length; i++){
            System.out.println(count+"/"+pessoas.length);
            int flag= 1;
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o nome: ");
            pessoa.setNome(entrada.nextLine());
            System.out.println("Informe a idade: ");
            pessoa.setIdade(entrada.nextInt());
            System.out.println("Informe o sexo: ");
            pessoa.setSexo(entrada.next());
            pessoas[i] = pessoa;
            System.out.println("Deseja continuar? se não diigite 0 se não digite qualquer outro numero");
            flag = entrada.nextInt();
            if(flag == 0 ){
                break;
            }
        }

        for(int i=0; i < pessoas.length; i++){
            pessoas[i].getPessoa();
        }

    }

}
