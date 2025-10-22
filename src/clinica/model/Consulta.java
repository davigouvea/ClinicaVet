package clinica.model;

import clinica.interfaces.Agendavel;
import java.util.Date;

public class Consulta implements Agendavel {
    private Animal animal;
    private Date data;
    private String descricao;

    public Consulta(Animal animal, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
    }

    @Override
    public void agendar(Date data) {
        this.data = data;
        System.out.println("Consulta agendada para o pet " + animal.getNome() + " em " + data);
    }

    @Override
    public void cancelar() {
        this.data = null;
        System.out.println("Consulta agendada para o pet " + animal.getNome() + " em " + data);
    }
}