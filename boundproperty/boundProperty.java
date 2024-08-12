package boundproperty;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class boundProperty {
    public static void main(String[] args){
        LiveScoreBean score = new LiveScoreBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        score.addPropertyChangeListener(listener1);
        score.addPropertyChangeListener(listener2);
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            score.setScoreLine(input);
        }

        scanner.close();
    }
}
