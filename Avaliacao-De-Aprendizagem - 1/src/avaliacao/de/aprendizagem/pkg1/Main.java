
package avaliacao.de.aprendizagem.pkg1;


public class Main {

  
    public static void main(String[] args) {
        Advogado funcionario1 = new Advogado("2313212","232332", "123123", "212121", 50000.00, 60, Genero.MASCULINO, 1, "Celso", "75980102020","LJ@gamil.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        Medico funcionario2 = new Medico("2313212","232332", "123123", "212121", 50000.00, 60, Genero.MASCULINO, 1, "Charlles", "75980102020","LJ@gamil.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        Engenheiro funcionario3 = new Engenheiro("2313212","232332", "123123", "212121", 50000.00, 60, Genero.MASCULINO, 1, "Google", "75980102020","LJ@gamil.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        Juridica empresa = new Juridica("23123", "212.121.1221-12", 1,"Clinica do Osvaldo", "7598272737", "Kj@gmail.com",
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        Cliente cliente = new Cliente(1, 12, Genero.FEMININO, 33, "Lula", "7592828-2727", "JU.gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        
        
        
        System.out.println("");
        System.out.println(funcionario1.toString());
        System.out.println("");
        System.out.println(funcionario2);
        System.out.println("");
        System.out.println(funcionario3);
        System.out.println(""); 
        System.out.println(empresa.toString());
        System.out.println("");
        System.out.println(cliente.toString());
    
    }
    
}
