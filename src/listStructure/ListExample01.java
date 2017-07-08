package listStructure;

/**
 * 双方向リストの利用例題クラス
 */
public class ListExample01 {

    public static void main(String[] args) {
        StudentList sList = new StudentList();
        sList.addTop(1413001, "太郎");
        sList.addTop(1413002, "花子");
        sList.addTop(1413003, "次郎");
        sList.addTop(1413004, "三郎");
        sList.print();
       // sList.delete(1413003);
        //sList.print();
        //sList.delete(1413004);
        //sList.print();
        sList.search(1413002);
    }
}