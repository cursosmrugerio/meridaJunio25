package com.curso.v9;

@FunctionalInterface
public interface Predicado<T> {
	boolean probar(T t);
}
