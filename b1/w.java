package b1;

final class w implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1698b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v f1699c;

    w(v vVar, h hVar) {
        this.f1699c = vVar;
        this.f1698b = hVar;
    }

    public final void run() {
        synchronized (this.f1699c.f1696b) {
            if (this.f1699c.f1697c != null) {
                this.f1699c.f1697c.b(this.f1698b.j());
            }
        }
    }
}
