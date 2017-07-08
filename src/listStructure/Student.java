package listStructure;

/**
 * 学生データのクラス
 */
class Student {
    /** 学籍番号 */
    private int sno;
    /** 氏名 */
    private String name;

    /** 学籍番号と氏名を与えて、学生インスタンスの作成 */
    Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    /** 学生データの標準出力 */
    void print() {
        System.out.printf("(%7d %s)%n", sno, name);
    }

    /** 学籍番号のゲッター */
    int getNO() {
        return sno;
    }

    /** 氏名のゲッター */
    String getName() {
        return name;
    }
}