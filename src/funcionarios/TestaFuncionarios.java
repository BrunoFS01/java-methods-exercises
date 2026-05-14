package funcionarios;

public class TestaFuncionarios {

    public static void main(String[] args) {
        //Criar objetos
        Funcionarios f1 = new Funcionarios();
        Funcionarios f2 = new Funcionarios();
        
        //Atribuir valores aos objetos
        f1.nome = "Bruno Fernandes";
        f1.saldo = 2500.00;
        f1.salario = 1500.00;
        
        f2.nome = "Marcos Costa";
        f2.saldo = 3500.00;
        f2.salario = 2500.00;
        
        //Mostrar
        System.out.println("Funcionário 1: ");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salário: " + f1.saldo);
        System.out.println("");
        System.out.println("Funcionário 2: ");
        System.out.println("Nome: " + f2.nome);
        System.out.println("Salário: " + f2.saldo);
        System.out.println("----------------------");
        
        //Modificar com métodos (adicionar deposito)
        f1.deposita(500.00);
        f2.deposita(1000.00);
        
        //Mostrar depois do deposito
        System.out.println("SALDO + DEPÓSITO");
        System.out.println("Funcionário 1: ");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Saldo atual: " + (f1.saldo));
        System.out.println("");
        System.out.println("Funcionário 2: ");
        System.out.println("Nome: " + f2.nome);
        System.out.println("Saldo atual: " + (f2.saldo));
        System.out.println("----------------------");
        
        //Mostrar saldo somado com salario
        System.out.println("SALDO + SALARIO");
        System.out.println("Funcionário 1: ");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Saldo total: " + f1.consultaSaldoDisponivel());
        System.out.println("");
        System.out.println("Funcionário 2: ");
        System.out.println("Nome: " + f2.nome);
        System.out.println("Saldo total: " + f2.consultaSaldoDisponivel());
       
    }
    
}