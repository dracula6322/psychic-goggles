package green.square;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GlobalCoroutineExceptionHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    static public List<CoroutineExceptionHandler> coroutineExceptionHandlers = new ArrayList<>();

    static public void addCoroutineExceptionHandler(@NotNull CoroutineExceptionHandler coroutineExceptionHandler) {
        coroutineExceptionHandlers.add(coroutineExceptionHandler);
    }

    public GlobalCoroutineExceptionHandler() {
        super(CoroutineExceptionHandler.Key);
    }

    @Override
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable throwable) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : coroutineExceptionHandlers) {
            coroutineExceptionHandler.handleException(coroutineContext, throwable);
        }
    }
}