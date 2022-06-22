package b1;

final class s implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f1688b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r f1689c;

    s(r rVar, h hVar) {
        this.f1689c = rVar;
        this.f1688b = hVar;
    }

    public final void run() {
        synchronized (this.f1689c.f1686b) {
            if (this.f1689c.f1687c != null) {
                this.f1689c.f1687c.a(this.f1688b);
            }
        }
    }
}
