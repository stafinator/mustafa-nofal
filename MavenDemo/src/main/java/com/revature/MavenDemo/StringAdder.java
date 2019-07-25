package com.revature.MavenDemo;

public class StringAdder {

	public StringAdder() {

	}

	// "1,2,3,4 is the format. Desired length is two, will return the values added
	// together
	public Double add(String s) throws Exception {
		Double sum = 0.0;
		if (s == null || s.equals("")) {
			return 0.0;
		} else {
			String[] numbers = s.split(",");
			if (numbers.length > 2) {
				throw new Exception("too many or two few values");
			} else {
				try {

					sum = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
				} catch (Exception e) {
					throw new Exception("invalid input");
				}
			}
		}

		return sum;
	}

}
