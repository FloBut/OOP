package fitnessApp;

public class Product {
    //declar parametrii clasei
    String name;
    double fats;
    double carbs;
    double proteins;
    double calories;

    //initializez variablele in constructorul clasei
    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.calories = computeCalories(fats, carbs, proteins); // apelez metoda cu care calculez numarul de calorii
        //iar valoarea returnata o retin in variabila calories
    }
    //declar metoda in care voi calcula nr total de calorii pe baza parametrilor pe care ii dau in metoda

    public static double computeCalories(double fats, double carbs, double proteines) {
        double calories = 0;
        calories = (9 * fats) + (4 * carbs) + (4 * proteines);
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", fats=" + fats +
                ", carbs=" + carbs +
                ", proteins=" + proteins +
                ", calories=" + calories +
                '}';
    }
}
