package b1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class y implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1703b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ x f1704c;

    y(x xVar, h hVar) {
        this.f1704c = xVar;
        this.f1703b = hVar;
    }

    public final void run() {
        try {
            h a5 = this.f1704c.f1701b.a(this.f1703b.j());
            if (a5 == null) {
                this.f1704c.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f1660b;
            a5.e(executor, this.f1704c);
            a5.d(executor, this.f1704c);
            a5.a(executor, this.f1704c);
        } catch (f e5) {
            if (e5.getCause() instanceof Exception) {
                this.f1704c.d((Exception) e5.getCause());
            } else {
                this.f1704c.d(e5);
            }
        } catch (CancellationException unused) {
            this.f1704c.c();
        } catch (Exception e6) {
            this.f1704c.d(e6);
        }
    }
}
