package atividades_aula.aula1.aula3.ex6;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crie duas contas com números iguais
        ContaBancaria contaA = new ContaBancaria(12345);
        ContaBancaria contaB = new ContaBancaria(12345);

        // 2. Crie uma conta com número diferente
        ContaBancaria contaC = new ContaBancaria(99999);

        System.out.println("--- Testando equals() ---");
        
        // Teste A e B: Devem ser IGUAIS (graças ao nosso equals())
        boolean aIgualB = contaA.equals(contaB);
        System.out.println("Conta A é igual à Conta B? " + aIgualB); // Deve ser true

        // Teste A e C: Devem ser DIFERENTES
        boolean aIgualC = contaA.equals(contaC);
        System.out.println("Conta A é igual à Conta C? " + aIgualC); // Deve ser false
        
        System.out.println("\n--- Testando toString() ---");
        
        // 3. Imprima um objeto diretamente
        // O Java automaticamente chama o método .toString()
        System.out.println(contaA);
        System.out.println(contaB);
        System.out.println(contaC);
    }
}
