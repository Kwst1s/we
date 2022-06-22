package b1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import y0.b;

/* access modifiers changed from: package-private */
public final class c0<TResult> extends h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1650a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final a0<TResult> f1651b = new a0<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f1652c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f1653d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f1654e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f1655f;

    c0() {
    }

    private final void u() {
        b.h(this.f1652c, "Task is not yet complete");
    }

    private final void v() {
        b.h(!this.f1652c, "Task is already complete");
    }

    private final void w() {
        if (this.f1653d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        synchronized (this.f1650a) {
            if (this.f1652c) {
                this.f1651b.a(this);
            }
        }
    }

    @Override // b1.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f1651b.b(new p(executor, bVar));
        x();
        return this;
    }

    @Override // b1.h
    public final h<TResult> b(c<TResult> cVar) {
        return c(j.f1659a, cVar);
    }

    @Override // b1.h
    public final h<TResult> c(Executor executor, c<TResult> cVar) {
        this.f1651b.b(new r(executor, cVar));
        x();
        return this;
    }

    @Override // b1.h
    public final h<TResult> d(Executor executor, d dVar) {
        this.f1651b.b(new t(executor, dVar));
        x();
        return this;
    }

    @Override // b1.h
    public final h<TResult> e(Executor executor, e<? super TResult> eVar) {
        this.f1651b.b(new v(executor, eVar));
        x();
        return this;
    }

    @Override // b1.h
    public final <TContinuationResult> h<TContinuationResult> f(a<TResult, TContinuationResult> aVar) {
        return g(j.f1659a, aVar);
    }

    @Override // b1.h
    public final <TContinuationResult> h<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> aVar) {
        c0 c0Var = new c0();
        this.f1651b.b(new l(executor, aVar, c0Var));
        x();
        return c0Var;
    }

    @Override // b1.h
    public final <TContinuationResult> h<TContinuationResult> h(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        c0 c0Var = new c0();
        this.f1651b.b(new n(executor, aVar, c0Var));
        x();
        return c0Var;
    }

    @Override // b1.h
    public final Exception i() {
        Exception exc;
        synchronized (this.f1650a) {
            exc = this.f1655f;
        }
        return exc;
    }

    @Override // b1.h
    public final TResult j() {
        TResult tresult;
        synchronized (this.f1650a) {
            u();
            w();
            if (this.f1655f == null) {
                tresult = this.f1654e;
            } else {
                throw new f(this.f1655f);
            }
        }
        return tresult;
    }

    @Override // b1.h
    public final boolean k() {
        return this.f1653d;
    }

    @Override // b1.h
    public final boolean l() {
        boolean z5;
        synchronized (this.f1650a) {
            z5 = this.f1652c;
        }
        return z5;
    }

    @Override // b1.h
    public final boolean m() {
        boolean z5;
        synchronized (this.f1650a) {
            z5 = this.f1652c && !this.f1653d && this.f1655f == null;
        }
        return z5;
    }

    @Override // b1.h
    public final <TContinuationResult> h<TContinuationResult> n(g<TResult, TContinuationResult> gVar) {
        return o(j.f1659a, gVar);
    }

    @Override // b1.h
    public final <TContinuationResult> h<TContinuationResult> o(Executor executor, g<TResult, TContinuationResult> gVar) {
        c0 c0Var = new c0();
        this.f1651b.b(new x(executor, gVar, c0Var));
        x();
        return c0Var;
    }

    public final void p(Exception exc) {
        b.g(exc, "Exception must not be null");
        synchronized (this.f1650a) {
            v();
            this.f1652c = true;
            this.f1655f = exc;
        }
        this.f1651b.a(this);
    }

    public final void q(TResult tresult) {
        synchronized (this.f1650a) {
            v();
            this.f1652c = true;
            this.f1654e = tresult;
        }
        this.f1651b.a(this);
    }

    public final boolean r(Exception exc) {
        b.g(exc, "Exception must not be null");
        synchronized (this.f1650a) {
            if (this.f1652c) {
                return false;
            }
            this.f1652c = true;
            this.f1655f = exc;
            this.f1651b.a(this);
            return true;
        }
    }

    public final boolean s(TResult tresult) {
        synchronized (this.f1650a) {
            if (this.f1652c) {
                return false;
            }
            this.f1652c = true;
            this.f1654e = tresult;
            this.f1651b.a(this);
            return true;
        }
    }

    public final boolean t() {
        synchronized (this.f1650a) {
            if (this.f1652c) {
                return false;
            }
            this.f1652c = true;
            this.f1653d = true;
            this.f1651b.a(this);
            return true;
        }
    }
}
