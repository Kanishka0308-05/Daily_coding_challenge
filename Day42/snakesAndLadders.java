class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n * n + 1];

        queue.offer(1);
        visited[1] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == n * n) {
                    return moves;
                }

                for (int dice = 1; dice <= 6; dice++) {
                    int next = current + dice;

                    if (next > n * n) {
                        break;
                    }

                    int[] position = getPosition(next, n);
                    int row = position[0];
                    int col = position[1];

                    // Snake or ladder
                    if (board[row][col] != -1) {
                        next = board[row][col];
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }

            moves++;
        }

        return -1;
    }

    private int[] getPosition(int square, int n) {
        int row = n - 1 - (square - 1) / n;
        int col = (square - 1) % n;

        // Reverse column for alternate rows
        if ((n - row) % 2 == 0) {
            col = n - 1 - col;
        }

        return new int[]{row, col};
    }
}