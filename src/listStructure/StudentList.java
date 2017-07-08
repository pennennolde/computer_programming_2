package listStructure;

/**
 * 学生データの双方向リストクラス
 */
class StudentList {
    /** リストの先頭セルへのリンク */
    StudentCell top;

    /** リスト生成コンストラクタ */
    StudentList() {
        top = null;
    }

    /** リストの先頭に行なうセルの追加
     * @param sno 学籍番号
     * @param name 氏名
     * */
    void addTop(int sno, String name) {
        StudentCell sCell = new StudentCell(sno, name);
        sCell.setNext(top);
        if( top != null ) {
            top.setPrev(sCell);
        }
        sCell.setPrev(null);
        top = sCell;
    }

    /**一人前の人を指定して学生を追加するメソッド
     * @param sno1 追加する人の前の人の学籍番号
     * @param sno2 追加する人の学籍番号
     * @param name 追加する人の氏名
     */
 /*   void add(int sno1, int sno2, String name) {
    	StudentCell sCell = this.search(sno1);
    	if( sCell == null ) {
    		System.out.printf("%dを追加できませんでした。", sno2);
    		return;
    	} else {
    		StudentCell newCell = new StudentCell(sno2, name);
    		StudentCell next = sCell.getNext();
    		sCell.setNext(newCell);
    		newCell.setPrev(sCell);
    		if( next == null ) {
    			newCell.setNext(null);
    		} else {
    			newCell.setNext(next);
    			next.setPrev(new                      )
    		}
    		newCell.setNext(next);
    		next.setPrev(newCell);

    	}
    }
*/
    /**学籍番号による検索メソッド
     * @param sno 検索するセルの学籍番号データ
     * @return 検索されたセルへのリンク<br>
     * 存在しない場合は、null が返される
     */
    StudentCell search(int sno) {
    	if( top == null) {
    		System.out.println("学生リストが空なので、検索できません。");
    		return null;
    	} else {
    		StudentCell sCell = top;
    		while( sCell != null) {
    			if( sCell.getNO() == sno ) {
    				System.out.printf("%dを見つけました。%n", sno);
    				sCell.print();
    				return sCell;
    			}
    			sCell = sCell.getNext();
    		}
    		System.out.printf("%dはいませんでした。%n", sno);
    		return null;
    	}
    }

    /** 学籍番号による削除メソッド
     * @param 削除するセルの学籍番号データ
     */
    void delete(int sno) {
        if( top == null ) {
            System.out.println("学生リストが空っぽなので、削除できません");
        } else {
            StudentCell sCell = top;
            while( sCell != null ) {
                if( sCell.getNO() == sno ) {
                    StudentCell prev = sCell.getPrev();
                    StudentCell next = sCell.getNext();
                    System.out.printf("%d の学生を削除します%n", sno);
                    if( prev != null ) {
                        prev.setNext(next);
                    }
                    if( next != null ) {
                        next.setPrev(prev);
                    }
                    if( sCell == top ) {
                        top = next;
                    }
                    return;
                }
                sCell = sCell.getNext();
            }
            System.out.printf("%d の学生がいなかったので、削除できません%n",sno);
        }
    }

    /** リストに格納されているデータの標準出力 */
    void print() {
        if( top == null ) {
            System.out.println("学生リストは空っぽです");
        } else {
            StudentCell sCell = top;
            while( sCell != null ) {
               ((Student) sCell).print();
                sCell = sCell.getNext();
            }
            System.out.println();
        }
    }
}