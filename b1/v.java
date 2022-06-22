package b1;

import java.util.concurrent.Executor;

final class v<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1695a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1696b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private e<? super TResult> f1697c;

    public v(Executor executor, e<? super TResult> eVar) {
        this.f1695a = executor;
        this.f1697c = eVar;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        if (hVar.m()) {
            synchronized (this.f1696b) {
                if (this.f1697c != null) {
                    this.f1695a.execute(new w(this, hVar));
                }
            }
        }
    }
}
