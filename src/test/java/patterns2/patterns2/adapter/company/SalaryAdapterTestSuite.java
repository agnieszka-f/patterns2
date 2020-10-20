package patterns2.patterns2.adapter.company;

import org.junit.Assert;
import org.junit.Test;
import patterns2.patterns2.adapter.company.oldhrsystem.Workers;

public class SalaryAdapterTestSuite {
    @Test
    public void test1(){
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());
        //Then
        Assert.assertEquals(27750, totalSalary,0);
    }
}
