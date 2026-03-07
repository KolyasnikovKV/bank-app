package ru.yandex.practicum.account.service;

import io.micrometer.tracing.Tracer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class BaseService {

    private final Tracer tracer;

    protected <T> T callDbAndTraceIt(Supplier<T> runnable, String traceName) {
        var span = tracer.nextSpan().remoteServiceName("postgre-db").name(traceName).start();
        try {
            return runnable.get();
        } finally {
            span.end();
        }
    }


    protected void callDbAndTraceItVoid(Runnable runnable, String traceName) {
        var span = tracer.nextSpan().remoteServiceName("postgre-db").name(traceName).start();
        try {
            runnable.run();
        } finally {
            span.end();
        }
    }
}
