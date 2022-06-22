package b1;

import java.util.concurrent.Executor;

final class l<TResult, TContinuationResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1671a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, TContinuationResult> f1672b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f1673c;

    public l(Executor executor, a<TResult, TContinuationResult> aVar, c0<TContinuationResult> c0Var) {
        this.f1671a = executor;
        this.f1672b = aVar;
        this.f1673c = c0Var;
    }

    @Override // b1.z
    public final void a(h<TResult> hVar) {
        this.f1671a.execute(new m(this, hVar));
    }
}
