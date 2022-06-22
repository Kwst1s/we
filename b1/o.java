package b1;

import java.util.concurrent.Executor;

final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1679b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f1680c;

    o(n nVar, h hVar) {
        this.f1680c = nVar;
        this.f1679b = hVar;
    }

    public final void run() {
        try {
            h hVar = (h) this.f1680c.f1677b.a(this.f1679b);
            if (hVar == null) {
                this.f1680c.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f1660b;
            hVar.e(executor, this.f1680c);
            hVar.d(executor, this.f1680c);
            hVar.a(executor, this.f1680c);
        } catch (f e5) {
            if (e5.getCause() instanceof Exception) {
                this.f1680c.f1678c.p((Exception) e5.getCause());
            } else {
                this.f1680c.f1678c.p(e5);
            }
        } catch (Exception e6) {
            this.f1680c.f1678c.p(e6);
        }
    }
}
