package Uebungen.Blatt_5.Blatt_5_1;

/**
 * Created by Konstantin on 17.06.2016.
 */
public class init {
    public static void main(String[] args) {
        Mahlzeiten start = new Mahlzeiten();
        start.addMeal("Lauch", "Das ist Lauch", true);
        start.addMeal("Lauch", "Das ist Lauch", true);
        start.addMeal("Lauch", "Das ist Lauch", true);
        start.addMeal("Lauch", "Das ist Lauch", true);
        start.addMeal("Lauch", "Das ist Lauch", true);
        start.addMeal("Lauch", "Das ist Lauch", true);

        start.addMeal("Fleisch", "Das ist Fleisch", false);
        start.addMeal("Fleisch", "Das ist Fleisch", false);
        start.addMeal("Fleisch", "Das ist Fleisch", false);
        start.addMeal("Fleisch", "Das ist Fleisch", false);
        start.addMeal("Fleisch", "Das ist Fleisch", false);

        start.showMeals();

    }
}
