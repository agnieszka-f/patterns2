package patterns2.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"62091635476", "John", "Smith"},
            {"67010876534", "Ivone", "Nowak"},
            {"75071253423", "Jessie", "Pinkman"},
            {"75120123436", "Walter", "Smith"},
            {"75110387628", "Clara", "Lanson" }
    };
    private double[] salaries = {4500.00, 3700.00, 4350.00, 9000.00, 6200.00};

    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
