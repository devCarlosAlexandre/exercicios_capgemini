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

    public void cadastroPessoas(){

        Pessoa[] pessoas = new Pessoa[56];
        System.out.print("Você pode cadastrar até 56 pessoas: ");
        int count =0;
        int countPessoas=0;
        int mulheres = 0;
        int homens = 0;
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
            if( pessoa.getSexo() == "feminino"){
                mulheres++;
            } else if (pessoa.getSexo() == "masculino") {
                homens++;
            }
            pessoas[i] = pessoa;
            System.out.println("Deseja continuar? se não diigite 0 se não digite qualquer outro numero");
            flag = entrada.nextInt();
            if(flag == 0 ){
                break;
            }
        }

        for(int i=0; i < pessoas.length; i++){
            pessoas[i].getPessoa();
            countPessoas++;
        }
        System.out.println("Há um total de "+countPessoas+" pessoas cadastradas, sendo "+mulheres+" mulheres e "+homens+" homens");

    }
    /*
    A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
    um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
    desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
    sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
    Informar total de carros com ano até 2000 e total geral;
     */

    public void vendaVeiculo(){

    }

    public void servicoMilitar(){
        String flag= "s";
        System.out.println("informe a quantidade de pessoas que você deseja realizar a verificação: ");
        int nPessoas = entrada.nextInt();
        Pessoa[] pessoas = new Pessoa[nPessoas];

        for(int i=0; i < pessoas.length; i++){
            System.out.println("Nome: ");
            pessoas[i].setNome(entrada.nextLine());
            System.out.println("Idade: ");
            pessoas[i].setIdade(entrada.nextInt());
            System.out.println("sexo: ");
            pessoas[i].setSexo(entrada.next());
            System.out.println("Saude boa ou ruim? ");
            pessoas[i].setSaude(entrada.next());
            System.out.println("Deseja continua? se se não digite \"n\" se sim digite qualquer outra tecla.");
            flag = entrada.next();
            if(flag == "n"){
                break;
            }
        }

        for(int i =0; i < pessoas.length; i++){
            boolean apto = true;
            if(pessoas[i].getIdade() < 18){
                apto = false;
                System.out.println(pessoas[i].getNome()+" não está hapto para servir ao exercito pois é menor de idade");
            }else if(pessoas[i].getSaude() == "ruim"){
                apto = false;
                System.out.println(pessoas[i].getNome()+" não está hapto para servir ao exercito pois sua saúde não esta boa");
            }
            if(apto){
                System.out.println(pessoas[i].getNome()+" está hapto para servir ao exercito");
            }
        }
    }

    public void resumoVendaProduto(){
        double[] precosCusto = new double[40];
        double[] precoVenda = new double[40];
        double totalVenda=0.0;
        int countVenda =0;
        double totalCusto=0.0;

        for(int i=0; i < precosCusto.length; i++){
            double custofinal = 0.0;
            double lucro = 0.0;
            System.out.println("informe o preço de custo do produto: ");
            precosCusto[i] = entrada.nextDouble();
            totalCusto += precosCusto[i];
            System.out.println("Informe o preço de venda: ");
            precoVenda[i]= entrada.nextDouble();
           lucro= precosCusto[i] - precoVenda[i];
           totalVenda += precoVenda[i];
            System.out.println("Lucro: "+lucro );
            System.out.println("Venda: "+precoVenda[i]);
            countVenda++;
        }

        System.out.println("Media Venda: "+(totalVenda /countVenda ));
        System.out.println("Media Custo: "+(totalCusto/countVenda));
    }

    /*
    Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
    menor que 25 ou igual a 40;
     */
    public void maiorIgual(){
        int[] numeros = new int[40];
        for(int i=0; i < numeros.length; i++){
            System.out.println("Informe um numero inteiro: ");
            numeros[i] = entrada.nextInt();
            if(numeros[i] >= 80 || numeros[i] >= 25 || numeros[i] == 40){
                System.out.println(" Este numero esá entre os listados");
            }
        }
    }



}
