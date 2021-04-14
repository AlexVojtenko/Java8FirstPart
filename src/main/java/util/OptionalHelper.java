package util;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalHelper {

    public Optional returnOptional(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return Optional.of(email);
        } else {
            return Optional.empty();
        }
    }
}
