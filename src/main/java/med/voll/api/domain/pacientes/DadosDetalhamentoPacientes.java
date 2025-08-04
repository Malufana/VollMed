package med.voll.api.domain.pacientes;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoPacientes(
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone,
        Endereco endereco
) {
    public DadosDetalhamentoPacientes(Paciente pacientes){
        this(
                pacientes.getId(),
                pacientes.getNome(),
                pacientes.getEmail(),
                pacientes.getCpf(),
                pacientes.getTelefone(),
                pacientes.getEndereco()
        );
    }
}
