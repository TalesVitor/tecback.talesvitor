package br.uniesp.si.techback.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FuncionarioDTO {
    private Long id;
    private String nome;
    private Double salario;
    private String cargo;
}
