class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matrix = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            int rowIdx = -1;
            int minCount = Integer.MAX_VALUE;
            for (int i = 0; i < matrix.size(); i++) {
                List<Integer> row = matrix.get(i);
                if (!row.contains(num)) {
                    int count = counts.getOrDefault(i, 0);
                    if (count < minCount) {
                        minCount = count;
                        rowIdx = i;
                    }
                }
            }
            if (rowIdx == -1) {
                matrix.add(new ArrayList<>());
                rowIdx = matrix.size() - 1;
            }
            matrix.get(rowIdx).add(num);
            counts.put(rowIdx, counts.getOrDefault(rowIdx, 0) + 1);
        }
        return matrix;
    }
}
