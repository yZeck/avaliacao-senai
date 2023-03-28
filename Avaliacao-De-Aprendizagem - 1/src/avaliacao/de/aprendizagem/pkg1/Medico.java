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
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, Setor.SAUDE, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico -->" +
                "\ncrm -->" + crm +
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
                "\nLogradouro -->:" + this.endereco.logradouro + 
                "\n Numero: -->"+ this.endereco.numero+
                "\nComplemento -->" + this.endereco.complemento +
                "\nCep -->"+ this.endereco.cep +
                "\nCidade -->" + this.endereco.cidade + 
                "\n Unidade Federativa -->" + this.endereco.uf;
                
   
    
}
}