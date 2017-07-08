package treeStructure;

public class AVLTree extends BinarySearchTree {

	public AVLTree() {
		super();
	}

	public BfNode makeNode( String name ) {
		return new BfNode( name );
	}

	public BfNode search( String name ) {
		BfNode node = new BfNode( name );
		return search( node );
	}

	public BfNode search( BfNode node ) {
		if( is Empty() ) return null;
		return( this.search( node, getRoot() ) );
	}

	public BfNode search( BfNode newNode, BfNode node ) {
		if( node == null ) return null;
		while( node != null ) {
			if( node.equals( newNode ) ) {
				return node;
			} else if( node.isSmall( newNode ) ) {
				node = node.getRight();
			} else {
				node = node.getLeft();
			}
		}
	}
}
