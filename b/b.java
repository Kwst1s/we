package b;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a<String[], Map<String, Boolean>> {
    /* renamed from: b */
    public Map<String, Boolean> a(int i5, Intent intent) {
        if (i5 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i6 = 0; i6 < length; i6++) {
            hashMap.put(stringArrayExtra[i6], Boolean.valueOf(intArrayExtra[i6] == 0));
        }
        return hashMap;
    }
}
