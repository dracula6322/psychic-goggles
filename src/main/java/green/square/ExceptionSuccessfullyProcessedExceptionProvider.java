package green.square;

import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("KotlinInternalInJava")
class ExceptionSuccessfullyProcessedExceptionProvider {

    @NotNull
    static public Throwable get() {
        return ExceptionSuccessfullyProcessed.INSTANCE;
    }
}
