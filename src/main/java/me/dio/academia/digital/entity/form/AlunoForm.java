package me.dio.academia.digital.entity.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max caracteres}")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente.")
  @CPF(message = "'{validatedValued}' é inválido")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max caracteres}")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente.")
  @Past(message = "'{validatedValued}' é inválido")
  private LocalDate dataDeNascimento;
}
