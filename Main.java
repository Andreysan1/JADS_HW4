package jads.lesson4;

public class Main {
    public static void main(String[] args) {
        DoubleRelatedList<Cat> drl = new DoubleRelatedList<>();
        System.out.println(drl);
        drl.push(new Cat("cat1", 1));
        drl.push(new Cat("cat2", 2));
        drl.push(new Cat("cat3", 3));
        System.out.println(drl);
        drl.pop();
        System.out.println(drl);
        MyIterator<Cat> mi = drl.getIterator();
        System.out.println(mi.getCurrent());
        System.out.println(mi.hasNext());
        mi.deleteCurrent();
        System.out.println(drl);
        drl.push(new Cat("cat4", 4));
        System.out.println(drl);
        drl.delete(new Cat("cat4", 4));
        System.out.println(drl);
    }
}
