package homework03.OrgStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrgStructureParserImpl implements OrgStructureParser {


    @Override
    public Employee parseStructure(File csvFile) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(csvFile.getAbsolutePath()));
        List<String> lineList = csvReader.lines().toList();
        List<Employee> employeeList = new ArrayList<>();
        lineList.forEach(line -> {
            String[] lineMas = line.split(";");
            Employee employee = new Employee();
            employee.setId(Long.valueOf(lineMas[0]));
            if (lineMas[1].equals("")) {
                employee.setBossId(0L);
            } else {
                employee.setBossId(Long.valueOf(lineMas[1]));
            }
            employee.setName(lineMas[2]);
            employee.setPosition(lineMas[3]);
            employeeList.add(employee);
        });
        for (int i = 0; i < employeeList.size(); i++) {
            for (int j = 1; j < employeeList.size(); j++) {
                if (employeeList.get(j).getBossId().equals(employeeList.get(i).getId())) {
                    employeeList.get(i).getSubordinate().add(employeeList.get(j));
                    employeeList.get(j).setBoss(employeeList.get(i));
                }
            }
        }
        csvReader.close();
        return employeeList.stream().filter(employee -> employee.getBossId() == 0L).findFirst().get();
    }
}
