package aulapoo;

public class Pessoa {
    //Atributos
        private String nome;
        private int idade;
    
    //Método Construtor   
    Pessoa() {} 
    
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
        
    //Métodos de Acesso
     public String getNome(){
         return this.nome;
     }
     
     public int getIdade(){
         return this.idade;
     }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public void setIdade(int idade){
         this.idade = idade;
     }
}
