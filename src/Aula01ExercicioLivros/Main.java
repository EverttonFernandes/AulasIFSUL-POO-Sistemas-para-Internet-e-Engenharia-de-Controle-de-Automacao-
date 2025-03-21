package Aula01ExercicioLivros;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("POO com java", "Carlos", 2025, true, 200.00);
        Livro livro2 = new Livro("Programacao Estruturada", "Maria", 2025, false, 150.00);
        Livro livro3 = new Livro("SOLID para Ninjas", "Mauricio Aniche", 2018, true, 250.00);

        livro1.mostrarInformacoesSeEstiverDisponivel();
        livro2.mostrarInformacoesSeEstiverDisponivel();
        livro3.mostrarInformacoesSeEstiverDisponivel();
    }
}
