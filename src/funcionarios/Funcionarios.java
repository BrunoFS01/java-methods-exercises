package funcionarios;

//Criar classe
public class Funcionarios {
    //Atributos da classe
    String nome;
    double saldo;
    double salario;
    
    
    //Métodos
    void deposita(double valor) {
        this.saldo += valor;
    }
    
    double consultaSaldoDisponivel () {
        return this.saldo + this.salario;
    }
}
