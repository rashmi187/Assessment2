package module4;
public class GarbageCollection {
        public void finalize() {
            System.out.println("Garbage collected");
        }
        public static void main(String[] args) {
            GarbageCollection obj = new GarbageCollection();
            obj = null;
            System.gc();
        }
    }

