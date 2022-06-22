package b1;

final class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p f1684b;

    q(p pVar) {
        this.f1684b = pVar;
    }

    public final void run() {
        synchronized (this.f1684b.f1682b) {
            if (this.f1684b.f1683c != null) {
                this.f1684b.f1683c.c();
            }
        }
    }
}
