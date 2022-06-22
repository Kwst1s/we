package b1;

import java.util.concurrent.Executor;

final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1700a;

    /* renamed from: b  reason: collision with root package name */
    private final g<TResult, TContinuationResult> f1701b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f1702c;

    public x(Executor executor, g<TResult, TContinuationResult> gVar, c0<TContinuationResult> c0Var) {
        this.f1700a = executor;
        this.f1701b = gVar;
        this.f1702c = c0Var;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        this.f1700a.execute(new y(this, hVar));
    }

    @Override // b1.e
    public final void b(TContinuationResult tcontinuationresult) {
        this.f1702c.q(tcontinuationresult);
    }

    @Override // b1.b
    public final void c() {
        this.f1702c.t();
    }

    @Override // b1.d
    public final void d(Exception exc) {
        this.f1702c.p(exc);
    }
}
