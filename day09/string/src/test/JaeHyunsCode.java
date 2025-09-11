package test;

public class JaeHyunsCode {
    public static void main(String[] args) {
        String string = "1234567890";
        int nLength = string.length();
        StringBuffer stringBuffer = new StringBuffer(string);
        int nNumber = Integer.parseInt(string);
        int nCount = 1;
        for (int i = 0; i < nCount; i++) {
            if (nNumber / 1000 > 0) {
                nNumber /= 1000;
                System.out.println(nNumber);
                nCount++;
            }
        }
        // ,(컴마가 몇개 필요한지)

        int nReplaceCount = nCount - 1;

        int[] nArrLocation = new int[nReplaceCount];
        for (int i = 0; i < nArrLocation.length; i++) {
            nLength -= 3;
            nArrLocation[i] = nLength;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(stringBuffer.insert(nArrLocation[i], ','));
        }

    }
}
