package Exercices.ex09Pilegeneric;

public interface Pile<T> {

   T peek();
   T pop();
   void push( T toPush);

}
