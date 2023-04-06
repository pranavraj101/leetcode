class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0, totalGas = 0, remainingGas = 0;
        for (int i = 0; i < n; i++) {
            remainingGas += gas[i] - cost[i];
            if (remainingGas < 0) {
                start = i + 1;
                totalGas += remainingGas;
                remainingGas = 0;
            }
            totalGas += gas[i] - cost[i];
        }
        return (totalGas + remainingGas >= 0) ? start : -1;
    }
}