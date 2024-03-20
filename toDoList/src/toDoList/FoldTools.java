package toDoList;

import java.util.function.Predicate;

public interface FoldTools<T> {
	
	int FoldCountByStatus(LinkedList<?> ll, Predicate<?> tester);

}
