package Contas;

import java.util.List;
import lombok.Data;

@Data
public class Cliente {

    private String nome; // Nome do cliente
    private List<Conta> contas; // Lista de contas associadas ao cliente

}
