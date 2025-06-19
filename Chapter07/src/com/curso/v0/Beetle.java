package com.curso.v0;

interface HasExoskeleton {
	   double size = 2.0f;
	   abstract int getNumberOfSections(); //public
	}

	abstract class Insect implements HasExoskeleton {
	   abstract int getNumberOfLegs();
	}

	public class Beetle extends Insect {
	   @Override
	   int getNumberOfLegs() { return 6; }
	   @Override
	   public int getNumberOfSections() { return 1; }
	}