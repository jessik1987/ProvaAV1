
package ProvaAV1;

public class Proprietario {
    
    private String cpf;

    public Proprietario(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "cpf=" + cpf + '}';
    }
    
    
    
}
