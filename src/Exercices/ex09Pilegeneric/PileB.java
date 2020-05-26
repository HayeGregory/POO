package Exercices.ex09Pilegeneric;

public interface PileB<T> extends Pile<T> {

    T peek(T classe);
    T pop(T classe);
    void push( T toPush);

}
