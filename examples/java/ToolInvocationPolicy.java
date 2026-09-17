package examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * A small, dependency-free allow-list for tool execution.
 *
 * <p>Build this policy from verified server-side identity and authorization data.
 * Do not construct it from model output or unverified HTTP headers.</p>
 */
public final class ToolInvocationPolicy {
    private final Map<String, Set<String>> grants;

    public ToolInvocationPolicy(Map<String, ? extends Collection<String>> grants) {
        Objects.requireNonNull(grants, "grants");
        Map<String, Set<String>> copy = new HashMap<>();

        grants.forEach((principal, tools) -> {
            String safePrincipal = required(principal, "principal");
            Objects.requireNonNull(tools, "tools");
            Set<String> safeTools = new HashSet<>();
            for (String tool : tools) {
                safeTools.add(required(tool, "tool"));
            }
            copy.put(safePrincipal, Set.copyOf(safeTools));
        });
        this.grants = Map.copyOf(copy);
    }

    public boolean permits(String principal, String tool) {
        Set<String> tools = grants.get(principal);
        return tools != null && tools.contains(tool);
    }

    private static String required(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value.trim();
    }
}
