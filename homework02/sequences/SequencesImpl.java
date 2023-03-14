package homework02.sequences;

public class SequencesImpl implements SequenceGenerator {
    @Override
    public void a(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.print((k += 2) + "  ");
        }
    }

    @Override
    public void b(int n) {
        int k = -1;
        for (int i = 0; i < n; i++) {
            System.out.print((k += 2) + "  ");
        }
    }

    @Override
    public void c(int n) {
        int k = 1;
        int y = 0;
        for (int i = 0; i < n; i++) {
            y += k;
            k += 2;
            System.out.print(y + "  ");
        }
    }

    @Override
    public void d(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + "  ");
        }
    }

    @Override
    public void e(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                k -= 2;
            } else {
                k += 2;
            }
            System.out.print(k + "  ");
        }
    }

    @Override
    public void f(int n) {
        int k = 1;
        int y = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(k + "  ");
            if (k > 0) {
                k -= y;
            } else {
                k += y;
            }
            y += 2;
        }
    }

    @Override
    public void g(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print((i * (i - (i * 2))) + "  ");
            } else {
                System.out.print((i * i) + "  ");
            }
        }
    }

    @Override
    public void h(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print((k += 1) + "  ");
            } else {
                System.out.print(0 + "  ");
            }
        }
    }

    @Override
    public void i(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
            System.out.print(k + "  ");
        }
    }

    @Override
    public void j(int n) {
        int k = 1;
        int y = 0;
        int z = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(z + "  ");
            z = y + k;
            y = k;
            k = z;
        }
    }
}
