package functionininterface;

@FunctionalInterface
public interface PersonInterface<K, V> {
    V talk(K name);
}
