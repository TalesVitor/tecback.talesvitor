package br.uniesp.si.techback.service;

import br.uniesp.si.techback.dto.FuncionarioDTO;
import br.uniesp.si.techback.mapper.FuncionarioMapper;
import br.uniesp.si.techback.model.Funcionario;
import br.uniesp.si.techback.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {


    private final FuncionarioRepository repository;

    public List<FuncionarioDTO> listar() {
        return repository.findAll()
                .stream()
                .map(FuncionarioMapper::toDTO)
                .toList();
    }

    public FuncionarioDTO criar(FuncionarioDTO dto) {
        Funcionario f = FuncionarioMapper.toEntity(dto);
        f = repository.save(f);
        return FuncionarioMapper.toDTO(f);
    }

    public FuncionarioDTO buscarPorId(Long id) {
        Funcionario f = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));
        return FuncionarioMapper.toDTO(f);
    }

    public FuncionarioDTO atualizar(Long id, FuncionarioDTO dto) {
        Funcionario f = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));

        f.setNome(dto.getNome());
        f.setCargo(dto.getCargo());

        f = repository.save(f);
        return FuncionarioMapper.toDTO(f);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }


}