package convalida.annotations;

import android.support.annotation.StringRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * @author Wellington Costa on 25/04/18.
 */
public @interface BetweenValidation {

    @Target(FIELD)
    @Retention(SOURCE)
    @interface Start {

        int key();

        @StringRes int errorMessage();

        boolean autoDismiss() default true;

    }

    @Target(FIELD)
    @Retention(SOURCE)
    @interface End {

        int key();

        @StringRes int errorMessage();

        boolean autoDismiss() default true;

    }

}
