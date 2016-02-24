package de.koopa.lg.treewalker;

import koopa.core.trees.Tree;

public interface CobolTreeListener<T> {
	public void enter(Tree tree);

	public void exit(Tree tree);

	public T getResult();
}