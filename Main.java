public class Main {
    public static void main(String[] args) throws Exception {
        TimetoConvert(13);
        NumDisciplestoConvert(50);
    }

    public static double TimetoConvert(int numDisciples) {
        long population = 7700000000L;
        double result = 3*(Math.log(population/numDisciples))/Math.log(3);
        System.out.println("Number of years it would take for 13 disciples to covert entire population: " + result);
        return result;
    }

    public static double NumDisciplestoConvert(float years) {
        long population = 7700000000L;
        float div = years/3;
        double power = Math.pow(3, div);
        double result = population/power;
        System.out.println("How many disciples it would take to convert entire population in 50 years: " + result);
        return result;
    }
}
