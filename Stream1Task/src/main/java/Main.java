
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //    Сделать массив int. Из него получить IntStream. Для него
        int[] array = {0, -1, 9, -5, 34, 2, 7, 1, 0, 1};

        //1. Найти среднее значение элементов массива
        OptionalDouble average = IntStream.of(array).average();
        System.out.println("Average : " + average.orElse(-1));

        //2. Найти минимальный элемент, значение и индекс
        int min = IntStream.of(array).min().getAsInt();
        System.out.println("Min : " + min);

        //Optional<Integer> minIndex = IntStream.of(array).filter(num -> num == min).forEach(i -> array[i]).findAny();
//       System.out.println("Min index: " + evenIndexedNames);


        //3. Посчитать количество элементов равных нулю
        int amountOfZero = (int) IntStream.of(array).filter(num -> num == 0).count();
        System.out.println("Amount of zero : " + amountOfZero);

        //4. Посчитать количество элементов больше нуля
        int amountOfBiggerZero = (int) IntStream.of(array).filter(num -> num > 0).count();
        System.out.println("Amount of bigger zero : " + amountOfBiggerZero);

        //5. Помножить элементы массива на число
        int[] istOfIntegers = IntStream.of(array).map(e -> e * 2).toArray();
        System.out.println("Multiplied array: ");
        IntStream.of(istOfIntegers).forEach(System.out::println);


    }


}
