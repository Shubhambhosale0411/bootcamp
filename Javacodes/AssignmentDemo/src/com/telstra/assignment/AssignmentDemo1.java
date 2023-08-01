package com.telstra.assignment;


import java.util.*;

class Rating {
    String Id;
    int duration;
    double quality;
    String category;

    public Rating(String Id, int duration, double quality, String category) {
        this.Id = Id;
        this.duration = duration;
        this.quality = quality;
        this.category = category;
    }
}

public class AssignmentDemo1 {
	public static Rating[] rateCalls(int[] callD, double[] callQ) {
        if (callD == null || callQ == null || callD.length != callQ.length) {
            return null;
        }

        Rating[] solution = new Rating[callD.length];
        for (int i = 0; i < callD.length; i++) {
            String Id = "Call ID: [" + i + "]";
            int duration = callD[i];
            double quality = callQ[i];
            double solutioncore = quality / duration;
            String category;

            if (solutioncore >= 0.08) {
                category = "Excellent";
            } else if (solutioncore >= 0.05) {
                category = "Good";
            } else {
                category = "Average";
            }

            solution[i] = new Rating(Id, duration, quality, category);
        }

        return solution;
    }
	
	public static void main(String[] args) {
		int[] callD = {5, 10, 7, 8, 15};
        double[] callQ = {0.35, 0.48, 0.21, 0.12, 0.30};

        Rating[] solution = rateCalls(callD, callQ);

        for (Rating rating : solution) {
            System.out.println(rating.Id + ", Call Duration: " + rating.duration + " minutes, Call Quality: "
                    + rating.quality + ", Rating Category: " + rating.category);
        }
		
	}

}

