package convalida.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import androidx.annotation.StringRes;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * @author Wellington Costa on 31/05/18.
 */
@Target(FIELD)
@Retention(SOURCE)
public @interface CreditCardValidation {

    @StringRes int errorMessage();

    boolean autoDismiss() default true;

    boolean required() default true;

}
