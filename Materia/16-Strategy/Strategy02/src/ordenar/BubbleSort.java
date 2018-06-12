
package ordenar;

public class BubbleSort implements Ordenador{

    @Override
    public void ordenar(int[] itens) {
        quickSort(itens);
    }
    
    private void quickSort(int[] itens){
        int aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (itens[j] > itens[j + 1]) {
                    aux = itens[j];
                    itens[j] = itens[j + 1];
                    itens[j + 1] = aux;
                }
            }
        }
    }
    
}
