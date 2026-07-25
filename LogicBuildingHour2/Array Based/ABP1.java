class ABP1 {

    // Make Result static so it can be used inside main()
    public static class Result {
        public int output1;
        public int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public Result decreasingSeq(int[] input1, int input2) {
        int count = 0;
        int maxLen = 0;
        int currLen = 1;

        if (input2 < 2) {
            return new Result(0, 0);
        }

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                currLen++;
            } else {
                if (currLen > 1) {
                    count++;
                    if (currLen > maxLen) {
                        maxLen = currLen;
                    }
                }
                currLen = 1;
            }
        }

        // Check the last decreasing sequence
        if (currLen > 1) {
            count++;
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }

        return new Result(count, maxLen);
    }

    public static void main(String[] args) {
        ABP1 obj = new ABP1();

        int[] arr = {9, 7, 5, 8, 6, 4, 2, 10};

        Result res = obj.decreasingSeq(arr, arr.length);

        System.out.println("Number of decreasing sequences = " + res.output1);
        System.out.println("Maximum sequence length = " + res.output2);
    }
}