package treeStructure;

public class BinarySearchTree extends BinaryTree {

	public BinarySearchTree() {
		super();
	}

	public Node makeNode( String name ) {
		return new Node( name );
	}

	/*
	 * 探索メソッド
	 */
	public void searchOut( String name ) {
		if( this.search( makeNode(name) ) == null ) {
			System.out.println("\"" + name+"\" は見つからなかったよ!");
		} else {
			System.out.println("\"" + name+"\"を見つけたよ!");
		}
	}

	public Node search( Node node ) {
		if( isEmpty() ) return null;
		return (this.search(node, getRoot() ) );
	}

	public Node search ( Node newNode, Node node ) {
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
		return null;
	}


	/*
	 * 追加メソッド
	 */
	public Node insert( String name ) {
		Node newNode = new Node(name);
		return insert( newNode );
	}

	public Node insert( Node newNode ) {
		if( isEmpty() ) {
			setRoot( newNode );
			return getRoot();
		} else {
			Node node = getRoot();
			while( true ) {
				if( node.equals( newNode ) ) {
					return node;
				} else if( node.isSmall( newNode ) ) {
					if( node.getRight() == null ) {
						node.setRight( newNode );
						return newNode;
					}
					node = node.getRight();
				} else {
					if( node.getLeft() == null ) {
						node.setLeft( newNode );
						return newNode;
					}
					node = node.getLeft();
				}
			}
		}
	}


	/*
	 * 削除メソッド
	 */
	public void delete(String name) {

		Node node = this.search( makeNode(name) );
		Node node1 = this.search( makeNode(name) );

		if( node == null ) {
			System.out.println("\"" + name + "\" は見つからないよ!?");
		} else {

	// 葉ノード削除の場合
			if( node.getLeft() == null && node.getRight() == null ) {
				if( node.getParent().getLeft() == node ) {
					node.getParent().setLeft(null);
				} else {
					node.getParent().setRight(null);
				}

	// 子ノードを左に1つ持つ場合
			} else if( node.getLeft() != null && node.getRight() == null ) {
				if( node.getParent().getLeft() == node ) {
					node.getParent().setLeft( node.getLeft() );
				} else {
					node.getParent().setRight( node.getLeft() );
				}

	// 子ノードを右に1つ持つ場合
			} else if( node.getLeft() == null && node.getRight() != null ) {
				if( node.getParent().getLeft() == node ) {
					node.getParent().setLeft( node.getRight() );
				} else {
					node.getParent().setRight( node.getRight() );
				}

	// 子ノードを2つ持つ場合
			} else {
				node = node.getLeft();
				if( node.getRight() != null ) {
					while( node.getRight() != null ) {
						//if( (node.getName()).compareTo(node.getRight().getName()) < 0 ) {
						node = node.getRight();
						//} else {
						if( node.getRight() == null ) break;
					}
				}
				String max = node.getName();

					// 葉ノード削除の場合
				if( node.getLeft() == null && node.getRight() == null ) {
					if( node.getParent().getLeft() == node ) {
						node.getParent().setLeft(null);
					} else {
						node.getParent().setRight(null);
					}
					// 子ノードを左に1つ持つ場合
				} else if( node.getLeft() != null && node.getRight() == null ) {
					if( node.getParent().getLeft() == node ) {
						node.getParent().setLeft( node.getLeft() );
					} else {
						node.getParent().setRight( node.getLeft() );
					}
				}
				node1.setName( max );
			}
			System.out.println("\"" + name + "\"を削除したよ!");
		}
	}
}


