package labexample;

public class ExpressCalculatorCaller {

    public static void main(String[] args) {

		/**
		 * Static key word allows us to do class level access
         */
        ExpressCalculator.add(1, 2);

        ExpressCalculator.sub(10, 3);

        ExpressCalculator.times(10, 3);

        ExpressCalculator.div(20, 4);

        ExpressCalculator.div(20, 0);
    }
}
