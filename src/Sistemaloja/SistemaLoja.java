
package Sistemaloja;

public class SistemaLoja {
    
    public static void main(String[] args) {
        //prorama Principal
        //Funcionario f1 = new Funcionario();
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        
        Vendedor v1 = new Vendedor("maros", "65789098889", 20, "89765478", "cabulo");
        System.out.println(v1.toString());
        
        Gerente G1 = new Gerente("Adriano", "7685787333000", 20,"88224532", "saboeiro");
        System.out.println(G1.toString());
        
        
        
        
    }
    
}
