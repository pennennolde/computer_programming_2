package listStructure;

/**
 * 学生データの両方向リストのセル化クラス<br>
 * Student クラス を継承
 */
class StudentCell extends Student {
    /** 次のセルへのリンク */
    private StudentCell next;
    /** 前のセルへのリンク */
    private StudentCell prev;

    /** 学籍番号と氏名を与えてセルを生成するコンストラクタ */
    StudentCell(int sno, String name) {
        super(sno, name);
        next = null;
        prev = null;
    }

    /** 与えられた StudentCell インスタンスを次のセルとしてリンク */
    void setNext(StudentCell sCell) {
        this.next = sCell;
    }

    /** 与えられた StudentCell インスタンスを前のセルとしてリンク */
    void setPrev(StudentCell sCell) {
        this.prev = sCell;
    }

    /** 次のセルへのリンク値のゲッター */
    StudentCell getNext() {
        return next;
    }

    /** 前のセルへのリンク値のゲッター */
    StudentCell getPrev() {
        return prev;
    }

    /** セルの情報を標準出力 */
    void print() {
        if( prev == null ) {
            System.out.printf("prev=%7s, ", "null");
        } else {
            System.out.printf("prev=%7d, ", prev.getNO());
        }
        if( next == null ) {
            System.out.printf("next=%7s  ", "null");
        } else {
            System.out.printf("next=%7d  ", next.getNO());
        }
        super.print();
    }
}