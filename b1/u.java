package b1;

final class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1693b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t f1694c;

    u(t tVar, h hVar) {
        this.f1694c = tVar;
        this.f1693b = hVar;
    }

    public final void run() {
        synchronized (this.f1694c.f1691b) {
            if (this.f1694c.f1692c != null) {
                this.f1694c.f1692c.d(this.f1693b.i());
            }
        }
    }
}
