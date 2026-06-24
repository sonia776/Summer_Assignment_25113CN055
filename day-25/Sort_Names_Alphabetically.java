public class Sort_Names_Alphabetically {
    public static void main(String[] args) {

        String names[] = {"Sonia", "Rahul", "Aman", "Priya"};

        for (int i = 0; i < names.length - 1; i++) {

            for (int j = 0; j < names.length - 1 - i; j++) {

                if (names[j].compareTo(names[j + 1]) > 0) {

                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Names:");

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
