
package ProvaAV1;

public class Main {

    public static void main(String[] args) {
    
        var automovel01 = new Automovel("Ford", "Ka", 2020, 20000, 37000);
        
        var dono1 = new Proprietario("111111111");
        var dono2 = new Proprietario("394985764");
        
        automovel01.adicionarProprietario(dono1);
        automovel01.adicionarProprietario(dono2);
        
        System.out.println("Proprietarios adicionados!");
        
        automovel01.removerProprietario("111111111");
        
        System.out.println("Proprietario " + dono1 + " removido!");
        
        System.out.println(automovel01);
        
        System.out.println("---------------------------------------------------");
        
        var automovel02 = new Automovel("Honda", "Civic", 2012, 100000, 40000);
        
        var dono3 = new Proprietario("394985764");
        var dono4 = new Proprietario("675858585");
        var dono5 = new Proprietario("272626262");
                
        automovel02.adicionarProprietario(dono3);
        automovel02.adicionarProprietario(dono4);
        automovel02.adicionarProprietario(dono5);
        
        System.out.println("Proprietarios adicionados!");
        
        automovel02.removerProprietario("675858585");
        
        System.out.println("Proprietario " + dono4 + " removido!");
        
        System.out.println(automovel02);
        
        System.out.println("Proprietarios: ");
                
    }
    
}
