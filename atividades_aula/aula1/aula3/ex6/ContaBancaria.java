package atividades_aula.aula1.aula3.ex6;
import java.util.Objects;

public class ContaBancaria {
    
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria [Número: " + this.numero + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        ContaBancaria outraConta = (ContaBancaria) obj;

        return this.numero == outraConta.numero;
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numero);
    }
}