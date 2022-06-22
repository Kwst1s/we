package b1;

final class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1674b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ l f1675c;

    m(l lVar, h hVar) {
        this.f1675c = lVar;
        this.f1674b = hVar;
    }

    public final void run() {
        if (this.f1674b.k()) {
            this.f1675c.f1673c.t();
            return;
        }
        try {
            this.f1675c.f1673c.q(this.f1675c.f1672b.a(this.f1674b));
        } catch (f e5) {
            if (e5.getCause() instanceof Exception) {
                this.f1675c.f1673c.p((Exception) e5.getCause());
            } else {
                this.f1675c.f1673c.p(e5);
            }
        } catch (Exception e6) {
            this.f1675c.f1673c.p(e6);
        }
    }
}
