package clinica.model;

import clinica.exceptions.AgendamentoException;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Tutor> tutores;
    private List<Animal> animais;
    private List<Consulta> consultas;

     public void cadastrarTutor(Tutor tutor) {
        this.tutores.add(tutor);
    }

    public void cadastrarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void agendarConsulta(Consulta consulta) throws AgendamentoException {
        if (consulta == null) {
            throw new AgendamentoException("A consulta não pode ser nula.");
        }
        this.consultas.add(consulta);
    }

    public List<Animal> getAnimais() {
        return animais;
    }
}