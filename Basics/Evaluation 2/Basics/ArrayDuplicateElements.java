class ArrayDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1, 3, 1};
        int n = arr.length;

        System.out.print("Duplicate elements: ");

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < n; j++) {
                    
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (isDuplicate) {
                    System.out.print(arr[i] + " ");u
                }
            }
        }
    }
}
