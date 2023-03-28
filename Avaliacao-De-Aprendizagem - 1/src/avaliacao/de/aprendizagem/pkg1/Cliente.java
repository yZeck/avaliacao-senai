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
public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(idade, genero, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente -->" + 
                "\nprotocoloAtendimento -->" + this.protocoloAtendimento +
                "\n Id -->" + this.id +
                "\n Idade -->" + this.idade+
                "\n Genero -->" + this.genero+
                "\nNome -->"+ this.nome + 
                "\nTelefone -->" + this.telefone +
                "\nemail -->" + this.email +
                "\nLogradouro: -->" + this.endereco.logradouro + 
                "\n Numero: -->"+ this.endereco.numero+
                "\nComplemento -->" + this.endereco.complemento +
                "\nCep -->"+ this.endereco.cep +
                "\nCidade -->" + this.endereco.cidade + 
                "\n Unidade Federativa -->" + this.endereco.uf;
                
    }
        
        
}
