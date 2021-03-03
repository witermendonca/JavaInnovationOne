package collectionsStreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploTreeMap {

    public static void main(String[] args) {

        //Cria a a cole��o de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona 4 estudantes para a cole��o
        estudantes.add("Carlos");
        estudantes.add("Mariana");
        estudantes.add("Rafaela");
        estudantes.add("Pedro");

        System.out.println(estudantes);

        //Altera um estudante no �ndice 2
        estudantes.set(2, "Rafinha");

        System.out.println(estudantes);

        //Altera dado estudante
        estudantes.set(estudantes.indexOf("Pedro"), "Pedrinho");

        System.out.println(estudantes);

        //Remove um estudante no �ndice 0
        estudantes.remove(0);

        System.out.println(estudantes);

        //Recupera um estudante no �ndice 2;
        String estudante = estudantes.get(2);

        System.out.println(estudante);

        System.out.println(estudantes.size());

        for (String nomeEstudante: estudantes) {
            System.out.println(nomeEstudante);
        }

        Iterator<String> iterator = estudantes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
