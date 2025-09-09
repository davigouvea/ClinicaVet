package br.com.clinica;

import exceptions.AgendamentoException;
import model;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Tutor tutorJoao = new Tutor("João Silva", "111.222.333-44", "9999-8888");
        clinica.cadastrarTutor(tutorJoao);

        Animal rex = new Cachorro("Rex", 5, tutorJoao, "Labrador");
        Animal felix = new Gato("Felix", 3, tutorJoao, "Siamês");
        clinica.cadastrarAnimal(rex);
        clinica.cadastrarAnimal(felix);

        System.out.println("Animais cadastrados na clínica:");
        for (Animal animal : clinica.getAnimais()) {
            System.out.println("- " + animal.getNome() + ", Tutor: " + animal.getTutor().getNome());
            System.out.println("  Som: " + animal.emitirSom());
        }

        Consulta consultaRex = new Consulta(rex, "Check-up anual");
        try {
            clinica.agendarConsulta(consultaRex);
            consultaRex.agendar(new Date()); } 
            catch (AgendamentoException e) {
            System.err.println("Erro ao agendar: " + e.getMessage());
        }

        System.out.println("\n--- Testando Exceção ---");
        try {
            clinica.agendarConsulta(null);
        } catch (AgendamentoException e) {
            System.err.println("Erro ao agendar: " + e.getMessage());
        }
    }
}