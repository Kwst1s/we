package b1;

import java.util.concurrent.Executor;

final class b0 implements Executor {
    b0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
