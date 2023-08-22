import java.io.DataInputStream;
import java.io.IOException;

public class B16497 {

    private static void solution() throws Exception {
        int n = nextInt();
        int[] arr = new int[32];
        while (n --> 0) {
            int a = nextInt();
            int b = nextInt();
            for (int i = a; i < b; i++) {
                arr[i]++;
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i]);
        System.out.println(max <= nextInt() ? 1 : 0);
    }

    public static void main(String[] args) throws Exception {
        initFI();
        solution();
    }

    private static final int DEFAULT_BUFFER_SIZE = 1 << 16;
    private static final int MAX_CHAR_LEN_FOR_NEXT_LINE = 20;
    private static DataInputStream inputStream;
    private static byte[] buffer;
    private static int curIdx, maxIdx;

    private static void initFI() {
        inputStream = new DataInputStream(System.in);
        buffer = new byte[DEFAULT_BUFFER_SIZE];
        curIdx = maxIdx = 0;
    }

    private static int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        return ret;
    }

    private static byte read() throws IOException {
        if (curIdx == maxIdx) {
            maxIdx = inputStream.read(buffer, curIdx = 0, DEFAULT_BUFFER_SIZE);
            if (maxIdx == -1) buffer[0] = -1;
        }
        return buffer[curIdx++];
    }
}