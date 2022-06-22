package b1;

import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class k {

    private static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f1662a;

        private a() {
            this.f1662a = new CountDownLatch(1);
        }

        /* synthetic */ a(d0 d0Var) {
            this();
        }

        public final void a() {
            this.f1662a.await();
        }

        @Override // b1.e
        public final void b(Object obj) {
            this.f1662a.countDown();
        }

        @Override // b1.b
        public final void c() {
            this.f1662a.countDown();
        }

        @Override // b1.d
        public final void d(Exception exc) {
            this.f1662a.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    public interface b extends b, d, e<Object> {
    }

    /* access modifiers changed from: private */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f1663a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private final int f1664b;

        /* renamed from: c  reason: collision with root package name */
        private final c0<Void> f1665c;

        /* renamed from: d  reason: collision with root package name */
        private int f1666d;

        /* renamed from: e  reason: collision with root package name */
        private int f1667e;

        /* renamed from: f  reason: collision with root package name */
        private int f1668f;

        /* renamed from: g  reason: collision with root package name */
        private Exception f1669g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1670h;

        public c(int i5, c0<Void> c0Var) {
            this.f1664b = i5;
            this.f1665c = c0Var;
        }

        private final void a() {
            if (this.f1666d + this.f1667e + this.f1668f != this.f1664b) {
                return;
            }
            if (this.f1669g != null) {
                c0<Void> c0Var = this.f1665c;
                int i5 = this.f1667e;
                int i6 = this.f1664b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i5);
                sb.append(" out of ");
                sb.append(i6);
                sb.append(" underlying tasks failed");
                c0Var.p(new ExecutionException(sb.toString(), this.f1669g));
            } else if (this.f1670h) {
                this.f1665c.t();
            } else {
                this.f1665c.q(null);
            }
        }

        @Override // b1.e
        public final void b(Object obj) {
            synchronized (this.f1663a) {
                this.f1666d++;
                a();
            }
        }

        @Override // b1.b
        public final void c() {
            synchronized (this.f1663a) {
                this.f1668f++;
                this.f1670h = true;
                a();
            }
        }

        @Override // b1.d
        public final void d(Exception exc) {
            synchronized (this.f1663a) {
                this.f1667e++;
                this.f1669g = exc;
                a();
            }
        }
    }

    public static <TResult> TResult a(h<TResult> hVar) {
        y0.b.d();
        y0.b.g(hVar, "Task must not be null");
        if (hVar.l()) {
            return (TResult) i(hVar);
        }
        a aVar = new a(null);
        h(hVar, aVar);
        aVar.a();
        return (TResult) i(hVar);
    }

    public static <TResult> h<TResult> b(Callable<TResult> callable) {
        return c(j.f1659a, callable);
    }

    public static <TResult> h<TResult> c(Executor executor, Callable<TResult> callable) {
        y0.b.g(executor, "Executor must not be null");
        y0.b.g(callable, "Callback must not be null");
        c0 c0Var = new c0();
        executor.execute(new d0(c0Var, callable));
        return c0Var;
    }

    public static <TResult> h<TResult> d(Exception exc) {
        c0 c0Var = new c0();
        c0Var.p(exc);
        return c0Var;
    }

    public static <TResult> h<TResult> e(TResult tresult) {
        c0 c0Var = new c0();
        c0Var.q(tresult);
        return c0Var;
    }

    public static h<Void> f(Collection<? extends h<?>> collection) {
        if (collection.isEmpty()) {
            return e(null);
        }
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull((h) it.next(), "null tasks are not accepted");
        }
        c0 c0Var = new c0();
        c cVar = new c(collection.size(), c0Var);
        Iterator<? extends h<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            h((h) it2.next(), cVar);
        }
        return c0Var;
    }

    public static h<Void> g(Task<?>... taskArr) {
        return taskArr.length == 0 ? e(null) : f(Arrays.asList(taskArr));
    }

    private static void h(h<?> hVar, b bVar) {
        Executor executor = j.f1660b;
        hVar.e(executor, bVar);
        hVar.d(executor, bVar);
        hVar.a(executor, bVar);
    }

    private static <TResult> TResult i(h<TResult> hVar) {
        if (hVar.m()) {
            return hVar.j();
        }
        if (hVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.i());
    }
}
