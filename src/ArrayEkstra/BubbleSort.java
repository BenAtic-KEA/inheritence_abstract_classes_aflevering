package ArrayEkstra;
import java.util.ArrayList;

public class BubbleSort {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(20);
        numbers.add(2);
        numbers.add(49);
        numbers.add(30);
        numbers.add(1);

        System.out.println(numbers);

        bubbleSort(numbers);

        System.out.println(numbers);


    }

    public static void bubbleSort(ArrayList<Integer> list){
        int temp;
        int i, j;
        int N = list.size();

        for (j = 1; j < N - 1; j++){
            for(i = 0; i < N - 1; i++){
                if (list.get(i) > (list.get(i + 1))){

                    temp = list.get(i);

                    list.set(i,list.get(i + 1));
                    list.set(i + 1, temp);

                }
            }
        }
    }

}
