package $package$;

import koopa.core.trees.Tree;
import de.koopa.lg.treewalker.KoopaTreeHelper;

public abstract class CobolBaseTreeListener<T> implements CobolTreeListener<T>{
	
	public CobolBaseTreeListener() {	
	}
	public void enter(Tree tree) {	
		switch(KoopaTreeHelper.getType(tree)) {
$Mapping:{mapEntry | 
			case "$mapEntry$": enter_$mapEntry$(tree); break;
}$
			default: return;
		}
	}

public void exit(Tree tree) {
		switch(KoopaTreeHelper.getType(tree)) {
$Mapping:{mapEntry | 
			case "$mapEntry$": exit_$mapEntry$(tree); break;
}$
			default: return;
		}
	}

$Mapping:{mapEntry | 
	public void enter_$mapEntry$(Tree tree) { $closingCurlyBraclet$
	public void exit_$mapEntry$(Tree tree) { $closingCurlyBraclet$
}$   
}