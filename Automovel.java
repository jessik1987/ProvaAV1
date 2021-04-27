
package ProvaAV1;

import java.util.ArrayList;
import java.util.List;

public class Automovel {
    
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private float valor;
    
    private List<Proprietario> proprietarios;

    public Automovel(String marca, String modelo, int ano, int km, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
        this.proprietarios = new ArrayList<Proprietario>();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public float getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", km=" + km + ", valor=" + valor + '}';
    }
    
    public Proprietario pesquisar(String cpf) {
        for (var proprietario: proprietarios) {
            if (proprietario.getCpf().equals(cpf)) {
                return proprietario;
            }
        }
        return null; // conta não encontrada        
    }
    
    public boolean adicionarProprietario(Proprietario proprietario){   
       this.proprietarios.add(proprietario);
       return true;
    };
    
    public void removerProprietario(String cpf){
        var proprietario2 = pesquisar(cpf);
           if(proprietario2 == null){
               System.out.println("ALERTA: proprietario inexistente!");
            }else{
               this.proprietarios.remove(proprietario2);
           }  
    };
    
    public void exibirProprietarios(ArrayList<Proprietario> proprietarios){      
        for (Proprietario proprietario: proprietarios) {
            System.out.println(proprietario);
        }
    }
}
