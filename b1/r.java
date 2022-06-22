package b1;

import java.util.concurrent.Executor;

final class r<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1685a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1686b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private c<TResult> f1687c;

    public r(Executor executor, c<TResult> cVar) {
        this.f1685a = executor;
        this.f1687c = cVar;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        synchronized (this.f1686b) {
            if (this.f1687c != null) {
                this.f1685a.execute(new s(this, hVar));
            }
        }
    }
}
