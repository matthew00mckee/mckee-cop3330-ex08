/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_08;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[]args){
        System.out.print("How many people are there?");
        Scanner input = new Scanner(System.in);
        String numPeopleStr = input.next();
        int numPeople = Integer.parseInt(numPeopleStr);

        System.out.print("How many pizzas are there?");
        String numPizzasStr = input.next();
        int numPizzas = Integer.parseInt(numPizzasStr);

        System.out.print("How many slices per pizza?");
        String numSlicesStr = input.next();
        int numSlices = Integer.parseInt(numSlicesStr);

        int totalSlices= numSlices*numPizzas;
        int SlicesPerPerson = totalSlices/numPeople;
        int SlicesLeft = totalSlices % numPeople;

        System.out.print(numPeople+" people with "+numPizzas+" pizzas ("+totalSlices+" slices)\n");
        System.out.print("Each person gets "+ SlicesPerPerson+ " slices of pizza\n");
        System.out.print("There are "+ SlicesLeft+ " slices left");

    }
}
