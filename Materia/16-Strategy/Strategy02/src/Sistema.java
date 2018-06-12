
import java.util.Random;
import ordenar.BubbleSort;

import ordenar.ListaInteiros;
import ordenar.QuickSort;

public class Sistema {

    public static void main(String[] args) {

        Random r = new Random();
        ListaInteiros li = new ListaInteiros();

        for (int i = 0; i <= 1000000; i++) {
            li.add(r.nextInt(1000000));
        }

//        System.out.println(li);

        long ini = System.currentTimeMillis();
        li.sort( new QuickSort() );
        li.sort( new BubbleSort() );
        long fim = System.currentTimeMillis();

        System.out.println((fim - ini) + " " /*+ li*/);
    }

}
