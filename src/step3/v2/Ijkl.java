package step3.v2;

public enum Ijkl {
    ad2('+') {
        @Override
        public double opr(double a, double b) {
            return a + b;
        }
    },
    su2('-') {
        @Override
        public double opr(double a, double b) {
            return a - b;
        }
    },
    mu2('*') {
        @Override
        public double opr(double a, double b) {
            return a * b;
        }
    },
    di2('/') {
        @Override
        public double opr(double a, double b) {
            return a / b;
        }
    };

    private final char aB1;

    Ijkl(char aB1) {
        this.aB1 = aB1;
    }
    public abstract double opr(double nb1, double nb2);

    public  static Ijkl kl (char aB) {
        for(Ijkl jl : Ijkl.values()) {
            if(jl.aB1 == aB) {
                return jl;
            }
        }
        if (!(aB == '+' || aB == '-' || aB == '*' || aB == '/')) {
            System.out.println("잘못된 입력입니다.");
        }
    return  null;
    }


}
