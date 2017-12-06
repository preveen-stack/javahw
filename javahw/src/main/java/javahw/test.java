package javahw;



import java.util.Collections;

import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.collection.List;
import io.vavr.collection.Queue;
import io.vavr.collection.SortedSet;
import io.vavr.collection.TreeSet;

public class test {
	public static void main(String[] args) {
		
		//vavr?
		
		List<Integer> list1 = List.of(1,23);
		List<Integer> list2 = list1.prepend(0);
		
		Queue<Integer> queue = Queue.of(1,2,3)
				.enqueue(4)
				.enqueue(5);
		
		List<String> list = Collections.unmodifiableList(otherList);
		
		SortedSet<Integer> xs = TreeSet.of(6, 1, 3, 2, 4, 7, 8);
		
		Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
		
		Function0<Integer> s = () -> 10;
		
		Function1<Integer, Integer> s1 = (a) -> 10;
		
		System.out.println("hello world");
	}

}
