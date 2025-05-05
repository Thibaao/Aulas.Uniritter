package Exercicios.Drive.Lista_OO_Basico.Exe008;

public class TesteMedico {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. Orestes");
        Paciente paciente = new Paciente("Rodrigo");

        medico.atender(paciente);
    }
}