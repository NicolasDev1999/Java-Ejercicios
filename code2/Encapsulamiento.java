package code2;

public class Encapsulamiento {
    public static class persons {
        private String[] name;
        public String[] getName() {
            return name;
        }
        public void setName(String[] name) {
            this.name = name;
        }
    }
}
