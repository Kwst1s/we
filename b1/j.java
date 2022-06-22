package b1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f1659a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f1660b = new b0();

    private static final class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f1661a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f1661a.post(runnable);
        }
    }
}
