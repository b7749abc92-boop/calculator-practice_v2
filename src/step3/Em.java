package step3;

public enum Em {
    ad('+') {
        @Override
        public double ay(double n1, double n2) {
            return n1 + n2;
        }
    },
    su('-') {
        @Override
        public double ay(double n1, double n2) {
            return n1 - n2;
        }
    },
    mu('*') {
        @Override
        public double ay(double n1, double n2) {
            return n1 * n2;
        }
    },
    di('/') {
        @Override
        public double ay(double n1, double n2) {
            return n1 / n2;
        }
    };

    private final char op;

    Em(char op) {
        this.op = op;
    }

    public abstract double ay(double n1, double n2);

    public  static Em fC (char a) {
        for (Em em : values()) {
            if (em.op == a) {
                return em;
            }
        }
        if (!(a == '+' || a == '-' || a == '*' || a == '/')) {
            System.out.println("잘못된 입력입니다.");

        }
            return null;

    }
}
