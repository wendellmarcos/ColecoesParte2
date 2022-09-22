import java.util.*;

public class Programar {

    public static void main(String[] args) {

        cadastroPessoa();

    }

    public static void cadastroPessoa() {

        Deque<NovaPessoa> F = new ArrayDeque<NovaPessoa>();


        System.out.println("*****Cadasrto de Pessoa*****");
        System.out.println("****************************");

        NovaPessoa f1 = new NovaPessoa("Lorenna Beatriz ", "Feminino");
        NovaPessoa f2 = new NovaPessoa("Maria Imaculada", "Feminino");
        NovaPessoa f3 = new NovaPessoa("Shirley Lane", "Feminino");

        F.add(f1);
        F.add(f2);
        F.add(f3);

        Deque<NovaPessoa> M = new ArrayDeque<NovaPessoa>();

        NovaPessoa m1 = new NovaPessoa("Wendell Marcos ", "Masculino");
        NovaPessoa m2 = new NovaPessoa("Shake", "Masculino");
        NovaPessoa m3 = new NovaPessoa("Noah Kaleb", "Masculino");

        M.add(m1);
        M.add(m2);
        M.add(m3);


      /*
        lista.add(new NovaPessoa("Wendell Marcos ", "Masculino"));
        lista.add(new NovaPessoa("Lorenna Beatriz ", "Feminino"));
        lista.add(new NovaPessoa("Maria Imaculada", "Feminino"));
        lista.add(new NovaPessoa("Shake Musaf", "Masculino"));
        lista.add(new NovaPessoa("Noah Kaleb", "Masculino"));
        lista.add(new NovaPessoa("Shirley Lane", "Feminino"));

       */


        System.out.println("******   Feminino   ********");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println(F);
        System.out.println();
        System.out.println("****************************");
        System.out.println("******   Masculino   *******");
        System.out.println("****************************");
        System.out.println(M);


    }
}