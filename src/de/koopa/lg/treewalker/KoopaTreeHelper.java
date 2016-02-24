package de.koopa.lg.treewalker;

import java.util.Optional;

import koopa.core.data.Token;
import koopa.core.data.markers.Start;
import koopa.core.trees.Tree;

public class KoopaTreeHelper {
	public static String getType(Tree tree) {
		if (tree.getData() instanceof Start) {
			return ((Start) tree.getData()).getName();
		} else if (tree.getData() instanceof Token) {
			Token t = (Token) tree.getData();
			for (Object tag : t.getTags()) {
				if ("COMMENT".equalsIgnoreCase(tag.toString())) {
					return "TOKEN_COMMENT";
				}
			}
			Optional<CobolNode> node = CobolNode.getNode(t.getText());
			if (node.isPresent()) {
				return node.get().getType();
			} else {
				return "TOKEN_" + t.getText().toUpperCase();
			}

		}
		return null;

	}
}
