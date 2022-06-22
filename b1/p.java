package b1;

import java.util.concurrent.Executor;

final class p<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1681a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1682b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b f1683c;

    public p(Executor executor, b bVar) {
        this.f1681a = executor;
        this.f1683c = bVar;
    }

    @Override // b1.z
    public final void a(h hVar) {
        if (hVar.k()) {
            synchronized (this.f1682b) {
                if (this.f1683c != null) {
                    this.f1681a.execute(new q(this));
                }
            }
        }
    }
}
