interface student {

        public void name();
        public void roll_no();
    }

    class s1 implements student {
        public void name() {

            System.out.println("murtaza malik");
        }
        public void roll_no() {

            System.out.println("29");
        }
    }

    class Main {
        public static void main(String[] args) {
            s1 obj = new s1();  // Create an object
            obj.name();
            obj.roll_no();
        }
    }

