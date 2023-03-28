/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, Setor.JURIDICO, salario, idade, genero, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado -->" 
                + "\noab -->" + this.oab +
                "\n Id -->" + this.id +
                "\n Idade -->" + this.idade+
                "\n Genero -->" + this.genero+
                "\nNome -->"+ this.nome + 
                "\nTelefone -->" + this.telefone +
                "\nemail -->" + this.email +
                "\n Cpf -->"+ this.cpf+
                "\nRG -->" + this.rg+
                "\n Matricula -->" + this.matricula+
                "\nSetor -->"+ this.setor+
                "\nSalario -->" + this.salario+
                "\nLogradouro: -->" + this.endereco.logradouro + 
                "\n Numero: -->"+ this.endereco.numero+
                "\nComplemento -->" + this.endereco.complemento +
                "\nCep -->"+ this.endereco.cep +
                "\nCidade -->" + this.endereco.cidade + 
                "\n Unidade Federativa -->" + this.endereco.uf;
                
    }
    
    
    
}
