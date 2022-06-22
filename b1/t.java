package b1;

import java.util.concurrent.Executor;

final class t<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1690a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1691b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private d f1692c;

    public t(Executor executor, d dVar) {
        this.f1690a = executor;
        this.f1692c = dVar;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        if (!hVar.m() && !hVar.k()) {
            synchronized (this.f1691b) {
                if (this.f1692c != null) {
                    this.f1690a.execute(new u(this, hVar));
                }
            }
        }
    }
}
