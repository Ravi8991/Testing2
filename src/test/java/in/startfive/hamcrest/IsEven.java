package in.startfive.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class IsEven extends TypeSafeDiagnosingMatcher<Integer> {
   @Override
   protected boolean matchesSafely(Integer integer, Description description) {
       description.appendText("was ").appendValue(integer).appendText(", which is an Odd number");
       return integer % 2 == 0;
   }
 
   @Override
   public void describeTo(Description description) {
       description.appendText("An Even number");
   }
 
   public static IsEven isEven() {
       return new IsEven();
   }

}