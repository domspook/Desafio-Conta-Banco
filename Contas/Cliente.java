package Contas;

import java.util.List;
import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private List<Conta> contas;

}
