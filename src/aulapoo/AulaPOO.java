package aulapoo;

import java.util.Scanner;

public class AulaPOO {

    public static void main(String[] args) {
        int opcao, login;
        String senha;
        double valor;
        boolean validLogin;
        Scanner scan = new Scanner(System.in);
        Pessoa p1 = new Pessoa("Davi", 25);
        ContaBancaria c1 = new ContaBancaria(10001, 0, "!@#qwe", p1);

        do {

            System.out.printf("*** BANCO PAGUE MENOS ***\n"
                    + "LOGIN: ");
            login = scan.nextInt();
            System.out.print("SENHA: ");
            senha = scan.next();

            validLogin = c1.validacaoLogin(login, senha);

            if (validLogin) {
                do {
                    System.out.printf("*** BANCO PAGUE MENOS ***\n"
                            + "1- Depositar\n"
                            + "2- Sacar\n"
                            + "3- Visualizar Saldo\n"
                            + "4- Sair\n"
                            + "-> ");
                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor para deposito.\n->");
                            valor = scan.nextDouble();

                            if (valor < 0) {
                                System.out.println("Valor Inválido!");
                            } else {
                                c1.depositar(valor);
                                System.out.println("Valor depositado com sucesso!");
                            }
                            break;
                        case 2:
                            System.out.println("Digite o valor para saque\n->");
                            valor = scan.nextDouble();

                            if (valor < c1.getSaldo()) {
                                c1.sacar(valor);
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo Indisponível!");
                            }
                            break;
                        case 3:
                            System.out.println(c1.exibirInfo());
                            break;
                        case 4:
                            System.out.println("Até breve!");
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                    }
                } while (opcao != 4);

            }
        } while (login != 0);
    }

}
