package patterns2.patterns2.adapter.company;

import patterns2.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import patterns2.patterns2.adapter.company.newhrsystem.Employee;
import patterns2.patterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor companySalaryProcessor = new CompanySalaryProcessor();
        return companySalaryProcessor.calculateSalaries(employees);
    }
}
