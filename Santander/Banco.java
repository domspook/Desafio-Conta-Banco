package Santander;

import java.util.List;

import Contas.Conta;
import lombok.Data;
@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

}
