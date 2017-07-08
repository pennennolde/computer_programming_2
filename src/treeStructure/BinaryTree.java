package treeStructure;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot( Node node ) {
		root = node;
		if( node != null ) node.setParent( null );
	}

	public boolean isEmpty() {
		return ( getRoot() == null );
	}

	public void show() {
		if( isEmpty() ) {
			System.out.println(" (空っぽだね～) ");
		} else {
			System.out.println("根＝" + getRoot().getName());
			show( getRoot() );
			System.out.println();
		}
	}

	public void show( Node node) {
		if( node != null ) {
			System.out.print( node.getName() + ":");
			System.out.print( (node.getLeft() != null) ? node.getLeft().getName() : "null");
			System.out.print(",");
			System.out.print( (node.getRight() != null) ? node.getRight().getName() : "null");
			System.out.println();
			show( node.getLeft() );
			show( node.getRight() );
		}
	}
}
