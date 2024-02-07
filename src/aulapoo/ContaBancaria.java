package aulapoo;

public class ContaBancaria {

    //Atributos da classe
    private int numero;
    private double saldo;
    private String senha;
    private Pessoa pessoa;

    //Construtor
    ContaBancaria() {
    }

    ContaBancaria(int numero, double saldo, String senha, Pessoa pessoa) {
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    //Métodos da classe
    public void depositar(double valor) {
        //Não podemos depositar valores menores ou igual a 0.
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        //Não podemos sacar valores acima do saldo
        if (valor < this.saldo) {
            this.saldo = this.saldo - valor;
        }
    }

    //Métodos Getters e Setters
    public double getSaldo() {
        return this.saldo;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa p) {
        this.pessoa = p;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validacaoLogin(int login, String senha) {
        if (this.numero == login && this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public String exibirInfo() {
        return String.format("Conta Bancária id %d\n"
                + "Titular: %s\n"
                + "Saldo: R$ %.2f",
                this.numero, this.pessoa.getNome(), this.saldo);
    }

}
