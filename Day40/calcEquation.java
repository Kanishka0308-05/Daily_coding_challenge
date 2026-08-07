class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values,
                                 List<List<String>> queries) {

        Map<String, Map<String, Double>> graph = new HashMap<>();

        // Build graph
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double value = values[i];

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, value);
            graph.get(b).put(a, 1.0 / value);
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);

            if (!graph.containsKey(src) || !graph.containsKey(dest)) {
                ans[i] = -1.0;
            } else if (src.equals(dest)) {
                ans[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                ans[i] = dfs(graph, src, dest, 1.0, visited);
            }
        }

        return ans;
    }

    private double dfs(Map<String, Map<String, Double>> graph,
                       String curr,
                       String target,
                       double product,
                       Set<String> visited) {

        if (curr.equals(target)) {
            return product;
        }

        visited.add(curr);

        for (String neighbor : graph.get(curr).keySet()) {
            if (!visited.contains(neighbor)) {
                double result = dfs(
                        graph,
                        neighbor,
                        target,
                        product * graph.get(curr).get(neighbor),
                        visited
                );

                if (result != -1.0) {
                    return result;
                }
            }
        }

        return -1.0;
    }
}