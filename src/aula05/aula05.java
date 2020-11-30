package aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("jubileu");
        p1.abrirconta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("creuza");
        p2.abrirconta("CP");

        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(4000);
        p1.sacar(350);
        p1.fecharconta();



        p1.estadoAtual();
        p2.estadoAtual();
    }
}
