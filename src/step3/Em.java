package step3;

public enum Em {
    ad('+'),
    su('-'),
    mu('*'),
    di('/');

    private final char op;

    Em(char op) {
        this.op = op;
    }
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
