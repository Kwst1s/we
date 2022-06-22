package b1;

import java.util.concurrent.Executor;

final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1676a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f1677b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f1678c;

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, c0<TContinuationResult> c0Var) {
        this.f1676a = executor;
        this.f1677b = aVar;
        this.f1678c = c0Var;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        this.f1676a.execute(new o(this, hVar));
    }

    @Override // b1.e
    public final void b(TContinuationResult tcontinuationresult) {
        this.f1678c.q(tcontinuationresult);
    }

    @Override // b1.b
    public final void c() {
        this.f1678c.t();
    }

    @Override // b1.d
    public final void d(Exception exc) {
        this.f1678c.p(exc);
    }
}
