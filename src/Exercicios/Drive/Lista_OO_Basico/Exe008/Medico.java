package Exercicios.Drive.Lista_OO_Basico.Exe008;

public class Medico {
    private String nome;

    public Medico(String nome) {
        this.nome = nome;
    }

    public void atender(Paciente paciente) {
        System.out.println(nome + " está atendendo o paciente " + paciente.getNome() + ".");
    }
}