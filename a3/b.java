package a3;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f43a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44b;

    public b(int i5, int i6) {
        this.f43a = i5;
        this.f44b = i6;
    }

    public final int a() {
        return this.f44b;
    }

    public final int b() {
        return this.f43a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f43a == bVar.f43a && this.f44b == bVar.f44b;
    }

    public final int hashCode() {
        return this.f43a ^ this.f44b;
    }

    public final String toString() {
        return this.f43a + "(" + this.f44b + ')';
    }
}
