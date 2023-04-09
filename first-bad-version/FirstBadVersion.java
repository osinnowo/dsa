interface VersionControl {
    default boolean isBadVersion(int version) {
        return version == 4;
    }
}

public class FirstBadVersion implements VersionControl {
    public int firstBadVersion(int version) {
        int left = 1;
        int right = version;
        while(left < right) {
            int middle = left + (right - left) / 2;
            if(isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
