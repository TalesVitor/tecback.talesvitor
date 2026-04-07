package br.uniesp.si.techback.mapper;

import br.uniesp.si.techback.dto.FuncionarioDTO;
import br.uniesp.si.techback.model.Funcionario;

public class FuncionarioMapper {

    public static FuncionarioDTO toDTO(Funcionario f) {
        FuncionarioDTO dto = new FuncionarioDTO();
        dto.setId(f.getId());
        dto.setNome(f.getNome());
        dto.setCargo(f.getCargo());
        return dto;
    }

    public static Funcionario toEntity(FuncionarioDTO dto) {
        Funcionario f = new Funcionario();
        f.setId(dto.getId());
        f.setNome(dto.getNome());
        f.setCargo(dto.getCargo());
        return f;
    }
}
