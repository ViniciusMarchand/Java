package med.voll.api.medico;
import med.voll.api.enredecos.DadosEndereco;


public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especilidade, DadosEndereco endereco) {
    
}
