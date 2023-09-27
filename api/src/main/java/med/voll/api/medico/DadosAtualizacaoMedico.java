package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        Long id,
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco
) {

}
