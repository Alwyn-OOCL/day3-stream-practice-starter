import java.util.List;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream()
                .filter(word -> word.endsWith("s"))
                .toList();
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers.stream()
                .filter(anotherNumbers::contains)
                .toList();
    }


}