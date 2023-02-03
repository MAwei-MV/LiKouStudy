public class SingleMode {
        private volatile static SingleMode singleton;
        private SingleMode() {}
        public static SingleMode getSingleton() {
            if (singleton == null) {
                synchronized (SingleMode.class) {
                    if (singleton == null) {
                        singleton = new SingleMode();
                    }
                }
            }
            return singleton;
        }
}
