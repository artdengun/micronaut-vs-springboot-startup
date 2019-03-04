package hello.mn;

import io.micronaut.core.version.VersionUtils;
import io.micronaut.runtime.Micronaut;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(":: Micronaut :: ("+VersionUtils.MICRONAUT_VERSION+") - " + LocalDateTime.now());
        Micronaut.run(Application.class);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println(":: Micronaut :: DONE - " + LocalDateTime.now() + " - duration: " + duration + " ms");
    }
}

