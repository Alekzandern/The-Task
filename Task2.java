public class Task2 {
    public static class Main {
        public static void main(String[] args) {
            System.out.println("Task2");
            String name = "Vyacheslav";
            String nameInsert = String.valueOf(5);

            if (name == String.valueOf(nameInsert)) {
                System.out.println("Привет Вячеслав");
            } else {
                boolean b = name != String.valueOf(nameInsert);
                {
                    System.out.println("Нет такого имени");
                }
            }
        }
    }
}
