package q888a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

  public static <T> List<T> concatenate(List<List<T>> lists) {
    return lists
        .stream()
        .reduce(Collections.emptyList(), (first, second) -> {
          List<T> result = new ArrayList<>(first);
          result.addAll(second);
          return result;
        });
  }

  public static <S, T> List<ImmutablePair<Optional<S>, Optional<T>>> zip(List<S> first,
      List<T> second) {
    return IntStream
        .range(0, Math.max(first.size(), second.size()))
        .mapToObj(item -> new ImmutablePair<Optional<S>, Optional<T>>(
            item < first.size() ? Optional.of(first.get(item)) : Optional.empty(),
            item < second.size() ? Optional.of(second.get(item)) : Optional.empty()))
        .collect(Collectors.toList());
  }

  public static <S, T> List<ImmutablePair<S, T>> flatten(List<ImmutablePair<Optional<S>,
      Optional<T>>> maybePairs, S defaultS, T defaultT) {
    return maybePairs
        .stream()
        .map(item -> new ImmutablePair<>(item.getFirst()
            .orElse(defaultS), item.getSecond().orElse(defaultT)))
        .collect(Collectors.toList());
  }
}
