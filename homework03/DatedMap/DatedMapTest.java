package homework03.DatedMap;

public class DatedMapTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------Put--------");
        DatedMap datedMap = new DatedMapImpl();
        datedMap.put("1", "one");
        datedMap.put("2", "two");
        datedMap.put("3", "three");
        Thread.sleep(1000); //чтобы заметить разницу времени при добавлении элементов
        datedMap.put("4", "four");
        datedMap.put("5", "five");
        System.out.println(datedMap);

        System.out.println("-------Get---------");
        System.out.println(datedMap.get("2"));
        System.out.println(datedMap.get("5"));
        System.out.println(datedMap.get("6"));

        System.out.println("--------ContainsKey--------");
        System.out.println(datedMap.containsKey("3"));
        System.out.println(datedMap.containsKey("6"));

        System.out.println("--------Remove--------");
        datedMap.remove("3");
        System.out.println(datedMap);

        System.out.println("--------KeySet--------");
        System.out.println(datedMap.keySet());

        System.out.println("-------GetKeyLastInsertionDate---------");
        System.out.println(datedMap.getKeyLastInsertionDate("1"));
        System.out.println(datedMap.getKeyLastInsertionDate("5"));
        System.out.println(datedMap.getKeyLastInsertionDate("3"));
    }
}
