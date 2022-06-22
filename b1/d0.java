package b1;

import java.util.concurrent.Callable;

final class d0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c0 f1656b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f1657c;

    d0(c0 c0Var, Callable callable) {
        this.f1656b = c0Var;
        this.f1657c = callable;
    }

    public final void run() {
        try {
            this.f1656b.q(this.f1657c.call());
        } catch (Exception e5) {
            this.f1656b.p(e5);
        }
    }
}
