package day63_functional_interfaces;

import java.util.List;

@FunctionalInterface
public interface ListFunction <T,R> {
//  return + name+     parameters
     R       apply   (List<T>  list);

}
