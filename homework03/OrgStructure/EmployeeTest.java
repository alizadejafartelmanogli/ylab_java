package homework03.OrgStructure;

import java.io.File;
import java.io.IOException;

public class EmployeeTest {
    public static void main(String[] args) throws IOException {
        OrgStructureParserImpl orgStructureParser = new OrgStructureParserImpl();
        Employee boss = orgStructureParser.parseStructure(new File("src\\homework03\\OrgStructure\\employyes.csv"));
        System.out.println(boss.toString());
    }
}
